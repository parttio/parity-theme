# Parity Theme for Vaadin

This project provides a Vaadin Theme inspired by the [Goldman Sachs Design System](https://design.gs.com/home).
The theme is originally built by Daniel Sarkwa, a UX designer working at Vaadin.

To install this add-on, check out the latest version and Maven/Gradle dependency snippets from the [Directory](https://vaadin.com/directory).

Then change your theme annotation to use Parity: `@Theme("parity")`

To make changes on top of the Parity theme, load project styles located in the "frontend" directory with `@CssImport("./themes/myapp/styles.css")`

## Running the test application

To run the project during development, 
import it to your IDE and run the main method of the 
Application class in src/test/java/com/example/application

## Cutting releases

Use `mvn release:prepare release:perform`. This will automatically tag release and build it to target/checkout/target. Then upload to the Directory.
