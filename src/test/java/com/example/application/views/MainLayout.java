package com.example.application.views;

import com.example.application.components.appnav.AppNav;
import com.example.application.components.appnav.AppNavItem;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayout extends AppLayout {

    private H2 viewTitle;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
    }

    private void addHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.getElement().setAttribute("aria-label", "Menu toggle");

        viewTitle = new H2();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        addToNavbar(true, toggle, viewTitle);
    }

    private void addDrawerContent() {
        H1 appName = new H1("Parity Theme");
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        Header header = new Header(appName);

        Scroller scroller = new Scroller(createNavigation());

        addToDrawer(header, scroller, createFooter());
    }

    private AppNav createNavigation() {
        // AppNav is not yet an official component.
        // For documentation, visit https://github.com/vaadin/vcf-nav#readme
        AppNav nav = new AppNav();

        nav.addItem(new AppNavItem("Accordion", AccordionView.class));
        nav.addItem(new AppNavItem("Avatar", AvatarView.class));
        nav.addItem(new AppNavItem("Badge", BadgeView.class));
        nav.addItem(new AppNavItem("Button", ButtonView.class));
        nav.addItem(new AppNavItem("Checkbox", CheckboxView.class));
        nav.addItem(new AppNavItem("Combo Box", ComboBoxView.class));
        nav.addItem(new AppNavItem("Confirm Dialog", ConfirmDialogView.class));
        nav.addItem(new AppNavItem("Context Menu", ContextMenuView.class));
        nav.addItem(new AppNavItem("Cookies Consent", CookieConsentBasic.class));
        nav.addItem(new AppNavItem("Date Picker", DatePickerView.class));
        nav.addItem(new AppNavItem("Date Time Picker", DateTimePickerView.class));
        nav.addItem(new AppNavItem("Details", DetailsView.class));
        nav.addItem(new AppNavItem("Dialog", DialogView.class));
        nav.addItem(new AppNavItem("Grid (data tables)", GridView.class));
        nav.addItem(new AppNavItem("List Box", ListBoxView.class));
        nav.addItem(new AppNavItem("Log In", LoginView.class));
        nav.addItem(new AppNavItem("Menu Bar", MenuBarView.class));
        nav.addItem(new AppNavItem("Message Input", MessageInputView.class));
        nav.addItem(new AppNavItem("Message List", MessageListView.class));
        nav.addItem(new AppNavItem("Notification", NotificationView.class));
        nav.addItem(new AppNavItem("Number Field", NumberFieldView.class));
        nav.addItem(new AppNavItem("Password Field", PasswordFieldView.class));
        nav.addItem(new AppNavItem("Radio Button", RadioButtonView.class));
        nav.addItem(new AppNavItem("Rich Text Editor", RichTextEditorBasic.class));
        nav.addItem(new AppNavItem("Select", SelectView.class));
        nav.addItem(new AppNavItem("Split Layout", SplitLayoutView.class));
        nav.addItem(new AppNavItem("Tabs", TabsView.class));
        nav.addItem(new AppNavItem("Text Area", TextAreaView.class));
        nav.addItem(new AppNavItem("Text Field", TextFieldView.class));
        nav.addItem(new AppNavItem("Time Picker", TimePickerView.class));
        nav.addItem(new AppNavItem("Tooltip", TooltipView.class));
        nav.addItem(new AppNavItem("Tree grid", TreeGridView.class));
        nav.addItem(new AppNavItem("progress Bar", ProgressBarView.class));
        nav.addItem(new AppNavItem("Upload", UploadView.class));

        return nav;
    }

    private Footer createFooter() {
        Footer layout = new Footer();

        return layout;
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}