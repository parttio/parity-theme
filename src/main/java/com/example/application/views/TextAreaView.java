package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextAreaVariant;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Text Area")
@Route(value = "text-area", layout = MainLayout.class)
public class TextAreaView extends VerticalLayout {
    public TextAreaView() {
        int charLimit = 500;
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel semper libero. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae.";

        TextArea largeTextArea = new TextArea();
        largeTextArea.addThemeName("large");
        largeTextArea.setWidth("400px");
        largeTextArea.setLabel("Top label");
        largeTextArea.setMaxLength(charLimit);
        largeTextArea.setValueChangeMode(ValueChangeMode.EAGER);
        largeTextArea.addValueChangeListener(e -> {
            e.getSource().setHelperText(e.getValue().length() + "/" + charLimit);
        });
        largeTextArea.setValue(loremIpsum);
        add(largeTextArea);

        TextArea textArea = new TextArea();
        textArea.setWidth("400px");
        textArea.setLabel("Top label");
        textArea.setMaxLength(charLimit);
        textArea.setValueChangeMode(ValueChangeMode.EAGER);
        textArea.addValueChangeListener(e -> {
            e.getSource().setHelperText(e.getValue().length() + "/" + charLimit);
        });
        textArea.setValue(loremIpsum);
        add(textArea);

        TextArea smallTextArea = new TextArea();
        smallTextArea.addThemeVariants(TextAreaVariant.LUMO_SMALL);
        smallTextArea.setWidth("400px");
        smallTextArea.setLabel("Top label");
        smallTextArea.setMaxLength(charLimit);
        smallTextArea.setValueChangeMode(ValueChangeMode.EAGER);
        smallTextArea.addValueChangeListener(e -> {
            e.getSource().setHelperText(e.getValue().length() + "/" + charLimit);
        });
        smallTextArea.setValue(loremIpsum);
        add(smallTextArea);

        TextArea readonlyTextArea = new TextArea();
        readonlyTextArea.setReadOnly(true);
        readonlyTextArea.setWidth("400px");
        readonlyTextArea.setLabel("Read-Only");
        readonlyTextArea.setMaxLength(charLimit);
        readonlyTextArea.setValueChangeMode(ValueChangeMode.EAGER);
        readonlyTextArea.setValue(loremIpsum);
        add(readonlyTextArea);
    }
}
