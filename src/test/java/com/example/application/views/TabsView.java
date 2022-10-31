package com.example.application.views;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.TabVariant;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Tabs")
@Route(value = "tabs", layout = MainLayout.class)
public class TabsView extends VerticalLayout {
    public TabsView() {
        Tab selected = new Tab("Tab Item");
        Tab unselected1 = new Tab("Tab Item");
        Tab unselected2 = new Tab("Tab Item");
        Tab unselected3 = new Tab("Tab Item");
        Tab unselected4 = new Tab("Tab Item");
        Tab unselected5 = new Tab("Tab Item");
        Tab disabled = new Tab("Tab Item");
        disabled.setEnabled(false);

        Tabs horizontalTabs = new Tabs(selected, unselected1, disabled,
                unselected2, unselected3, unselected4, unselected5);
        horizontalTabs.setSelectedTab(selected);
/*        horizontalTabs.setMaxWidth("100%");
        horizontalTabs.setWidth("600px");*/

        add(horizontalTabs);

        Tab tab_item1 = new Tab("Tab Item");
        Tab tab_item2 = new Tab("Tab Item");
        Tab tab_item3 = new Tab("Tab Item");
        Tab tab_item4 = new Tab("Tab Item");
        Tab tab_item5 = new Tab("Tab Item");
        Tab tab_item6 = new Tab("Tab Item");
        Tab tab_item7 = new Tab("Tab Item");

        Tabs verticalTabs = new Tabs(tab_item1, tab_item2, tab_item3, tab_item4,
                tab_item5, tab_item6, tab_item7);
        verticalTabs.setOrientation(Tabs.Orientation.VERTICAL);
/*        verticalTabs.setHeight("240px");
        verticalTabs.setWidth("240px");*/

        add(verticalTabs);

        Tab leading_icon1 = new Tab(VaadinIcon.CALENDAR_CLOCK.create(), new Span("Leading Icon"));
        Tab leading_icon2 = new Tab(VaadinIcon.CALENDAR_CLOCK.create(), new Span("Leading Icon"));
        Tab leading_icon3 = new Tab(VaadinIcon.CALENDAR_CLOCK.create(),
                new Span("Notifications"));
        // Set the icon on top
        for (Tab tab : new Tab[] { leading_icon1, leading_icon2, leading_icon3 }) {
            tab.addThemeVariants(TabVariant.LUMO_ICON_ON_TOP);
        }
        Tabs iconHorizontalTab = new Tabs(leading_icon1, leading_icon2, leading_icon3);
        add(iconHorizontalTab);

        Tab leading_icon4 = new Tab(VaadinIcon.CALENDAR_CLOCK.create(), new Span("Leading Icon"));
        Tab leading_icon5 = new Tab(VaadinIcon.CALENDAR_CLOCK.create(), new Span("Leading Icon"));
        Tab leading_icon6 = new Tab(VaadinIcon.CALENDAR_CLOCK.create(),
                new Span("Notifications"));

        Tabs iconVerticalTab = new Tabs(leading_icon4, leading_icon5, leading_icon6);
        iconVerticalTab.setOrientation(Tabs.Orientation.VERTICAL);

        add(iconVerticalTab);
    }
}
