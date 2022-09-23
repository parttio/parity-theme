package com.example.application.views;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Combo Box")
@Route(value = "combo-box", layout = MainLayout.class)
public class ComboBoxView extends VerticalLayout {
    public ComboBoxView() {
        ComboBox<String> comboBox = new ComboBox<>("Top label");
        comboBox.setWidth("300px");
        comboBox.setAllowCustomValue(true);
        comboBox.setItems("Item 1", "Item 2", "Item 3", "Item 4");
        comboBox.setPlaceholder("Select an option");
        comboBox.setHelperText("Supportive text");
        add(comboBox);
    }
}
