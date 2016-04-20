package gui;

import Models.Configuratie;
import Models.Leerling;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class FXMLVerkeerstechniekController extends BorderPane
{
    @FXML
    Button btnHome, btnInhalen, btnLinksaf, btnOpenbareWeg, btnRechtsaf, btnRichtingaanwijzers,
            btnVerkeerstekens, btnVolgafstand;
    @FXML
    Label lblNaamLeerling;
    
    ScreenSwitcher switcher;
    
    public FXMLVerkeerstechniekController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLVerkeerstechniek.fxml"));
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
    public void dashboard()
    {
        switcher.dashboard();
    }
    
    @FXML
    public void inhalen()
    {
        switcher.inhalen();
    }
    
    @FXML
    public void linksaf()
    {
        switcher.linksaf();
    }
    
    @FXML
    public void openbareWeg()
    {
        switcher.openbareWeg();
    }
    @FXML
    public void rechtsaf()
    {
        switcher.rechtsaf();
    }
    
    @FXML
    public void richtingaanwijzers()
    {
        switcher.richtingaanwijzers();
    }
    
    @FXML
    public void verkeerstekens()
    {
        switcher.verkeerstekens();
    }
    
    @FXML
    public void volgafstand()
    {
        switcher.volgafstand();
    }
}