package com.example.application.views;

import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("List Box")
@Route(value = "list-box", layout = MainLayout.class)
public class ListBoxView extends VerticalLayout {
    public ListBoxView() {
        MultiSelectListBox<String> listBox = new MultiSelectListBox<>();
        listBox.setItems("Show assignee", "Show due date", "Show status", "Show pending", "Show missing");
        listBox.select("Show assignee");
        listBox.setWidth("200px");
        add(listBox);

        MultiSelectListBox<String> smallPaddingListBox = new MultiSelectListBox<>();
        smallPaddingListBox.setItems("Show assignee", "Show due date", "Show status", "Show pending", "Show missing");
        smallPaddingListBox.select("Show assignee");
        smallPaddingListBox.setWidth("200px");
        smallPaddingListBox.getElement().getThemeList().add("padding-small");
        add(smallPaddingListBox);

        MultiSelectListBox<String> mediumPaddingListBox = new MultiSelectListBox<>();
        mediumPaddingListBox.setItems("Show assignee", "Show due date", "Show status", "Show pending", "Show missing");
        mediumPaddingListBox.select("Show assignee");
        mediumPaddingListBox.setWidth("200px");
        mediumPaddingListBox.getElement().getThemeList().add("padding-medium");
        add(mediumPaddingListBox);
    }
}
