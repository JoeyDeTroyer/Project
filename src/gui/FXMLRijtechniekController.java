package gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class FXMLRijtechniekController extends BorderPane 
{
    @FXML
    Button btnHome, btnZithouding;
    
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
}
