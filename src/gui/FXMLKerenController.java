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
        eenbeweging1.setToggleGroup(In_1_beweging);
        eenbeweging3.setToggleGroup(In_1_beweging);
        eenbeweging2.setToggleGroup(In_1_beweging);
        try {
        int getalKeren = Configuratie.evaluatie.getRijtechniek().getKeren().getKeren();
        
        if (getalKeren == 1){
            eenbeweging1.setSelected(true);
        } else if (getalKeren == 2){
            eenbeweging2.setSelected(true);
        } else if (getalKeren == 3){
            eenbeweging3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        Rijtechniek_Keren keren = new Rijtechniek_Keren();
        
        In_1_beweging.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
        
                if (eenbeweging1.isSelected() == true){
                    keren.setKeren(1);
                } else if (eenbeweging2.isSelected() == true) {
                    keren.setKeren(2); 
                } else {
                    keren.setKeren(3);
                }
                
                Configuratie.evaluatie.getRijtechniek().setKeren(keren);
                RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());    
            }
        });
        Leerling leerling = Configuratie.getLeerling();
        lblNaamLeerling.setText(leerling.getVolledigeNaam());
    
    }
    @FXML
    public void rijtechniek() {
        switcher.rijtechniek();
    }
}