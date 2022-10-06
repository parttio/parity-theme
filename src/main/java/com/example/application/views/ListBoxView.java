package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("List Box")
@Route(value = "list-box", layout = MainLayout.class)
public class ListBoxView extends VerticalLayout {
    public ListBoxView() {

    }
}
