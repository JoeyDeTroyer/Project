package gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class FXMLAttitudeController extends BorderPane
{
    @FXML
    Button btnHome;
    
    ScreenSwitcher switcher;
    
    public FXMLAttitudeController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAttitude.fxml"));
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

    
}
