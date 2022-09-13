package com.example.application.views;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Badge")
@Route(value = "badge", layout = MainLayout.class)
public class BadgeView extends VerticalLayout {

    public BadgeView() {
        add(new H4("States"));

        Span none = new Span("None");
        none.getElement().getThemeList().add("badge");

        Span success = new Span("Success");
        success.getElement().getThemeList().add("badge success");

        Span error = new Span("Error");
        error.getElement().getThemeList().add("badge error");

        Span info = new Span("Information");
        info.getElement().getThemeList().add("badge information");

        Span warning = new Span("Warning");
        warning.getElement().getThemeList().add("badge warning");

        HorizontalLayout statusLayout = new HorizontalLayout(none, success, error, info, warning);
        add(statusLayout);

        add(new H4("Status variants"));

        Span noneStatus = new Span("None");
        noneStatus.getElement().getThemeList().add("badge");

        Span noneSubtle = new Span("None");
        noneSubtle.getElement().getThemeList().add("badge subtle");

        Span noneMinimal = new Span("None");
        noneMinimal.getElement().getThemeList().add("badge minimal");

        HorizontalLayout noneStatusVariantLayout = new HorizontalLayout(noneStatus, noneSubtle, noneMinimal);
        add(noneStatusVariantLayout);

        Span successStatus = new Span("Success");
        successStatus.getElement().getThemeList().add("badge success");

        Span successSubtle = new Span("Success");
        successSubtle.getElement().getThemeList().add("badge success subtle");

        Span successMinimal = new Span("Success");
        successMinimal.getElement().getThemeList().add("badge success minimal");

        HorizontalLayout successStatusVariantLayout = new HorizontalLayout(successStatus, successSubtle, successMinimal);
        add(successStatusVariantLayout);

        Span errorStatus = new Span("Error");
        errorStatus.getElement().getThemeList().add("badge error");

        Span errorSubtle = new Span("Error");
        errorSubtle.getElement().getThemeList().add("badge error subtle");

        Span errorMinimal = new Span("Error");
        errorMinimal.getElement().getThemeList().add("badge error minimal");

        HorizontalLayout errorStatusVariantLayout = new HorizontalLayout(errorStatus, errorSubtle, errorMinimal);
        add(errorStatusVariantLayout);

        Span informationStatus = new Span("Information");
        informationStatus.getElement().getThemeList().add("badge information");

        Span informationSubtle = new Span("Information");
        informationSubtle.getElement().getThemeList().add("badge information subtle");

        Span informationMinimal = new Span("Information");
        informationMinimal.getElement().getThemeList().add("badge information minimal");

        HorizontalLayout informationStatusVariantLayout = new HorizontalLayout(informationStatus, informationSubtle, informationMinimal);
        add(informationStatusVariantLayout);

        Span warningStatus = new Span("Warning");
        warningStatus.getElement().getThemeList().add("badge warning");

        Span warningSubtle = new Span("Warning");
        warningSubtle.getElement().getThemeList().add("badge warning subtle");

        Span warningMinimal = new Span("Warning");
        warningMinimal.getElement().getThemeList().add("badge warning minimal");

        HorizontalLayout warningStatusVariantLayout = new HorizontalLayout(warningStatus, warningSubtle, warningMinimal);
        add(warningStatusVariantLayout);

        add(new H4("Size"));

        Span large = new Span("Large");
        large.getElement().getThemeList().add("badge large");

        Span normal = new Span("Medium");
        normal.getElement().getThemeList().add("badge");

        Span small = new Span("Small");
        small.getElement().getThemeList().add("badge small");

        Span xSmall = new Span("X-Small");
        xSmall.getElement().getThemeList().add("badge xSmall");

        HorizontalLayout sizeLayout = new HorizontalLayout(large, normal, small, xSmall);
        add(sizeLayout);
    }

}
