/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Models.Leerling;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.LabelBuilder;
import javafx.scene.control.ListCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class LeerlingCell extends ListCell<Leerling>{
    private Leerling leerling;
    private HBox content;
    private Label title;
    
        public LeerlingCell() {
        title = new Label("Title");
        title.setMaxWidth(Double.MAX_VALUE);
        title.setPrefSize(35, 35);
        HBox.setHgrow(title, Priority.ALWAYS);
        content = new HBox(15);
        content.setAlignment(Pos.CENTER_LEFT);
        
        title.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                System.out.println("Test");
                // And check for errors afterwards.
            }
        });
        
        content.getChildren().addAll(title);
    }

    @Override
    protected void updateItem(Leerling item, boolean empty) {
        super.updateItem(item, empty);
        
        if (!empty) {
            leerling = item;
            title.setText(leerling.getNaamVoornaam());
            setGraphic(content);
        }
    }
    
    
}
