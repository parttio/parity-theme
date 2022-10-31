package com.example.application.views;

import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import static org.apache.commons.io.FileUtils.byteCountToDisplaySize;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Context Menu")
@Route(value = "context-menu", layout = MainLayout.class)
public class ContextMenuView extends VerticalLayout {

    public ContextMenuView() {
        Grid<File> grid = new Grid();
        grid.setAllRowsVisible(true);
        grid.setItems(getFiles());

        grid.addColumn(File::getName).setHeader("Name");
        grid.addColumn(File::getDisplaySize).setHeader("Size");

        grid.addComponentColumn(file -> {
            MenuBar menuBar = new MenuBar();
            menuBar.addThemeVariants(MenuBarVariant.LUMO_TERTIARY);
            MenuItem menuItem = menuBar.addItem("•••");
            menuItem.getElement().setAttribute("aria-label", "More options");
            SubMenu subMenu = menuItem.getSubMenu();
            subMenu.addItem("Preview", event -> {
            });
            subMenu.addItem("Edit", event -> {
            });
            subMenu.addItem("Delete", event -> {
            });
            return menuBar;
        }).setWidth("70px").setFlexGrow(0);

        GridContextMenu<File> menu = grid.addContextMenu();
        menu.addItem("Preview", event -> {
        });
        menu.addItem("Edit", event -> {
        });
        menu.addItem("Delete", event -> {
        });

        add(grid);
    }

    private File[] getFiles() {
        return new File[] { new File("Annual Report.docx", 25165824),
                new File("Financials.xlsx", 44040192) };
    }

    private class File {

        private String name;
        private long size;

        File(String name, long size) {
            this.name = name;
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public long getSize() {
            return size;
        }

        public String getDisplaySize() {
            return byteCountToDisplaySize(size);
        }
    }

}
