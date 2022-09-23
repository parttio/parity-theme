package com.example.application.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Number Field")
@Route(value = "number-field", layout = MainLayout.class)
public class NumberFieldView extends VerticalLayout {

    public NumberFieldView() {
        add(new H4("Basic"));

        NumberField leadingTextField = new NumberField();
        leadingTextField.setLabel("Balance");
        leadingTextField.setValue(200.0);
        Div prefix = new Div(new Text("$"));
        leadingTextField.setPrefixComponent(prefix);

        NumberField trailingTextField = new NumberField();
        trailingTextField.setLabel("Balance");
        trailingTextField.setValue(200.0);
        Div suffix = new Div(new Text("€"));
        trailingTextField.setSuffixComponent(suffix);

        HorizontalLayout basicLayout = new HorizontalLayout(leadingTextField, trailingTextField);
        add(basicLayout);

        add(new H4("Stepper Controls"));

        IntegerField integerField = new IntegerField();
        integerField.setLabel("Quantity");
        integerField.setHelperText("Max 10 items");
        integerField.setMin(0);
        integerField.setMax(10);
        integerField.setValue(2);
        integerField.setHasControls(true);
        add(integerField);
    }
}
