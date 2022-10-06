package com.example.application.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Confirm Dialog")
@Route(value = "confirm-dialog", layout = MainLayout.class)
public class ConfirmDialogView extends VerticalLayout {
    private Span status;

    public ConfirmDialogView() {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        layout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);

        status = new Span();
        status.setVisible(false);

        ConfirmDialog dialog = new ConfirmDialog();
        dialog.setHeader("Dialog title");
        dialog.setText("Lorem ipsum dolor. Sit amet magna donec neque ut nunc dui eget. Ut dui eu torquent neque maecenas. Scelerisque adipiscing est quam sed orci. Nonummy nibh litora netus arcu vitae. Congue et sed. Litora mi eu mauris nascetur id. Ut quis phasellus ac est sollicitudin. Suspendisse duis wisi.");
        dialog.setCancelable(true);
        dialog.addCancelListener(event -> setStatus("Canceled"));

        dialog.setRejectable(true);
        dialog.setRejectText("Secondary");
        Button rejectButton = new Button("Secondary");
        rejectButton.addThemeVariants(ButtonVariant.LUMO_ERROR);
        rejectButton.addThemeName("secondary");
        dialog.setRejectButton(rejectButton);
        dialog.addRejectListener(event -> setStatus("Discarded"));

        dialog.setConfirmText("Primary");
        dialog.addConfirmListener(event -> setStatus("Saved"));

        Button button = new Button("Open confirm dialog");
        button.addClickListener(event -> {
            dialog.open();
            status.setVisible(false);
        });

        layout.add(button, status);
        add(layout);
    }

    private void setStatus(String value) {
        status.setText("Status: " + value);
        status.setVisible(true);
    }
}
