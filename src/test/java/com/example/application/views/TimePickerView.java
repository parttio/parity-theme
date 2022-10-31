package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.time.Duration;
import java.time.LocalTime;

@PageTitle("Time Picker")
@Route(value = "time-picker", layout = MainLayout.class)
public class TimePickerView extends VerticalLayout {
    public TimePickerView() {
        TimePicker timePicker = new TimePicker();
        timePicker.setLabel("Appointment time");
        timePicker.setHelperText("Open 8:00-16:00");
        timePicker.setStep(Duration.ofMinutes(30));
        timePicker.setValue(LocalTime.of(8, 30));
        timePicker.setMinTime(LocalTime.of(8, 0));
        timePicker.setMaxTime(LocalTime.of(16, 0));
        add(timePicker);
    }
}
