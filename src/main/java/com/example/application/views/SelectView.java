package com.example.application.views;

import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Select")
@Route(value = "Select", layout = MainLayout.class)
public class SelectView extends VerticalLayout {
    public SelectView() {
        Select<String> select = new Select<>();
        select.setLabel("Top label");
        select.setItems("Item 1", "Item 2", "Item 3", "Item 4");
        select.setPlaceholder("Select an item");
        select.setItemEnabledProvider(item -> !"Item 1".equals(item));
        add(select);

        Select<String> selectDivider = new Select<>();
        selectDivider.setLabel("Top label");
        selectDivider.setItems("Item 1", "Item 2", "Item 3", "Item 4", "Item 5");
        selectDivider.addComponents("Item 1", new Hr());
        selectDivider.addComponents("Item 2", new Hr());
        selectDivider.setValue("Item 1");
        add(selectDivider);
    }
}
