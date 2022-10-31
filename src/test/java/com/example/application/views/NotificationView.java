package com.example.application.views;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Notification")
@Route(value = "notification", layout = MainLayout.class)
public class NotificationView extends VerticalLayout {

    public NotificationView() {
        setClassName("notification-position-example");

        add(createButton(Position.TOP_STRETCH),
                createButton(Position.TOP_START),
                createButton(Position.TOP_CENTER),
                createButton(Position.TOP_END), createButton(Position.MIDDLE),
                createButton(Position.BOTTOM_START),
                createButton(Position.BOTTOM_CENTER),
                createButton(Position.BOTTOM_END),
                createButton(Position.BOTTOM_STRETCH));
    }

    private Button createButton(Notification.Position position) {
        Button button = new Button(position.getClientName());
        button.addClickListener(event -> show(position));
        return button;
    }

    private void show(Notification.Position position) {
        Notification.show(position.getClientName(), 0, position);
    }
}
