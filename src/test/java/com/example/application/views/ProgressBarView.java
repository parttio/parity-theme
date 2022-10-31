package com.example.application.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Progress Bar")
@Route(value = "progress-bar", layout = MainLayout.class)
public class ProgressBarView extends VerticalLayout {

    public ProgressBarView() {
        add(new H3("Basic"));
        Component progressBar1 = createProgressBar(
                "new_file_1.xlsx", "50%", 0.5);
        add(progressBar1);

        add(new H3("Indeterminate"));
        Component progressBar2 = createIndProgressBar(
                "Generating report...", "Process can take upwards of 10 minutes");
        add(progressBar2);
    }

    private VerticalLayout createProgressBar(String label, String indicatorText, double value) {
        ProgressBar progressBar = new ProgressBar();
        progressBar.setValue(value);

        Div progressBarLabelText = new Div();
        progressBarLabelText.setText(label);

        Div progressBarLabelValue = new Div();
        progressBarLabelValue.setText(indicatorText);

        FlexLayout progressBarLabel = new FlexLayout();
        progressBarLabel.setJustifyContentMode(JustifyContentMode.BETWEEN);
        progressBarLabel.setWidthFull();
        progressBarLabel.add(progressBarLabelText, progressBarLabelValue);

        VerticalLayout progressBarLayout = new VerticalLayout(progressBarLabel, progressBar);
        progressBarLayout.setSpacing(false);
        progressBarLayout.setPadding(false);

        progressBarLayout.setWidth("500px");

        return progressBarLayout;
    }

    private VerticalLayout createIndProgressBar(String label, String subText) {
        ProgressBar progressBar = new ProgressBar();
        progressBar.setIndeterminate(true);

        Div progressBarLabel = new Div();
        progressBarLabel.setText(label);

        Div progressBarSubLabel = new Div();
        progressBarSubLabel.getStyle().set("font-size",
                "var(--lumo-font-size-xs)");
        progressBarSubLabel.setText(subText);

        VerticalLayout progressBarLayout = new VerticalLayout(progressBarLabel, progressBar, progressBarSubLabel);
        progressBarLayout.setSpacing(false);
        progressBarLayout.setPadding(false);

        progressBarLayout.setWidth("500px");

        return progressBarLayout;
    };
}
