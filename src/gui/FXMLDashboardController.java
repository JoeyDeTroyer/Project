package gui;

import DAO.EvaluatieDAO;
import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Evaluatie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import project.Model;

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
    Circle circleSchakelaars, circleVloeistoffen, circleBanden, circleTanken, circleGPS, circleNoodstop, circleAutostrade, circleStad, circleRijstroken, circleRotonde;
    
    @FXML
    ProgressBar progressbar;      
    
    ScreenSwitcher switcher;
    private ObservableList<Evaluatie> evaluatie;
    private Evaluatie evaluatietest;
    
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
        Leerling leerling = Configuratie.getLeerling();
        progressbar.setProgress(0);
        btnMin.setDisable(true);
        lblNaamLeerling.setText(leerling.getVolledigeNaam());
    }
    
    @FXML
    public void attitude()
    {
        switcher.attitude();
    }
    
    
    @FXML
    public void evaluatie1()
    {
       evaluatietest = EvaluatieDAO.getInstance().findAllByLeerling(Configuratie.leerling, 1);
       if (evaluatietest == null){
           Evaluatie nieuweEvaluatie = new Evaluatie();
           Rijtechniek rijtechniek  = new Rijtechniek();
           //rijtechniek.setId(1);
           RijtechniekDAO.getInstance().addRijtechniek(rijtechniek);
           nieuweEvaluatie.setRijtechniek(rijtechniek);
           nieuweEvaluatie.setLeerling(Configuratie.leerling);
           nieuweEvaluatie.setVolgNummer(1);
           EvaluatieDAO.getInstance().addEvaluatie(nieuweEvaluatie);
           evaluatietest = EvaluatieDAO.getInstance().findAllByLeerling(Configuratie.leerling, 1);
       } 
            Configuratie.setEvaluatie(evaluatietest);
            System.out.println(evaluatietest.getLeerling().getNaamVoornaam());   
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
        btnPlus.setDisable(false);
        if(progressbar.getProgress() <= 0.101)
        {
            //kan niet lager dan 0
            progressbar.setProgress(0);
            btnMin.setDisable(true);
        }
        else
        {
            progressbar.setProgress(progressbar.getProgress() - 0.1);
        }
    }
    
    @FXML
    public void pbPlus()
    {
      btnMin.setDisable(false);
      
      if(progressbar.getProgress() >= 0.899)
        {
            //kan niet hoger dan 1
            progressbar.setProgress(1);
            btnPlus.setDisable(true);
        }
        else
        {
            progressbar.setProgress(progressbar.getProgress() + 0.1);
        }   
    }
    
    @FXML
    public void rotonde()
    {
        if(circleRotonde.getFill() == Color.WHITE)
        {
            circleRotonde.setFill(Color.RED);
        }
        else if(circleRotonde.getFill() == Color.RED)
        {
            circleRotonde.setFill(Color.ORANGE);
        }
        else if(circleRotonde.getFill() == Color.ORANGE)
        {
            circleRotonde.setFill(Color.GREEN);
        }
        else
        {
            circleRotonde.setFill(Color.WHITE);
        }
    }
    
    @FXML
    public void rijstroken()
    {
        if(circleRijstroken.getFill() == Color.WHITE)
        {
            circleRijstroken.setFill(Color.RED);
        }
        else if(circleRijstroken.getFill() == Color.RED)
        {
            circleRijstroken.setFill(Color.ORANGE);
        }
        else if(circleRijstroken.getFill() == Color.ORANGE)
        {
            circleRijstroken.setFill(Color.GREEN);
        }
        else
        {
            circleRijstroken.setFill(Color.WHITE);
        }
    }
    
    @FXML
    public void stad()
    {
        if(circleStad.getFill() == Color.WHITE)
        {
            circleStad.setFill(Color.RED);
        }
        else if(circleStad.getFill() == Color.RED)
        {
            circleStad.setFill(Color.ORANGE);
        }
        else if(circleStad.getFill() == Color.ORANGE)
        {
            circleStad.setFill(Color.GREEN);
        }
        else
        {
            circleStad.setFill(Color.WHITE);
        }
    }
    
    @FXML
    public void autostrade()
    {
        if(circleAutostrade.getFill() == Color.WHITE)
        {
            circleAutostrade.setFill(Color.RED);
        }
        else if(circleAutostrade.getFill() == Color.RED)
        {
            circleAutostrade.setFill(Color.ORANGE);
        }
        else if(circleAutostrade.getFill() == Color.ORANGE)
        {
            circleAutostrade.setFill(Color.GREEN);
        }
        else
        {
            circleAutostrade.setFill(Color.WHITE);
        }
    }
    
}
