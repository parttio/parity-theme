package com.example.application.views;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Checkbox")
@Route(value = "checkbox", layout = MainLayout.class)
public class CheckboxView extends VerticalLayout {

    public CheckboxView() {
        add(new H4("Check state"));

        Checkbox uncheckedBox = new Checkbox("Unchecked");

        Checkbox checkedBox = new Checkbox("Checked");
        checkedBox.setValue(true);

        Checkbox indeterminateBox = new Checkbox("Indeterminate");
        indeterminateBox.setIndeterminate(true);

        HorizontalLayout checkStateLayout = new HorizontalLayout(uncheckedBox, checkedBox, indeterminateBox);
        add(checkStateLayout);

        add(new H4("Orientation"));

        CheckboxGroup<String> checkboxGroupHorizontal = new CheckboxGroup<>();
        checkboxGroupHorizontal.setItems("Label 1", "Label 2", "Label 3");
        add(checkboxGroupHorizontal);

        CheckboxGroup<String> checkboxGroupVertical = new CheckboxGroup<>();
        checkboxGroupVertical.setItems("Label 1", "Label 2", "Label 3", "Label 4", "Label 5", "Label 6", "Label 7");
        checkboxGroupVertical.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        add(checkboxGroupVertical);

//        add size variants
    }
}
