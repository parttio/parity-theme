package com.example.application.views;

import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Tooltip")
@Route(value = "tooltip", layout = MainLayout.class)
public class TooltipView extends VerticalLayout {
    public TooltipView() {
        TextField textField = new TextField();
        textField.setPlaceholder("Search");
        // textField.setTooltipText("Wrap in “quotes” for exact phrase");
        add(textField);
    }
}
