package gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class FXMLDashboardController extends BorderPane
{
    @FXML
    Label lblNaamLeerling;
    
    @FXML
    Button btnRijtechniek, btnAttitude, btnVerkeerstechniek, btnLogout,btnEvaluatie1,btnEvaluatie2,btnEvaluatie3;
    
    @FXML
    TextArea txtOpmerkingen;
    
    ScreenSwitcher switcher;
    
    public FXMLDashboardController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDashboard.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void attitude()
    {
        switcher.attitude();
    }
    
    @FXML
    public void rijtechniek()
    {
        switcher.rijtechniek();
    }
    
    @FXML
    public void verkeerstechniek()
    {
        switcher.verkeerstechniek();
    }
    
    @FXML
    public void logout()
    {
        switcher.logout();
    }
}
