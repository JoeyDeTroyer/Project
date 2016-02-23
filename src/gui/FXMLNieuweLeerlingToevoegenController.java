package gui;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class FXMLNieuweLeerlingToevoegenController extends BorderPane
{
    ScreenSwitcher switcher;
    
    public FXMLNieuweLeerlingToevoegenController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLNieuweLeerlingToevoegen.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
