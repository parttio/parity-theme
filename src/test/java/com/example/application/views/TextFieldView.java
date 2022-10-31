package com.example.application.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
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

        TextField trailingContent = new TextField();
        trailingContent.setSuffixComponent(new Div(new Text("EUR €")));
        trailingContent.setPlaceholder("Trailing content");

        HorizontalLayout variationLayout = new HorizontalLayout(basic, leadingContent, trailingContent);
        add(variationLayout);

        add(new H4("Labeling"));
        TextField noLabel = new TextField();
        noLabel.setPlaceholder("No label");

        TextField topLabel = new TextField();
        topLabel.setLabel("Top Label");
        topLabel.setPlaceholder("Eg: AB-XTXT-XTXT-XXT");

        TextField inlineLabel = new TextField();
        inlineLabel.setLabel("Inline Label");
        inlineLabel.setPlaceholder("Eg: AB-XTXT-XTXT-XXT");

        HorizontalLayout labelingLayout = new HorizontalLayout(noLabel, topLabel, inlineLabel);
        labelingLayout.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.END);
        add(labelingLayout);

        add(new H4("Icons"));

        TextField leadingIcon = new TextField();
        leadingIcon.setPlaceholder("Leading icon");
        leadingIcon.setPrefixComponent(VaadinIcon.CALENDAR_BRIEFCASE.create());

        TextField trailingIcon = new TextField();
        trailingIcon.setPlaceholder("Trailing icon");
        trailingIcon.setSuffixComponent(VaadinIcon.CALENDAR_BRIEFCASE.create());

        HorizontalLayout Icons = new HorizontalLayout(leadingIcon, trailingIcon);
        add(Icons);

        add(new H4("Supportive text"));
        TextField supportiveText = new TextField();
        supportiveText.setHelperText("Supportive text");
        supportiveText.setPlaceholder("Placeholder");

        TextField topSupportiveText = new TextField();
        topSupportiveText.addThemeVariants(TextFieldVariant.LUMO_HELPER_ABOVE_FIELD);
        topSupportiveText.setHelperText("Top supportive text");
        topSupportiveText.setPlaceholder("Placeholder");

        HorizontalLayout supportiveTextLayout = new HorizontalLayout(supportiveText, topSupportiveText);
        add(supportiveTextLayout);

        add(new H4("Clearable"));
        TextField clearable = new TextField();
        clearable.setClearButtonVisible(true);
        clearable.setValue("Value");
        add(clearable);

        add(new H4("Read-Only"));
        TextField readOnly = new TextField();
        readOnly.setReadOnly(true);
        readOnly.setLabel("Read-only");
        readOnly.setValue("Value");
        add(readOnly);

        add(new H4("Size"));

        TextField large = new TextField();
        large.addThemeName("large");
        large.setLabel("Large");
        large.setClearButtonVisible(true);
        large.setPlaceholder("Eg: AB-XTXT-XTXT-XXT");

        TextField largeLeadingContent = new TextField();
        largeLeadingContent.addThemeName("large");
        largeLeadingContent.setLabel("Leading content");
        largeLeadingContent.setPrefixComponent(new Div(new Text("EUR €")));
        largeLeadingContent.setClearButtonVisible(true);
        largeLeadingContent.setPlaceholder("40-XXT-XXT");

        HorizontalLayout largeLabelSizeLayout = new HorizontalLayout(large, largeLeadingContent);
        add(largeLabelSizeLayout);

        TextField largeClearable = new TextField();
        largeClearable.addThemeName("large");
        largeClearable.setClearButtonVisible(true);
        largeClearable.setValue("Value");

        TextField largeLeadingIcon = new TextField();
        largeLeadingIcon.addThemeName("large");
        largeLeadingIcon.setPlaceholder("Leading icon");
        largeLeadingIcon.setPrefixComponent(VaadinIcon.CALENDAR_BRIEFCASE.create());

        HorizontalLayout largeSizeLayout = new HorizontalLayout(largeClearable, largeLeadingIcon);
        add(largeSizeLayout);

        TextField largeSupportiveText = new TextField();
        largeSupportiveText.addThemeName("large");
        largeSupportiveText.setHelperText("Large supportive text");
        largeSupportiveText.setPlaceholder("Placeholder");
        add(largeSupportiveText);

        TextField medium = new TextField();
        medium.setLabel("Medium");
        medium.setClearButtonVisible(true);
        medium.setPlaceholder("Placeholder");
        add(medium);

        TextField small = new TextField();
        small.addThemeVariants(TextFieldVariant.LUMO_SMALL);
        small.setLabel("Small");
        small.setClearButtonVisible(true);
        small.setPlaceholder("Placeholder");

        TextField smallLeadingContent = new TextField();
        smallLeadingContent.addThemeVariants(TextFieldVariant.LUMO_SMALL);
        smallLeadingContent.setLabel("Leading content");
        smallLeadingContent.setPrefixComponent(new Div(new Text("EUR €")));
        smallLeadingContent.setClearButtonVisible(true);
        smallLeadingContent.setPlaceholder("20-40-XXT-XXT");

        TextField smallLeadingIcon = new TextField();
        smallLeadingIcon.addThemeVariants(TextFieldVariant.LUMO_SMALL);
        smallLeadingIcon.setLabel("Leading content");
        smallLeadingIcon.setPlaceholder("Eg: 20-40-XXT");
        smallLeadingIcon.setPrefixComponent(VaadinIcon.CALENDAR_BRIEFCASE.create());

        TextField smallSupportiveText = new TextField();
        smallSupportiveText.addThemeVariants(TextFieldVariant.LUMO_SMALL);
        smallSupportiveText.setLabel("Leading content");
        smallSupportiveText.setHelperText("Small supportive text");
        smallSupportiveText.setPlaceholder("Eg: AB-XTXT-XTXT-XXT");

        HorizontalLayout smallSizeLayout = new HorizontalLayout(small, smallLeadingContent, smallLeadingIcon, smallSupportiveText);
        add(smallSizeLayout);
    }
}
