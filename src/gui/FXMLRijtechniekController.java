package gui;

import Models.Configuratie;
import Models.Leerling;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class FXMLRijtechniekController extends BorderPane 
{
    @FXML
    Label lblNaamLeerling;
    @FXML
    Button btnHome, btnZithouding, btnKijktechniek, btnSchakeltechniek, btnStuurtechniek, btnRemtechniek, 
            btnKoppeling, btnHelling, btnParkeren, btnKeren;
    
    ScreenSwitcher switcher;
    
    public FXMLRijtechniekController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLRijtechniek.fxml"));
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
    public void zithouding()
    {
        switcher.zithouding();
    }
    
    @FXML
    public void kijktechniek()
    {
        switcher.kijktechniek();
    }
    
    @FXML
    public void schakeltechniek()
    {
        switcher.schakeltechniek();
    }
    
    @FXML
    public void stuurtechniek()
    {
        switcher.stuurtechniek();
    }
    
    @FXML
    public void remtechniek()
    {
        switcher.remtechniek();
    }
    
    @FXML
    public void koppeling()
    {
        switcher.koppeling();
    }
    
    @FXML
    public void helling()
    {
        switcher.helling();
    }
    
    @FXML
    public void parkeren()
    {
        switcher.parkeren();
    }
    
    @FXML
    public void keren()
    {
        switcher.keren();
    }
}
