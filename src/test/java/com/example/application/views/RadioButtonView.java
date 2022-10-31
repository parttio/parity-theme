package com.example.application.views;

import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Radio Button")
@Route(value = "radio-button", layout = MainLayout.class)
public class RadioButtonView extends VerticalLayout {

    public RadioButtonView() {
        add(new H4("Variations"));

        RadioButtonGroup<String> horizontalRadioGroup = new RadioButtonGroup<>();
        horizontalRadioGroup.setItems("Item 1", "Item 2", "Item 3");
        add(horizontalRadioGroup);

        RadioButtonGroup<String> verticalRadioGroup = new RadioButtonGroup<>();
        verticalRadioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        verticalRadioGroup.setItems("Item 1", "Item 2", "Item 3", "Item 4", "Item 5");
        add(verticalRadioGroup);

//        size variants - target the group variant and change size from there

//        Other states - disabled and error
    }
}
