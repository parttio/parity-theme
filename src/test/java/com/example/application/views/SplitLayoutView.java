package com.example.application.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.List;

@PageTitle("Split Layout")
@Route(value = "split-layout", layout = MainLayout.class)
public class SplitLayoutView extends VerticalLayout {

    public SplitLayoutView() {
        horizontalOrientation();
        verticalOrientation();
    }

    private Void horizontalOrientation() {
        H4 groupHeading = new H4("Horizontal Orientation");

        Div panel1 = panel("var(--lumo-shade-20pct)");
        Div panel2 = panel("var(--lumo-shade-70pct)");

        SplitLayout splitLayout = new SplitLayout(panel1, panel2);
        splitLayout.setOrientation(SplitLayout.Orientation.HORIZONTAL);

        splitLayout.setHeightFull();

        VerticalLayout layout = new VerticalLayout(groupHeading, splitLayout);
        add(layout);

        return null;
    }

    private Void verticalOrientation() {
        H4 groupHeading = new H4("Vertical Orientation");

        Div panel1 = panel("var(--lumo-shade-20pct)");
        Div panel2 = panel("var(--lumo-shade-70pct)");

        SplitLayout splitLayout = new SplitLayout(panel1, panel2);
        splitLayout.setOrientation(SplitLayout.Orientation.VERTICAL);

        splitLayout.setHeightFull();

        VerticalLayout layout = new VerticalLayout(groupHeading, splitLayout);
        add(layout);

        return null;
    }

    public Div panel(String color) {
        Div panel = new Div();
        panel.setWidth("400px");
        panel.setHeight("400px");
        panel.getElement().getStyle().set("background", color);

        return panel;
    }
}
