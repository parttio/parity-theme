package com.example.application.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.details.DetailsVariant;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Accordion")
@Route(value = "accordion", layout = MainLayout.class)
public class AccordionView extends VerticalLayout {
    public AccordionView() {
        Span name = new Span("Sophia Williams");
        Span email = new Span("sophia.williams@company.com");
        Span phone = new Span("(501) 555-9128");

        VerticalLayout informationLayout = new VerticalLayout(name, email, phone);
        informationLayout.setSpacing(false);
        informationLayout.setPadding(false);

        Accordion accordion = new Accordion();
        accordion.add("Personal Information", informationLayout);
        accordion.add("Billing address", informationLayout);
        accordion.add("Payment", informationLayout);

        Accordion accordion1 = new Accordion();

        AccordionPanel accordionPanel1 = accordion1.add("Personal Information", informationLayout);
        accordionPanel1.addThemeVariants(DetailsVariant.FILLED);

        AccordionPanel accordionPanel2 = accordion1.add("Billing address", informationLayout);
        accordionPanel2.addThemeVariants(DetailsVariant.FILLED);

        AccordionPanel accordionPanel3 = accordion1.add("Payment", informationLayout);
        accordionPanel3.addThemeVariants(DetailsVariant.FILLED);

        Accordion accordion3 = new Accordion();

        AccordionPanel accordionPanel11 = accordion3.add("Personal Information", informationLayout);
        accordionPanel11.addThemeVariants(DetailsVariant.REVERSE);

        AccordionPanel accordionPanel12 = accordion3.add("Billing address", informationLayout);
        accordionPanel12.addThemeVariants(DetailsVariant.REVERSE);

        AccordionPanel accordionPanel13 = accordion3.add("Payment", informationLayout);
        accordionPanel13.addThemeVariants(DetailsVariant.REVERSE);

        add(accordion, accordion1, accordion3);
    }
}
