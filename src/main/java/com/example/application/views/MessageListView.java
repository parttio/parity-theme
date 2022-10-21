package com.example.application.views;

import com.vaadin.demo.domain.DataService;
import com.vaadin.demo.domain.Person;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;

@PageTitle("Message List")
@Route(value = "message-list", layout = MainLayout.class)
public class MessageListView extends VerticalLayout {
    public MessageListView() {
        Person person = DataService.getPeople(1).get(0);

        MessageList list = new MessageList();

        Instant yesterday = LocalDateTime.now().minusDays(1)
                .toInstant(ZoneOffset.UTC);
        Instant fiftyMinsAgo = LocalDateTime.now().minusMinutes(50)
                .toInstant(ZoneOffset.UTC);

        MessageListItem message1 = new MessageListItem(
                "Linsey, could you check if the details with the order are okay?",
                yesterday, "Matt Mambo");
        message1.setUserColorIndex(1);

        MessageListItem message2 = new MessageListItem("All good. Ship it.",
                fiftyMinsAgo, "Linsey Listy", person.getPictureUrl());
        message2.setUserColorIndex(2);

        MessageListItem message3 = new MessageListItem("All good. Ship it.",
                fiftyMinsAgo, "Linsey Listy", person.getPictureUrl());
        message3.setUserColorIndex(2);

        MessageListItem message4 = new MessageListItem("All good. Ship it.",
                fiftyMinsAgo, "Linsey Listy", person.getPictureUrl());
        message4.setUserColorIndex(2);

        MessageListItem message5 = new MessageListItem("Looks good to me :)",
                fiftyMinsAgo, "Daniel Sarkwa");
        message5.setUserColorIndex(3);
        message5.addThemeNames("current-user");

        list.setItems(Arrays.asList(message1, message2, message3, message4, message5));
        add(list);
    }
}
