package com.example.application.views;

import com.example.application.util.PrefixUtil;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.icon.VaadinIcon;
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
        PrefixUtil.setPrefixComponent(comboBox, VaadinIcon.FILTER.create());
        comboBox.setPlaceholder("Select an option");
        comboBox.setHelperText("Supportive text");
        add(comboBox);

        MultiSelectComboBox<String> multiSelectComboBox = new MultiSelectComboBox<>("Top label");
        multiSelectComboBox.setWidth("300px");
        multiSelectComboBox.setAllowCustomValue(true);
        multiSelectComboBox.setItems("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10");
        PrefixUtil.setPrefixComponent(multiSelectComboBox, VaadinIcon.FILTER.create());
        multiSelectComboBox.setPlaceholder("Select an option");
        multiSelectComboBox.setHelperText("Supportive text");
        add(multiSelectComboBox);
    }
}
