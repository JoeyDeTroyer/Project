package gui;

import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Keren;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class FXMLKerenController extends BorderPane {

    @FXML
    Button btnTerug;

    @FXML
    RadioButton eenbeweging1, eenbeweging2, eenbeweging3;

    @FXML
    ToggleGroup In_1_beweging;

    @FXML
    Label lblNaamLeerling;

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

        Leerling leerling = Configuratie.getLeerling();
        lblNaamLeerling.setText(leerling.getVolledigeNaam());

    }

    @FXML
    public void rijtechniek() {
        switcher.rijtechniek();
    }
}
