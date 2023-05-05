package com.example.application.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.shared.Tooltip;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Tooltip")
@Route(value = "tooltip", layout = MainLayout.class)
public class TooltipView extends VerticalLayout {
    public TooltipView() {
        TextField textField = new TextField();
        textField.setPlaceholder("Search");
        textField.setPrefixComponent(new Icon("lumo", "search"));
        Button button = new Button(new Icon(VaadinIcon.INFO_CIRCLE));
        button.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE,
                ButtonVariant.LUMO_ICON);
        textField.setSuffixComponent(button);
        textField.setTooltipText("Wrap in “quotes” for exact phrase");
        Tooltip tooltip = textField.getTooltip().withManual(true);
        button.addClickListener(event -> {
            tooltip.setOpened(!tooltip.isOpened());
        });

        add(textField);
    }
}
