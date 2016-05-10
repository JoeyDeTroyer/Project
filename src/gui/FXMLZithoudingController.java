package gui;

import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Zithouding;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class FXMLZithoudingController extends BorderPane
{
    @FXML
    Button btnTerug;
    @FXML
    Label lblNaamLeerling;
    @FXML
    RadioButton zithoudingZelf1, zithoudingZelf2, zithoudingZelf3, gordel1, gordel2, gordel3,
            spiegels1, spiegels2, spiegels3, handrem1, handrem2, handrem3, andere1,
            andere2, andere3;

    @FXML
    ToggleGroup zithoudingGroep, gordelGroep, spiegelsGroep, handremGroep, andereGroep;
    
    @FXML
    TextArea zithoudingOpmerking;
    
    ScreenSwitcher switcher;
    
    public FXMLZithoudingController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLZithouding.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//        Rijtechniek_Zithouding zithouding  = new Rijtechniek_Zithouding();
        //Zithouding groep maken
        zithoudingZelf1.setToggleGroup(zithoudingGroep);
        zithoudingZelf2.setToggleGroup(zithoudingGroep);
        zithoudingZelf3.setToggleGroup(zithoudingGroep);
        
        //Gordel groep maken
        gordel1.setToggleGroup(gordelGroep);
        gordel2.setToggleGroup(gordelGroep);
        gordel3.setToggleGroup(gordelGroep);
        
        //Spiegels groep maken
        spiegels1.setToggleGroup(spiegelsGroep);
        spiegels2.setToggleGroup(spiegelsGroep);
        spiegels3.setToggleGroup(spiegelsGroep);
        
        //Handrem groep maken
        handrem1.setToggleGroup(handremGroep);
        handrem2.setToggleGroup(handremGroep);
        handrem3.setToggleGroup(handremGroep);
        
        //Handrem groep maken
        andere1.setToggleGroup(andereGroep);
        andere2.setToggleGroup(andereGroep);
        andere3.setToggleGroup(andereGroep);
        try {
                String text = Configuratie.evaluatie.getRijtechniek().getZithouding().getZithoudingOpm();
        zithoudingOpmerking.setText(text);
            } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        //Zithouding controle
        try {
        
        int getalZithouding = Configuratie.evaluatie.getRijtechniek().getZithouding().getZithouding();
        System.out.println("ZITHOUDING " + getalZithouding);
        if (getalZithouding == 1){
            zithoudingZelf1.setSelected(true);
        } else if (getalZithouding == 2){
            zithoudingZelf2.setSelected(true);
        } else if (getalZithouding == 3){
            zithoudingZelf3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //Gordel controle
        try {
            
        int getalGordel = Configuratie.evaluatie.getRijtechniek().getZithouding().getZithoudingGordels();
         
        if (getalGordel == 1){
            gordel1.setSelected(true);
        } else if (getalGordel == 2){
            gordel2.setSelected(true);
        } else if (getalGordel == 3){
            gordel3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //Spiegels controle
        try {
            
        int getalSpiegels = Configuratie.evaluatie.getRijtechniek().getZithouding().getZithoudingSpiegels();
           
        if (getalSpiegels == 1){
            spiegels1.setSelected(true);
        } else if (getalSpiegels == 2){
            spiegels2.setSelected(true);
        } else if (getalSpiegels == 3){
            spiegels3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //Handrem controle
        try {
            
        int getalHandrem = Configuratie.evaluatie.getRijtechniek().getZithouding().getZithoudingHandrem();
           
        if (getalHandrem == 1){
            handrem1.setSelected(true);
        } else if (getalHandrem == 2){
            handrem2.setSelected(true);
        } else if (getalHandrem == 3){
            handrem3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //Andere controle
        try {
            
        int getalAndere = Configuratie.evaluatie.getRijtechniek().getZithouding().getZithoudingAndere();
           
        if (getalAndere == 1){
            andere1.setSelected(true);
        } else if (getalAndere == 2){
            andere2.setSelected(true);
        } else if (getalAndere == 3){
            andere3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
               
        //Controle voor Zithouding
        zithoudingGroep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            Rijtechniek_Zithouding zithouding = new Rijtechniek_Zithouding();
                int getal = 0;
                if (zithoudingZelf1.isSelected() == true){
                    zithouding.setZithouding(1);
                    getal = 1;
                    System.out.println("1");
                } else if (zithoudingZelf2.isSelected() == true) {
                   getal = 2;
                   zithouding.setZithouding(2);
                } else {
                    getal = 3;
                    zithouding.setZithouding(3);
                }
                
                Configuratie.evaluatie.getRijtechniek().setZithouding(zithouding);
            }
        });
        
        //Controle voor gordels
        gordelGroep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            int getal = 0;
//            Rijtechniek_Zithouding zithoudingGordels = new Rijtechniek_Zithouding();
                if (gordel1.isSelected() == true){
                    getal = 1;
//                    zithoudingGordels.setZithoudingGordels(1);
                    
                } else if (gordel2.isSelected() == true) {
                    getal = 2;
//                    zithoudingGordels.setZithoudingGordels(2);
                } else {
                    getal = 3;
//                    zithoudingGordels.setZithoudingGordels(3);
                }
                
                Configuratie.evaluatie.getRijtechniek().getZithouding().setZithoudingGordels(getal);
            }
        });
        
        //Controle voor spiegels
        spiegelsGroep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
        int getal = 0;
                if (spiegels1.isSelected() == true){
                    getal = 1;
                    
                } else if (spiegels2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                
                Configuratie.evaluatie.getRijtechniek().getZithouding().setZithoudingSpiegels(getal);
            }
        });
        
        //Controle voor handrem
        handremGroep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
        int getal = 0;
                if (handrem1.isSelected() == true){
                    getal = 1;
                    
                } else if (handrem2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                
                Configuratie.evaluatie.getRijtechniek().getZithouding().setZithoudingHandrem(getal);
            }
        });
        
        //Controle voor andere
        andereGroep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
        int getal = 0;
                if (andere1.isSelected() == true){
                    getal = 1;
                    
                } else if (andere2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                
                Configuratie.evaluatie.getRijtechniek().getZithouding().setZithoudingAndere(getal);
            }
        });
        
        Leerling leerling = Configuratie.getLeerling();
        lblNaamLeerling.setText(leerling.getVolledigeNaam());
    } 
   
    @FXML
    public void rijtechniek()
    {
        switcher.rijtechniek();
       
        Configuratie.evaluatie.getRijtechniek().getZithouding().setZithoudingOpm(zithoudingOpmerking.getText());
        RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());    

        
        
    }
}
