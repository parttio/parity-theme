package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Message Input")
@Route(value = "message-input", layout = MainLayout.class)
public class MessageInput extends VerticalLayout {
    public MessageInput() {
        MessageInput input = new MessageInput();
        add(input);
    }
}
