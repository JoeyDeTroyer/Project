package gui;

import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Remtechniek;
import Models.Rijtechniek.Rijtechniek_Stuuroefening;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FXMLRijtechniekController extends BorderPane 
{
    @FXML
    Label lblNaamLeerling;
    @FXML
    Button btnHome, btnZithouding, btnKijktechniek, btnSchakeltechniek, btnStuurtechniek, btnRemtechniek, 
            btnKoppeling, btnHelling, btnParkeren, btnKeren, btnStuuroefening;
    
    @FXML
    Circle stuuroefening;
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
        RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

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
    
    @FXML
    public void stuuroef()
    {     
        try {
            int getalStuuroefening = Configuratie.evaluatie.getRijtechniek().getStuuroefening().getStuuroefening();            
        if (getalStuuroefening == 1){
            stuuroefening.setFill(Color.ORANGE);
        } else if (getalStuuroefening == 2){
            stuuroefening.setFill(Color.GREEN);
        } else if (getalStuuroefening == 3)
            stuuroefening.setFill(Color.WHITE);
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        } 
//        Rijtechniek_Stuuroefening rStuuroefening = new Rijtechniek_Stuuroefening();    
        int getal = 0;
        if(stuuroefening.getFill() == Color.WHITE)
        {
            stuuroefening.setFill(Color.ORANGE);
            getal =1;
//            rStuuroefening.setStuuroefening(1);
//            Configuratie.evaluatie.getRijtechniek().setStuuroefening(rStuuroefening);
            Configuratie.evaluatie.getRijtechniek().getStuuroefening().setStuuroefening(getal);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        }
        else if (stuuroefening.getFill() == Color.ORANGE)
        {
            getal = 2;
            stuuroefening.setFill(Color.GREEN);
//            rStuuroefening.setStuuroefening(2);
//            Configuratie.evaluatie.getRijtechniek().setStuuroefening(rStuuroefening);
            Configuratie.evaluatie.getRijtechniek().getStuuroefening().setStuuroefening(getal);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
//            System.out.println("getalstuuroef is " + rStuuroefening.toString());
        } else
        {
            getal = 3;
//            rStuuroefening.setStuuroefening(3);
            stuuroefening.setFill(Color.WHITE);
//            Configuratie.evaluatie.getRijtechniek().setStuuroefening(rStuuroefening);
            Configuratie.evaluatie.getRijtechniek().getStuuroefening().setStuuroefening(getal);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        }     
    }
}
