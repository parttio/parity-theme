package com.example.application.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.details.DetailsVariant;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Accordion")
@Route(value = "accordion", layout = MainLayout.class)
public class AccordionView extends VerticalLayout {
    public AccordionView() {
        add(new H4("Basic"));
        Component accordionBasic = createAccordion();
        add(accordionBasic);

        add(new H4("Filled"));
        Component accordionFilled = createAccordionVariant(DetailsVariant.FILLED);
        add(accordionFilled);

        add(new H4("Reverse"));
        Component accordionReverse = createAccordionVariant(DetailsVariant.REVERSE);
        add(accordionReverse);
    }

    private Accordion createAccordionVariant(DetailsVariant variant) {
        Accordion accordion = new Accordion();
        accordion.setWidth("300px");

        AccordionPanel panel1 = accordion.add("Information", content());
        panel1.addThemeVariants(variant);
        AccordionPanel panel2 = accordion.add("Information", content());
        panel2.addThemeVariants(variant);
        AccordionPanel panel3 = accordion.add("Information", content());
        panel3.addThemeVariants(variant);

        return accordion;
    }

    private Accordion createAccordion() {
        Accordion accordion = new Accordion();
        accordion.setWidth("300px");

        accordion.add("Information", content());
        accordion.add("Information", content());
        accordion.add("Information", content());

        return accordion;
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
