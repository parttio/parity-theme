package com.example.application.views;

import com.vaadin.demo.domain.DataService;
import com.vaadin.demo.domain.Person;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridMultiSelectionModel;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoIcon;
import com.vaadin.flow.theme.lumo.LumoUtility;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@PageTitle("Parity theme demo")
@Route(value = "", layout = MainLayout.class)
public class HomeView extends FlexLayout {

    public HomeView() {
        setSizeFull();
        getElement().setAttribute("style", "background-color: var(--gm-surface-primary-color);");
        addClassNames(LumoUtility.Display.FLEX, LumoUtility.FlexDirection.ROW, LumoUtility.Background.CONTRAST_5, LumoUtility.Padding.LARGE, LumoUtility.BoxSizing.BORDER,
            LumoUtility.Overflow.AUTO, LumoUtility.FlexWrap.WRAP);
        addClassNames(LumoUtility.Gap.LARGE);
        FlexLayout col1 = new FlexLayout();
        col1.setFlexDirection(FlexDirection.COLUMN);
        col1.addClassNames(LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Gap.LARGE, LumoUtility.Flex.GROW, LumoUtility.Flex.SHRINK);
        col1.getElement().setAttribute("style", "flex-basis: 400px;");
        col1.setWidthFull();
        col1.add(createButtonExamples());
        col1.add(createFieldExamples());

        FlexLayout col2 = new FlexLayout();
        col2.setFlexDirection(FlexDirection.COLUMN);
        col2.addClassNames(LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Gap.LARGE, LumoUtility.Flex.GROW, LumoUtility.Flex.SHRINK);
        col2.getElement().setAttribute("style", "flex-basis: 400px;");
        col2.setWidthFull();
        col2.add(createGridExample());
        col2.add(createTabsExample());
        col2.add(createMessagesExample());

        add(col1, col2);
    }

    private Component createButtonExamples() {
        VerticalLayout layout = new VerticalLayout();
        layout.addClassName("card");
        layout.addClassNames(LumoUtility.Gap.SMALL, LumoUtility.Background.BASE, LumoUtility.Padding.LARGE, LumoUtility.Border.ALL,
            LumoUtility.BorderColor.CONTRAST_10);


        Button primaryBoldButton = new Button("Bold");
        primaryBoldButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button primarySubtleButton = new Button("Subtle");
        primarySubtleButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        primarySubtleButton.addThemeName("subtle");

        Button primaryMinimalButton = new Button("Minimal");
        primaryMinimalButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_TERTIARY);
        primaryMinimalButton.addThemeName("minimal");

        Button primaryBoldIconButton = new Button(LumoIcon.SEARCH.create());
        primaryBoldIconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button primarySubtleIconButton = new Button(LumoIcon.SEARCH.create());
        primarySubtleIconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        primarySubtleIconButton.addThemeName("subtle");

