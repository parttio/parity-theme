package com.example.application.views;

import com.vaadin.demo.domain.DataService;
import com.vaadin.demo.domain.Person;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Avatar")
@Route(value = "avatar", layout = MainLayout.class)
public class AvatarView extends VerticalLayout {

    private Person person = null;

    public AvatarView() {
        person = DataService.getPeople(1).get(0);
        String name = person.getFirstName() + " " + person.getLastName();
        String pictureUrl = person.getPictureUrl();

        Avatar avatarBasic = new Avatar();

        Avatar avatarName = new Avatar(name);

        Avatar avatarImage = new Avatar(name);
        avatarImage.setImage(pictureUrl);

        add(avatarBasic, avatarName, avatarImage);
    }
}
