package gui;

import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class FXMLKerenController extends BorderPane {

    @FXML
    Button btnTerug;

    @FXML
    ToggleGroup In_1_beweging;

    ScreenSwitcher switcher;

    public FXMLKerenController(ScreenSwitcher switcher) {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLKeren.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        In_1_beweging.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {

                if (In_1_beweging.getSelectedToggle() != null) {

                    System.out.println(In_1_beweging.getSelectedToggle().getUserData().toString());
                    // Do something here with the userData of newly selected radioButton

                }

            }
        });
    }

    @FXML
    public void rijtechniek() {
        switcher.rijtechniek();
    }
}
