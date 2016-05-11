package gui;

import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Remtechniek;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class FXMLRemtechniekController extends BorderPane
{
    @FXML
    Button btnTerug;
    
    @FXML
    Label lblNaamLeerling;   
    
    @FXML
    RadioButton rij1Kolom1, rij1Kolom2, rij1Kolom3, rij2Kolom1, rij2Kolom2, rij2Kolom3,
            rij3Kolom1, rij3Kolom2, rij3Kolom3, rij4Kolom1, rij4Kolom2, rij4Kolom3;
    
    @FXML
    ToggleGroup rij1Groep, rij2Groep, rij3Groep, rij4Groep;
    
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
        
         //Eerste groep aanmaken (Dosering)
        rij1Kolom1.setToggleGroup(rij1Groep);
        rij1Kolom2.setToggleGroup(rij1Groep);
        rij1Kolom3.setToggleGroup(rij1Groep);
        
        //Tweede groep aanmaken (Volgorde)
        rij2Kolom1.setToggleGroup(rij2Groep);
        rij2Kolom2.setToggleGroup(rij2Groep);
        rij2Kolom3.setToggleGroup(rij2Groep);
        
        //Derde groep aanmaken (Te Laat)
        rij3Kolom1.setToggleGroup(rij3Groep);
        rij3Kolom2.setToggleGroup(rij3Groep);
        rij3Kolom3.setToggleGroup(rij3Groep);
        
        //Vierde groep aanmaken (Andere Gebruik)
        rij4Kolom1.setToggleGroup(rij4Groep);
        rij4Kolom2.setToggleGroup(rij4Groep);
        rij4Kolom3.setToggleGroup(rij4Groep);
        
        
        //CONTROLES SELECTIE BUTTONS//
        
        //Controle eerste groep (Dosering)
        try {
            
        int getalGroep1 = Configuratie.evaluatie.getRijtechniek().getRemTechniek().getRemtechniekDosering();
         
        if (getalGroep1 == 1){
            rij1Kolom1.setSelected(true);
        } else if (getalGroep1 == 2){
            rij1Kolom2.setSelected(true);
        } else if (getalGroep1 == 3){
            rij1Kolom3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //Controle tweede groep (Volgorde)
        try {
            
        int getalGroep2 = Configuratie.evaluatie.getRijtechniek().getRemTechniek().getRemtechniekVolgorde();
         
        if (getalGroep2 == 1){
            rij2Kolom1.setSelected(true);
        } else if (getalGroep2 == 2){
            rij2Kolom2.setSelected(true);
        } else if (getalGroep2 == 3){
            rij2Kolom3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //Controle derde groep (Te Laat)
        try {
            
        int getalGroep3 = Configuratie.evaluatie.getRijtechniek().getRemTechniek().getRemtechniekTeLaat();
         
        if (getalGroep3 == 1){
            rij3Kolom1.setSelected(true);
        } else if (getalGroep3 == 2){
            rij3Kolom2.setSelected(true);
        } else if (getalGroep3 == 3){
            rij3Kolom3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //Controle vierde groep (Gebruik Andere)
        try {
            
        int getalGroep4 = Configuratie.evaluatie.getRijtechniek().getRemTechniek().getRemtechniekGebruikAndere();
         
        if (getalGroep4 == 1){
            rij4Kolom1.setSelected(true);
        } else if (getalGroep4 == 2){
            rij4Kolom2.setSelected(true);
        } else if (getalGroep4 == 3){
            rij4Kolom3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //CHANGELISTENERS// 
        
        //Controle voor Dosering(Groep 1)
        rij1Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            Rijtechniek_Remtechniek remtechniek = new Rijtechniek_Remtechniek();
                if (rij1Kolom1.isSelected() == true){
                    remtechniek.setRemtechniekDosering(1);
                } else if (rij1Kolom2.isSelected() == true) {
                    remtechniek.setRemtechniekDosering(2);
                } else {
                    remtechniek.setRemtechniekTeLaat(3);
                }
                Configuratie.evaluatie.getRijtechniek().setRemTechniek(remtechniek);
            }});
        
         //Controle voor Volgorde (Groep 2)
        rij2Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            int getal = 0;
                if (rij2Kolom1.isSelected() == true){
                    getal = 1;                    
                } else if (rij2Kolom2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                Configuratie.evaluatie.getRijtechniek().getRemTechniek().setRemtechniekVolgorde(getal);
            }
        });
        
        //Controle voor Te Laat (Groep 3)
        rij3Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            int getal = 0;
                if (rij3Kolom1.isSelected() == true){
                    getal = 1;                    
                } else if (rij3Kolom2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                
                Configuratie.evaluatie.getRijtechniek().getRemTechniek().setRemtechniekTeLaat(getal);
            }
        });
        
        //Controle voor Gebruik Andere (Groep 4)
        rij4Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            int getal = 0;
                if (rij4Kolom1.isSelected() == true){
                    getal = 1;                    
                } else if (rij4Kolom2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                
                Configuratie.evaluatie.getRijtechniek().getRemTechniek().setRemtechniekGebruikAndere(getal);
            }
        });
        
        Leerling leerling = Configuratie.getLeerling();
        lblNaamLeerling.setText(leerling.getVolledigeNaam());
    }
    
    @FXML
    public void rijtechniek()
    {
        RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        switcher.rijtechniek();
    }
}
