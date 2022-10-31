package com.example.application.views;

import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Password Field")
@Route(value = "password-field", layout = MainLayout.class)
public class PasswordFieldView extends VerticalLayout {

    public PasswordFieldView() {
        add(new H4("Basic"));

        PasswordField passwordField = new PasswordField();
        passwordField.setRevealButtonVisible(false);
        passwordField.setLabel("Password");
        passwordField.setValue("Ex@mplePassw0rd");
        add(passwordField);

        PasswordField passwordFieldVisible = new PasswordField();
        passwordFieldVisible.setLabel("Password");
        passwordFieldVisible.setValue("Ex@mplePassw0rd");
        add(passwordFieldVisible);

        PasswordField passwordSupportiveField = new PasswordField();
        passwordSupportiveField.setLabel("Password");
        passwordSupportiveField.setHelperText("A password must be at least 8 characters. It has to have at least one letter and one digit.");
        passwordSupportiveField.setPattern("^(?=.*[0-9])(?=.*[a-zA-Z]).{8}.*$");
        passwordSupportiveField.setErrorMessage("Not a valid password");
        add(passwordSupportiveField);

        add(new H4("Size"));

        PasswordField largePasswordField = new PasswordField();
        largePasswordField.addThemeName("large");
        largePasswordField.setLabel("Password");
        largePasswordField.setValue("Ex@mplePassw0rd");

        PasswordField LargePasswordSupportiveField = new PasswordField();
        LargePasswordSupportiveField.addThemeName("large");
        LargePasswordSupportiveField.setLabel("Password");
        LargePasswordSupportiveField.setHelperText("A password must be at least 8 characters. It has to have at least one letter and one digit.");
        LargePasswordSupportiveField.setPattern("^(?=.*[0-9])(?=.*[a-zA-Z]).{8}.*$");
        LargePasswordSupportiveField.setErrorMessage("Not a valid password");

        HorizontalLayout largeSizeLayout = new HorizontalLayout(largePasswordField, LargePasswordSupportiveField);
        add(largeSizeLayout);

        PasswordField smallPasswordField = new PasswordField();
        smallPasswordField.addThemeVariants(TextFieldVariant.LUMO_SMALL);
        smallPasswordField.setLabel("Password");
        smallPasswordField.setValue("Ex@mplePassw0rd");

        PasswordField smallPasswordSupportiveField = new PasswordField();
        smallPasswordSupportiveField.addThemeVariants(TextFieldVariant.LUMO_SMALL);
        smallPasswordSupportiveField.setLabel("Password");
        smallPasswordSupportiveField.setHelperText("A password must be at least 8 characters. It has to have at least one letter and one digit.");
        smallPasswordSupportiveField.setPattern("^(?=.*[0-9])(?=.*[a-zA-Z]).{8}.*$");
        smallPasswordSupportiveField.setErrorMessage("Not a valid password");

        HorizontalLayout smallSizeLayout = new HorizontalLayout(smallPasswordField, smallPasswordSupportiveField);
        add(smallSizeLayout);
    }
}
