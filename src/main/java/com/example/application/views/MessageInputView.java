package com.example.application.views;

import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Message Input")
@Route(value = "message-input", layout = MainLayout.class)
public class MessageInputView extends VerticalLayout {
    public MessageInputView() {
        MessageInput input = new MessageInput();
        input.addSubmitListener(submitEvent -> {
            Notification.show("Message received: " + submitEvent.getValue(),
                    3000, Notification.Position.MIDDLE);
        });
        add(input);
    }
}