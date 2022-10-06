package com.example.application.views;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.demo.domain.Person;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.gridpro.GridPro;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grid")
@Route(value = "grid", layout = MainLayout.class)
public class GridView extends VerticalLayout {

    public GridView() {
        add(new H4("Basic grid"));

        Grid<Person> grid = new Grid<>(Person.class, false);
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        grid.addColumn(Person::getFirstName).setHeader("First name");
        grid.addColumn(Person::getLastName).setHeader("Last name");
        grid.addColumn(Person::getEmail).setHeader("Email");
        grid.addColumn(Person::getProfession).setHeader("Profession");

        List<Person> people =  getPeople();
        grid.setItems(people);

        add(grid);

        GridPro<Person> gridPro = new GridPro<>();

        gridPro.addEditColumn(Person::getFirstName).text(Person::setFirstName)
                .setHeader("First name");

        gridPro.addEditColumn(Person::getLastName).text(Person::setLastName)
                .setHeader("Last name");

        gridPro.addEditColumn(Person::getEmail).text(Person::setEmail)
                .setHeader("Email");

        gridPro.addEditColumn(Person::getProfession).text(Person::setProfession)
                .setHeader("Profession");

        List<Person> people2 =  getPeople();
        gridPro.setItems(people2);

        add(gridPro);
    }

    public List<Person> getPeople(){
        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Person person = new Person();
            person.setFirstName("Fname" + i);
            person.setLastName("Lname" + i);
            person.setEmail("foo" + i +"@bar.com");
            person.setId(i);
            person.setProfession("Profession" + i);

            people.add(person);
        }
        return people;
    }
}
