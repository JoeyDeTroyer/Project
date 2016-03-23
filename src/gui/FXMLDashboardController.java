package gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FXMLDashboardController extends BorderPane
{
    @FXML
    Label lblNaamLeerling;
    
    @FXML
    Button btnRijtechniek, btnAttitude, btnVerkeerstechniek, btnLogout,btnEvaluatie1,btnEvaluatie2,btnEvaluatie3, btnMin, btnPlus;
    
    @FXML
    ToggleButton btnBanden, btnTanken, btnNoodstop, btnGPS, btnVloeistoffen, btnSchakelaars;
    
    @FXML
    TextArea txtOpmerkingen;
    
    @FXML
    Circle circleSchakelaars, circleVloeistoffen, circleBanden, circleTanken, circleGPS, circleNoodstop;
    
    @FXML
    ProgressBar progressbar;      
    
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
    
    @FXML
    public void schakelaars()
    {
        if(circleSchakelaars.getFill() == Color.WHITE)
        {
            circleSchakelaars.setFill(Color.GREEN);
        }
        else
        {
            circleSchakelaars.setFill(Color.WHITE);
        }
    }
    
    @FXML
    public void vloeistoffen()
    {
        if(circleVloeistoffen.getFill() == Color.WHITE)
        {
            circleVloeistoffen.setFill(Color.GREEN);
        }
        else
        {
            circleVloeistoffen.setFill(Color.WHITE);
        }
    }
    
    
    @FXML
    public void banden()
    {
        if(circleBanden.getFill() == Color.WHITE)
        {
            circleBanden.setFill(Color.GREEN);
        }
        else
        {
            circleBanden.setFill(Color.WHITE);
        }
    }
    
    
    @FXML
    public void tanken()
    {
        if(circleTanken.getFill() == Color.WHITE)
        {
            circleTanken.setFill(Color.GREEN);
        }
        else
        {
            circleTanken.setFill(Color.WHITE);
        }
    }
    
    @FXML
    public void gps()
    {
        if(circleGPS.getFill() == Color.WHITE)
        {
            circleGPS.setFill(Color.GREEN);
        }
        else
        {
            circleGPS.setFill(Color.WHITE);
        }
    }
    
    @FXML
    public void noodstop()
    {
        if(circleNoodstop.getFill() == Color.WHITE)
        {
            circleNoodstop.setFill(Color.GREEN);
        }
        else
        {
            circleNoodstop.setFill(Color.WHITE);
        }
    }
    
    @FXML 
    public void pbMin()
    {
        if(progressbar.getProgress() == 0)
        {
            //kan niet lager dan 0
        }
        else{
            progressbar.setProgress(progressbar.getProgress() - 0.05);
        }
    }
    
    @FXML
    public void pbPlus()
    {
      if(progressbar.getProgress() == 1)
        {
            //kan niet hoger dan 1
        }
        else{
            progressbar.setProgress(progressbar.getProgress() + 0.05);
        }   
    }
}
