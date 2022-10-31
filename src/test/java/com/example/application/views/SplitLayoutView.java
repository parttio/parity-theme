package com.example.application.views;

import com.vaadin.demo.domain.DataService;
import com.vaadin.demo.domain.Person;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.List;

@PageTitle("Split Layout")
@Route(value = "split-layout", layout = MainLayout.class)
public class SplitLayoutView extends VerticalLayout {

    public SplitLayoutView() {
        Grid master = MasterContent();

        FormLayout detail = FormLayout();

        SplitLayout splitLayout = new SplitLayout(master, detail);

        splitLayout.setHeightFull();
        add(splitLayout);
    }

    private Grid MasterContent() {
        Grid<Person> grid = new Grid<>(Person.class, false);
        grid.addColumn(Person::getFirstName).setHeader("First name");
        grid.addColumn(Person::getLastName).setHeader("Last name");
        grid.addColumn(Person::getEmail).setHeader("Email");
        grid.addColumn(Person::getProfession).setHeader("Profession");

        List<Person> people = DataService.getPeople();
        grid.setItems(people);

        return grid;
    }

    private FormLayout FormLayout() {
        TextField firstName = new TextField("First name");
        TextField lastName = new TextField("Last name");
        TextField username = new TextField("Username");
        PasswordField password = new PasswordField("Password");
        PasswordField confirmPassword = new PasswordField("Confirm password");

        FormLayout formLayout = new FormLayout();
        formLayout.add(firstName, lastName, username, password,
                confirmPassword);

        return formLayout;
    }
}
