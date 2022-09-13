package com.example.application.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Text Field")
@Route(value = "text-field", layout = MainLayout.class)
public class TextFieldView extends VerticalLayout {
    public TextFieldView() {
        add(new H4("Variations"));

        TextField basic = new TextField();
        basic.setPlaceholder("Basic");

        TextField leadingContent = new TextField();
        leadingContent.setPrefixComponent(new Div(new Text("EUR €")));
        leadingContent.setPlaceholder("Leading content");

        HorizontalLayout variationLayout = new HorizontalLayout(basic, leadingContent);
        add(variationLayout);

        add(new H4("Labeling"));
        TextField noLabel = new TextField();
        noLabel.setPlaceholder("No label");

        TextField topLabel = new TextField();
        topLabel.setLabel("Top Label");
        topLabel.setPlaceholder("Placeholder");

        TextField inlineLabel = new TextField();
        inlineLabel.setLabel("Inline Label");
        inlineLabel.setPlaceholder("Placeholder");

        HorizontalLayout labelingLayout = new HorizontalLayout(noLabel, topLabel, inlineLabel);
        labelingLayout.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.END);
        add(labelingLayout);

        add(new H4("Supportive text"));
        TextField supportiveText = new TextField();
        supportiveText.setLabel("Top Label");
        supportiveText.setHelperText("Supportive text");
        supportiveText.setPlaceholder("Placeholder");
        add(supportiveText);

        add(new H4("Clearable"));
        TextField clearable = new TextField();
        clearable.setClearButtonVisible(true);
        clearable.setValue("Value");
        add(clearable);

        add(new H4("Size"));

        TextField large = new TextField();
        large.setLabel("Large");
        large.setClearButtonVisible(true);
        large.setPlaceholder("Placeholder");

        TextField medium = new TextField();
        medium.setLabel("Medium");
        medium.setClearButtonVisible(true);
        medium.setPlaceholder("Placeholder");

        TextField small = new TextField();
        small.setLabel("Large");
        small.setClearButtonVisible(true);
        small.setPlaceholder("Placeholder");

        HorizontalLayout sizeLayout = new HorizontalLayout(large, medium, small);
        add(sizeLayout);

        add(new H4("Status"));
//        add status here
    }
}
