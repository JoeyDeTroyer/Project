package gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class FXMLRemtechniekController extends BorderPane
{
    @FXML
    Button btnTerug;
    
    ScreenSwitcher switcher;
    
    public FXMLRemtechniekController(ScreenSwitcher switcher)
    {
         this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLRemtechniek.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void rijtechniek()
    {
        switcher.rijtechniek();
    }
}
