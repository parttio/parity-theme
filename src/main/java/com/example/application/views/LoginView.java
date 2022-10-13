package com.example.application.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Login")
@Route(value = "login", layout = MainLayout.class)
public class LoginView extends VerticalLayout {

    public LoginView() {
        LoginI18n i18n = LoginI18n.createDefault();
        i18n.setAdditionalInformation(
                "Contact admin@company.com if you're experiencing issues logging into your account");

        LoginOverlay loginOverlay = new LoginOverlay();
        loginOverlay.setError(true);
        loginOverlay.setI18n(i18n);
        add(loginOverlay);
        loginOverlay.getElement().setAttribute("no-autofocus", "");

        Button login = new Button("Log in");
        login.addClickListener(event -> loginOverlay.setOpened(true));
        add(login);
    }
}
