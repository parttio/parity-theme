package com.example.application.views;

import com.vaadin.demo.domain.DataService;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.demo.domain.Person;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.List;

@PageTitle("Tree Grid")
@Route(value = "tree-grid", layout = MainLayout.class)
public class TreeGridView extends VerticalLayout {
    private List<Person> managers = DataService.getManagers();

    public TreeGridView() {
        TreeGrid<Person> treeGrid = new TreeGrid<>();

        treeGrid.setItems(managers, this::getStaff);
        treeGrid.addHierarchyColumn(Person::getFirstName)
                .setHeader("First name");
        treeGrid.addColumn(Person::getLastName).setHeader("Last name");
        treeGrid.addColumn(Person::getEmail).setHeader("Email");

        add(treeGrid);
    }

    public List<Person> getStaff(Person manager) {
        return DataService.getPeople(manager.getId());
    }
}
