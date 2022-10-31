package com.example.application.views;

import com.vaadin.flow.component.cookieconsent.CookieConsent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Cookies Consent")
@Route(value = "cookie-consent-basic", layout = MainLayout.class)
public class CookieConsentBasic extends Div {

    public CookieConsentBasic() {
        CookieConsent cookieConsent = new CookieConsent();
        add(cookieConsent);
    }

}