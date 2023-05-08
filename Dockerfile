# Allows you to run this addon's app easily as a docker container.
# See README.md for more details.
#
# 1. Build the image with: docker build --no-cache -t test/breeze-theme:latest .
# 2. Run the image with: docker run --rm -ti -p8080:8080 test/breeze-theme
#
# Uses Docker Multi-stage builds: https://docs.docker.com/build/building/multi-stage/

# The "Build" stage. Copies the entire project into the container, into the /app/ folder, and builds it.
# The app is actually packaged in src/test/java, so we need to run couple of specialized steps.
FROM eclipse-temurin:17 AS BUILD
COPY . /app/
WORKDIR /app/
# 1. Need to copy all routes to src/main/java otherwise Vaadin plugin won't include JS files into webpack build for all components.
# Workaround for https://github.com/vaadin/flow/issues/14732
RUN cp -r src/test/java/* src/main/java/
RUN cp -r src/test/resources/* src/main/resources/
# 2. Turn all test dependencies into compile deps, so that test files copied to src/main/java/ are compilable.
RUN sed -i 's_<scope>test</scope>_<!-- -->_g' pom.xml
# 3. Finally, build the app
ARG offlinekey
ENV VAADIN_OFFLINE_KEY=$offlinekey
RUN ./mvnw -C clean package -Pproduction -DskipTests
# Prepare a folder with dependencies
RUN ./mvnw dependency:copy-dependencies -DoutputDirectory=target/deps

# At this point, we have the app as follows:
# 1. All jar deps are at /app/target/deps/*.jar
# 2. We also need to add /app/target/classes/ and /app/target/test-classes/ onto classpath, to include the app itself.


# The "Run" stage. Start with a clean image, and copy over just the app itself, omitting gradle, npm and any intermediate build files.
FROM eclipse-temurin:17
COPY --from=BUILD /app/target/deps /app/
COPY --from=BUILD /app/target/classes /app/classes
COPY --from=BUILD /app/target/test-classes /app/test-classes
WORKDIR /app/
RUN ls -la
SHELL ["/bin/bash", "-c"]
RUN echo $'#!/bin/bash\n\
set -e -o pipefail\n\
CP=`ls *.jar|tr \'\\n\' \':\'`\n\
java -cp "classes:test-classes:$CP" com.example.application.Application' >/app/run
RUN chmod a+x /app/run
EXPOSE 8080
ENTRYPOINT ./run
