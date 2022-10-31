package com.example.application.views;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.demo.domain.Person;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.gridpro.GridPro;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grid")
@Route(value = "grid", layout = MainLayout.class)
public class GridView extends VerticalLayout {

    public GridView() {
        setWidth("800px");

        List<Person> people = getPeople();

        add(new H4("Multi-select grid"));

        Grid<Person> grid = new Grid<>(Person.class, false);
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        grid.addColumn(Person::getFirstName).setHeader("First name");
        grid.addColumn(Person::getLastName).setHeader("Last name");
        grid.addColumn(Person::getEmail).setHeader("Email");
        grid.addColumn(Person::getProfession).setHeader("Profession");
        grid.setItems(people);

        add(grid);

        add(new H4("Header and footer"));
        Grid<Person> grid2 = new Grid<>(Person.class, false);
        grid2.addColumn(Person::getFirstName)
                .setHeader("First name")
                .setFooter("Total");
        grid2.addColumn(Person::getLastName)
                .setHeader("Last name")
                .setFooter("Total");
        grid2.addColumn(Person::getEmail)
                .setHeader("Email")
                .setFooter("Total");
        grid2.addColumn(Person::getProfession)
                .setHeader("Profession")
                .setFooter("Total");
        grid2.setItems(people);
        grid2.addThemeVariants(GridVariant.LUMO_COLUMN_BORDERS);

        add(grid2);

        add(new H4("Row stripes"));
        Grid<Person> grid3 = new Grid<>(Person.class, false);
        grid3.addColumn(Person::getFirstName)
                .setHeader("First name");
        grid3.addColumn(Person::getLastName)
                .setHeader("Last name");
        grid3.addColumn(Person::getEmail)
                .setHeader("Email");
        grid3.addColumn(Person::getProfession)
                .setHeader("Profession");
        grid3.setItems(people);
        grid3.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);

        add(grid3);

        add(new H4("Grid pro"));
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
        gridPro.addThemeVariants(GridVariant.LUMO_COLUMN_BORDERS);
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
