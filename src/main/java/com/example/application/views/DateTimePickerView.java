package com.example.application.views;

import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Date Time Picker")
@Route(value = "date-time-picker", layout = MainLayout.class)
public class DateTimePickerView extends VerticalLayout {
    public DateTimePickerView() {
        DateTimePicker dateTimePicker = new DateTimePicker();
        dateTimePicker.setLabel("Meeting date and time");
        add(dateTimePicker);
    }

}
