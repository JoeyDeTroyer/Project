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
    
    public void kijktechniek()
    {
        setCenter(new FXMLKijktechniekController(this));
    }
    
    public void schakeltechniek()
    {
        setCenter(new FXMLSchakeltechniekenController(this));
    }
    
    public void stuurtechniek()
    {
        setCenter(new FXMLStuurtechniekController(this));
    }
    
    public void remtechniek()
    {
        setCenter(new FXMLRemtechniekController(this));
    }
    
    public void koppeling()
    {
        setCenter(new FXMLKoppelingController(this));
    }
    
    public void helling()
    {
        setCenter(new FXMLVertrekkenOpHellingController(this));
    }
    
    public void parkeren()
    {
        setCenter(new FXMLParkerenController(this));
    }
    
    public void keren()
    {
        setCenter(new FXMLKerenController(this));
    }
    
    public void inhalen()
    {
        setCenter(new FXMLInhalenController(this));
    }
    
    public void linksaf()
    {
        setCenter(new FXMLLinksafController(this));
    }
    
    public void openbareWeg()
    {
        setCenter(new FXMLOpenbareWegController(this));
    }
    
    public void rechtsaf()
    {
        setCenter(new FXMLRechtsafController(this));
    }
    
    public void richtingaanwijzers()
    {
        setCenter(new FXMLRichtingaanwijzersController(this));
    }
    
    public void verkeerstekens()
    {
        setCenter(new FXMLVerkeerstekensController(this));
    }
    
    public void volgafstand()
    {
        setCenter(new FXMLVolgafstandController(this));
    }
}
