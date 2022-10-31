package com.example.application.views;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Date Picker")
@Route(value = "date-picker", layout = MainLayout.class)
public class DatePickerView extends VerticalLayout {

    public DatePickerView() {
        DatePicker datePicker = new DatePicker("Start date");
        datePicker.setPlaceholder("DD Mon YYYY");
        datePicker.setHelperText("Format: DD Mon YYYY");
        add(datePicker);
    }

}
