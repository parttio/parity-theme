package com.example.application.views;

import com.vaadin.flow.component.details.DetailsVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Details")
@Route(value = "details", layout = MainLayout.class)
public class DetailsView extends VerticalLayout {

    public DetailsView() {
        add(createBasicDetails());
        add(createThemedDetails(DetailsVariant.FILLED));
        add(createThemedDetails(DetailsVariant.REVERSE));
    }

    private Details createBasicDetails() {
        Details details = new Details("Contact information", content());
        details.setWidth("500px");
        details.setOpened(true);

        return details;
    }

    private Details createThemedDetails(DetailsVariant variant) {
        Details details = new Details("Members (8)", content());
        details.setWidth("500px");
        details.setOpened(true);
        details.addThemeVariants(variant);

        return details;
    }

    private VerticalLayout content() {
        Span name = new Span("Sophia Williams");
        Span email = new Span("sophia.williams@company.com");
        Span phone = new Span("(501) 555-9128");

        VerticalLayout informationLayout = new VerticalLayout(name, email, phone);
        informationLayout.setSpacing(false);
        informationLayout.setPadding(false);

        return informationLayout;
    }
}
