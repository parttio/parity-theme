package com.example.application.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.demo.domain.DataService;

@PageTitle("Rich Text Editor")
@Route(value = "rich-text-editor-basic", layout = MainLayout.class)
public class RichTextEditorBasic extends Div {

    public RichTextEditorBasic() {
        RichTextEditor rte = new RichTextEditor();
        String valueAsDelta = DataService.getTemplates().getRichTextDelta();
        rte.setValue(valueAsDelta);
        add(rte);
    }

}
