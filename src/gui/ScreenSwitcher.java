package gui;
 
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class ScreenSwitcher  extends BorderPane
{
    public ScreenSwitcher()
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScreenSwitcher.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void dashboard()
    {
        setCenter(new FXMLDashboardController(this));
    }
    
    public void attitude()
    {
        setCenter(new FXMLAttitudeController(this));
    }
    
    public void rijtechniek()
    {
        setCenter(new FXMLRijtechniekController(this));
    }        
    
    public void verkeerstechniek()
    {
        setCenter(new FXMLVerkeerstechniekController(this));
    }
    public void zithouding()
    {
        setCenter(new FXMLZithoudingController(this));
    }
    public void logout()
    {
        setCenter(new FXMLInlogschermController(this));
    }
    public void nieuw()
    {
        setCenter(new FXMLNieuweLeerlingToevoegenController(this));
    }
}
