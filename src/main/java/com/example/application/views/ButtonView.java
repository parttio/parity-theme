package com.example.application.views;

import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Button")
@Route(value = "button", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class ButtonView extends VerticalLayout {

    public ButtonView() {
        add(new H4("Appearance"));

        Button primaryButton = new Button("Primary");
        primaryButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button secondaryButton = new Button("Secondary");
        secondaryButton.addThemeName("secondary");

        Button infoButton = new Button("Info");
        infoButton.addThemeName("info");

        Button contrastButton = new Button("Contrast");
        contrastButton.addThemeVariants(ButtonVariant.LUMO_CONTRAST);

        Button destructiveButton = new Button(" Destructive");
        destructiveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);

        HorizontalLayout appearanceLayout = new HorizontalLayout(primaryButton, secondaryButton, infoButton, contrastButton, destructiveButton);
        appearanceLayout.addClassName("appearanceLayout");
        add(appearanceLayout);

        add(new H4("Variations"));

        Button iconButton = new Button(new Icon(VaadinIcon.PLUS));
        iconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button basicButton = new Button("Submit");
        basicButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button leadingIconButton = new Button("Create", new Icon(VaadinIcon.PLUS));
        leadingIconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button trailingIconButton = new Button("Create", new Icon(VaadinIcon.PLUS));
        trailingIconButton.setIconAfterText(true);
        trailingIconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        HorizontalLayout variationLayout = new HorizontalLayout(iconButton, basicButton, leadingIconButton, trailingIconButton);
        add(variationLayout);

        add(new H4("Emphasis"));

        Button primaryBoldButton = new Button("Bold");
        primaryBoldButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button primarySubtleButton = new Button("Subtle");
        primarySubtleButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        primarySubtleButton.addThemeName("subtle");

        Button primaryMinimalButton = new Button("Minimal");
        primaryMinimalButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_TERTIARY);
        primaryMinimalButton.addThemeName("minimal");

        HorizontalLayout emphasisLayout1 = new HorizontalLayout(primaryBoldButton, primarySubtleButton, primaryMinimalButton);
        add(emphasisLayout1);

        Button secondaryBoldButton = new Button("Bold");

        Button secondarySubtleButton = new Button("Subtle");
        secondarySubtleButton.addThemeName("subtle");

        Button secondaryMinimalButton = new Button("Minimal");
        secondaryMinimalButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        HorizontalLayout emphasisLayout2 = new HorizontalLayout(secondaryBoldButton, secondarySubtleButton, secondaryMinimalButton);
        add(emphasisLayout2);

        Button infoBoldButton = new Button("Bold");
        infoBoldButton.addThemeName("info");

        Button infoSubtleButton = new Button("Subtle");
        infoSubtleButton.addThemeNames("info", "subtle");

        Button infoMinimalButton = new Button("Minimal");
        infoMinimalButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        HorizontalLayout emphasisLayout3 = new HorizontalLayout(infoBoldButton, infoSubtleButton, infoMinimalButton);
        add(emphasisLayout3);

        Button destructiveBoldButton = new Button("Bold");
        destructiveBoldButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);

        Button destructiveSubtleButton = new Button("Subtle");
        destructiveSubtleButton.addThemeVariants(ButtonVariant.LUMO_ERROR);
        destructiveSubtleButton.addThemeNames("destructive", "subtle");

        Button destructiveMinimalButton = new Button("Minimal");
        destructiveMinimalButton.addThemeVariants(ButtonVariant.LUMO_ERROR, ButtonVariant.LUMO_TERTIARY);

        HorizontalLayout emphasisLayout4 = new HorizontalLayout(destructiveBoldButton, destructiveSubtleButton, destructiveMinimalButton);
        add(emphasisLayout4);

        Button contrastBoldButton = new Button("Bold");
        contrastBoldButton.addThemeVariants(ButtonVariant.LUMO_CONTRAST);

        Button contrastSubtleButton = new Button("Subtle");
        contrastSubtleButton.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        contrastSubtleButton.addThemeNames("subtle");

        Button contrastMinimalButton = new Button("Minimal");
        contrastMinimalButton.addThemeVariants(ButtonVariant.LUMO_CONTRAST, ButtonVariant.LUMO_TERTIARY);
        contrastMinimalButton.addThemeNames("minimal");

        HorizontalLayout emphasisLayout5 = new HorizontalLayout(contrastBoldButton, contrastSubtleButton, contrastMinimalButton);
        emphasisLayout5.addClassName("contrastLayout");
        add(emphasisLayout5);

        add(new H4("Shapes"));

        Button squareButton = new Button("Square");
        squareButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button squareIconButton = new Button(new Icon(VaadinIcon.PAPERPLANE));
        squareIconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button circleButton = new Button("Circle");
        circleButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        circleButton.addThemeName("circle");

        Button circleIconButton = new Button(new Icon(VaadinIcon.PAPERPLANE));
        circleIconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        circleIconButton.addThemeName("circle");

        HorizontalLayout shapeLayout = new HorizontalLayout(squareButton, squareIconButton, circleButton, circleIconButton);
        add(shapeLayout);

        add(new H4("Sizes"));

        Button extraLargeButton = new Button("X-Large");
        extraLargeButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        extraLargeButton.addThemeName("xl");

        Button largeButton = new Button("Large");
        largeButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_LARGE);

        Button normalButton = new Button("Normal");
        normalButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button smallButton = new Button("Small");
        smallButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_SMALL);

        HorizontalLayout sizeLayout = new HorizontalLayout(extraLargeButton, largeButton, normalButton, smallButton);
        add(sizeLayout);
    }

}
