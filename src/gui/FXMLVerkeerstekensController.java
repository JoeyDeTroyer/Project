package gui;

import Models.Configuratie;
import Models.Leerling;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class FXMLVerkeerstekensController extends BorderPane
{
    @FXML
    Button btnTerug;
    @FXML
    Label lblNaamLeerling;
    
    ScreenSwitcher switcher;
    
    public FXMLVerkeerstekensController(ScreenSwitcher switcher)
    {
         this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLVerkeerstekens.fxml"));
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
    public void verkeerstechniek()
    {
        switcher.verkeerstechniek();
    }
}