        Button primaryMinimalIconButton = new Button(LumoIcon.SEARCH.create());
        primaryMinimalIconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_TERTIARY);
        primaryMinimalIconButton.addThemeName("minimal");

        HorizontalLayout emphasisLayout1 = new HorizontalLayout(primaryBoldButton, primarySubtleButton, primaryMinimalButton, primaryBoldIconButton, primarySubtleIconButton, primaryMinimalIconButton);
        layout.add(emphasisLayout1);

        Button destructiveBoldButton = new Button("Bold");
        destructiveBoldButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);

        Button destructiveSubtleButton = new Button("Subtle");
        destructiveSubtleButton.addThemeVariants(ButtonVariant.LUMO_ERROR);
        destructiveSubtleButton.addThemeNames("destructive", "subtle");

        Button destructiveMinimalButton = new Button("Minimal");
        destructiveMinimalButton.addThemeVariants(ButtonVariant.LUMO_ERROR, ButtonVariant.LUMO_TERTIARY);

        Button destructiveBoldIconButton = new Button(LumoIcon.SEARCH.create());
        destructiveBoldIconButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);

        Button destructiveSubtleIconButton = new Button(LumoIcon.SEARCH.create());
        destructiveSubtleIconButton.addThemeVariants(ButtonVariant.LUMO_ERROR);
        destructiveSubtleIconButton.addThemeNames("destructive", "subtle");

        Button destructiveMinimalIconButton = new Button(LumoIcon.SEARCH.create());
        destructiveMinimalIconButton.addThemeVariants(ButtonVariant.LUMO_ERROR, ButtonVariant.LUMO_TERTIARY);

        HorizontalLayout emphasisLayout2 = new HorizontalLayout(destructiveBoldButton, destructiveSubtleButton, destructiveMinimalButton, destructiveBoldIconButton, destructiveSubtleIconButton, destructiveMinimalIconButton);
        layout.add(emphasisLayout2);

        Button infoBoldButton = new Button("Bold");
        infoBoldButton.addThemeName("info");

        Button infoSubtleButton = new Button("Subtle");
        infoSubtleButton.addThemeNames("info", "subtle");

        Button infoMinimalButton = new Button("Minimal");
        infoMinimalButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        Button infoBoldIconButton = new Button(LumoIcon.SEARCH.create());
        infoBoldIconButton.addThemeName("info");

        Button infoSubtleIconButton = new Button(LumoIcon.SEARCH.create());
        infoSubtleIconButton.addThemeNames("info", "subtle");

        Button infoMinimalIconButton = new Button(LumoIcon.SEARCH.create());
        infoMinimalIconButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        HorizontalLayout emphasisLayout3 = new HorizontalLayout(infoBoldButton, infoSubtleButton, infoMinimalButton, infoBoldIconButton, infoSubtleIconButton, infoMinimalIconButton);
        layout.add(emphasisLayout3);

        Button secondaryBoldButton = new Button("Bold");

        Button secondarySubtleButton = new Button("Subtle");
        secondarySubtleButton.addThemeName("subtle");

        Button secondaryMinimalButton = new Button("Minimal");
        secondaryMinimalButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        Button secondaryBoldIconButton = new Button(LumoIcon.SEARCH.create());

        Button secondarySubtleIconButton = new Button(LumoIcon.SEARCH.create());
        secondarySubtleIconButton.addThemeName("subtle");

        Button secondaryMinimalIconButton = new Button(LumoIcon.SEARCH.create());
        secondaryMinimalIconButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        HorizontalLayout emphasisLayout4 = new HorizontalLayout(secondaryBoldButton, secondarySubtleButton, secondaryMinimalButton, secondaryBoldIconButton, secondarySubtleIconButton, secondaryMinimalIconButton);
        layout.add(emphasisLayout4);

        return layout;
    }

    private Component createFieldExamples() {
        HorizontalLayout layout = new HorizontalLayout();
        layout.addClassName("card");
        layout.addClassNames(LumoUtility.Gap.LARGE, LumoUtility.Background.BASE, LumoUtility.Padding.LARGE, LumoUtility.Border.ALL,
            LumoUtility.BorderColor.CONTRAST_10);

        VerticalLayout left = new VerticalLayout();
        left.setPadding(false);
        left.addClassName(LumoUtility.Gap.SMALL);
        VerticalLayout right = new VerticalLayout();
        right.setPadding(false);
        right.addClassName(LumoUtility.Gap.SMALL);

        TextField basic = new TextField("Field");
        basic.setWidthFull();

        TextField trailingContent = new TextField("Read-only");
        trailingContent.setSuffixComponent(new Div(new Text("EUR €")));
        trailingContent.setValue("500.00");
        trailingContent.setReadOnly(true);
        trailingContent.setWidthFull();

        TextField leadingIcon = new TextField("Invalid");
        leadingIcon.setPlaceholder("Leading icon");
        leadingIcon.setPrefixComponent(LumoIcon.PHONE.create());
        leadingIcon.setValue("12345678");
        leadingIcon.setErrorMessage("Invalid phone number");
        leadingIcon.setInvalid(true);
        leadingIcon.setWidthFull();

        TextField supportiveText = new TextField("Focus");
        supportiveText.setHelperText("Helper text");
        supportiveText.setPlaceholder("Placeholder");
        supportiveText.getElement().setAttribute("focus-ring", "");
        supportiveText.setWidthFull();

        TextField disabledField = new TextField("Disabled");
        disabledField.setValue("Value");
        disabledField.setEnabled(false);
        disabledField.setWidthFull();

        ComboBox<String> comboBox = new ComboBox<>("Combo Box");
        comboBox.setAllowCustomValue(true);
        comboBox.setItems("Item 1", "Item 2", "Item 3", "Item 4");
        comboBox.setPlaceholder("Select an option");
        comboBox.setWidthFull();

        MultiSelectComboBox<String> multiSelectComboBox = new MultiSelectComboBox<>("Multiselect");
        multiSelectComboBox.setWidth("300px");
        multiSelectComboBox.setAllowCustomValue(true);
        multiSelectComboBox.setItems("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10");
        multiSelectComboBox.setValue("Item 2", "Item 5", "Item 6");
        multiSelectComboBox.setPlaceholder("Select an options");
        multiSelectComboBox.setWidthFull();

        DatePicker datePicker = new DatePicker("Date Picker");
        datePicker.setPlaceholder("MM/DD/YYYY");
        datePicker.setLocale(Locale.US);
        datePicker.setWidthFull();

        RadioButtonGroup<String> radioGroupVertical = new RadioButtonGroup<>();
        radioGroupVertical.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        radioGroupVertical.setLabel("Radio Buttons");
        radioGroupVertical.setItems("Item 1", "Item 2", "Item 3");
        radioGroupVertical.setValue("Item 1");

        CheckboxGroup<String> checkboxGroupVertical = new CheckboxGroup<>();
        checkboxGroupVertical.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        checkboxGroupVertical.setLabel("Checkboxes");
        checkboxGroupVertical.setItems("Item 1", "Item 2", "Item 3");
        checkboxGroupVertical.select("Item 1");


        left.add(basic, trailingContent, leadingIcon, supportiveText, disabledField);
        right.add(comboBox, multiSelectComboBox, datePicker, radioGroupVertical, checkboxGroupVertical);
        layout.add(left, right);
        return layout;
    }

    private Component createGridExample() {
        Div layout = new Div();
        layout.addClassName("card");
        layout.addClassNames(LumoUtility.Padding.LARGE, LumoUtility.Background.BASE, LumoUtility.Border.ALL, LumoUtility.BorderColor.CONTRAST_10);

        List<Person> people = DataService.getPeople();

        Grid<Person> grid = new Grid<>(Person.class, false);
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        ((GridMultiSelectionModel<?>) grid
                .setSelectionMode(Grid.SelectionMode.MULTI))
                .setSelectionColumnFrozen(true);
        grid.addColumn(Person::getFirstName).setHeader("First name").setAutoWidth(true).setFrozen(true);
        grid.addColumn(Person::getLastName).setHeader("Last name").setAutoWidth(true);
        grid.addColumn(Person::getEmail).setHeader("Email").setAutoWidth(true);
        grid.addColumn(Person::getProfession).setHeader("Profession").setAutoWidth(true);
        grid.setItems(people);
        grid.select(people.get(2));
        grid.setWidthFull();
        grid.setHeight("320px");

        layout.add(grid);
        return layout;
    }


    private Component createTabsExample() {
        FlexLayout layout = new FlexLayout();
        layout.addClassName("card");
        layout.setFlexDirection(FlexDirection.COLUMN);
        layout.addClassNames(LumoUtility.Gap.LARGE, LumoUtility.Background.BASE, LumoUtility.Padding.LARGE, LumoUtility.Border.ALL,
            LumoUtility.BorderColor.CONTRAST_10);

        Tab tab1 = new Tab("First tab");
        Tab tab2 = new Tab("Second tab");
        Tab tab3 = new Tab("Third tab");
        Tab tab4 = new Tab("Fourth tab");
        tab4.setEnabled(false);

        Tabs tabs = new Tabs(tab1, tab2, tab3, tab4);
        tabs.setSelectedTab(tab1);

        layout.add(tabs, createBadgesExample());
        return layout;
    }

    private Component createBadgesExample() {
        FlexLayout layout = new FlexLayout();
        layout.addClassNames(LumoUtility.Gap.SMALL, LumoUtility.FlexWrap.WRAP);

        FlexLayout normalBadges = new FlexLayout();
        normalBadges.addClassNames(LumoUtility.Gap.SMALL);
        FlexLayout primaryBadges = new FlexLayout();
        primaryBadges.addClassNames(LumoUtility.Gap.SMALL);

        Span none = new Span("Normal");
        none.getElement().getThemeList().add("badge");

        Span success = new Span("Success");
        success.getElement().getThemeList().add("badge success");

        Span error = new Span("Error");
        error.getElement().getThemeList().add("badge error");

        Span warning = new Span("Warning");
        warning.getElement().getThemeList().add("badge warning");

        Span info = new Span("Info");
        info.getElement().getThemeList().add("badge information");

        Span noneSubtle = new Span("Normal");
        noneSubtle.getElement().getThemeList().add("badge subtle");

        Span successSubtle = new Span("Success");
        successSubtle.getElement().getThemeList().add("badge subtle success");

        Span errorSubtle = new Span("Error");
        errorSubtle.getElement().getThemeList().add("badge subtle error");

        Span warningSubtle = new Span("Warning");
        warningSubtle.getElement().getThemeList().add("badge subtle warning");

        Span infoSubtle = new Span("Info");
        infoSubtle.getElement().getThemeList().add("badge subtle information");


        normalBadges.add(none, success, error, warning, info);
        primaryBadges.add(noneSubtle, successSubtle, errorSubtle, warningSubtle, infoSubtle);
        layout.add(normalBadges, primaryBadges);
        return layout;
    }

    private Component createMessagesExample() {
        Div layout = new Div();
        layout.addClassName("card");
        layout.addClassNames(LumoUtility.Background.BASE, LumoUtility.Padding.LARGE, LumoUtility.Border.ALL,
            LumoUtility.BorderColor.CONTRAST_10);


        Person person = DataService.getPeople(1).get(0);
        MessageList list = new MessageList();
        Instant yesterday = LocalDateTime.now().minusDays(1)
                .toInstant(ZoneOffset.UTC);
        Instant fiftyMinsAgo = LocalDateTime.now().minusMinutes(50)
                .toInstant(ZoneOffset.UTC);
        MessageListItem message1 = new MessageListItem(
                "Linsey, did you know these apps can be fully styled?",
                yesterday, "Matt Mambo");
        message1.setUserColorIndex(1);
        MessageListItem message2 = new MessageListItem("Yup. Lumo is always there as the base and modifications can be applied on top.",
                fiftyMinsAgo, "Linsey Listy");
        message2.setUserColorIndex(2);
        MessageListItem message3 = new MessageListItem(
                "Cool!",
                yesterday, "Matt Mambo");
        message3.setUserColorIndex(1);
        list.setItems(Arrays.asList(message1, message2, message3));

        layout.add(list);
        return layout;
    }

}
