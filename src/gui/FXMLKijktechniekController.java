package gui;

import DAO.EvaluatieDAO;
import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Kijktechniek;
import java.io.IOException;
import java.util.Optional;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class FXMLKijktechniekController extends BorderPane
{
    @FXML
    Button btnTerug;
    
    @FXML
    Label lblNaamLeerling;
    
    @FXML
    RadioButton rij1Kolom1, rij1Kolom2, rij1Kolom3, rij2Kolom1, rij2Kolom2, rij2Kolom3,
            rij3Kolom1, rij3Kolom2, rij3Kolom3, rij4Kolom1, rij4Kolom2, rij4Kolom3,
            rij5Kolom1, rij5Kolom2, rij5Kolom3, rij6Kolom1, rij6Kolom2, rij6Kolom3;
    
    @FXML
    ToggleGroup rij1Groep, rij2Groep, rij3Groep, rij4Groep, rij5Groep, rij6Groep;
    @FXML
    TextArea kijktechniekOpmerking;
    
    ScreenSwitcher switcher;
    
    public FXMLKijktechniekController(ScreenSwitcher switcher)
    {
          this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLKijktechniek.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            String text = Configuratie.evaluatie.getRijtechniek().getKijkTechniek().getKijkTechniekOpm();
            kijktechniekOpmerking.setText(text);
        } catch (NullPointerException ex) {
        }
        
        //TOGGLEGROUPS AANMAKEN//
        
         //Eerste groep aanmaken (Vergewissen)
        rij1Kolom1.setToggleGroup(rij1Groep);
        rij1Kolom2.setToggleGroup(rij1Groep);
        rij1Kolom3.setToggleGroup(rij1Groep);
        
        //Tweede groep aanmaken (Spiegels)
        rij2Kolom1.setToggleGroup(rij2Groep);
        rij2Kolom2.setToggleGroup(rij2Groep);
        rij2Kolom3.setToggleGroup(rij2Groep);
        
        //Derde groep aanmaken (Dode hoek)
        rij3Kolom1.setToggleGroup(rij3Groep);
        rij3Kolom2.setToggleGroup(rij3Groep);
        rij3Kolom3.setToggleGroup(rij3Groep);
        
        //Vierde groep aanmaken (Ver genoeg)
        rij4Kolom1.setToggleGroup(rij4Groep);
        rij4Kolom2.setToggleGroup(rij4Groep);
        rij4Kolom3.setToggleGroup(rij4Groep);
        
        //Vijfde groep aanmaken (Selecteren)
        rij5Kolom1.setToggleGroup(rij5Groep);
        rij5Kolom2.setToggleGroup(rij5Groep);
        rij5Kolom3.setToggleGroup(rij5Groep);
        
        //Zesde groep aanmaken (Andere)
        rij6Kolom1.setToggleGroup(rij6Groep);
        rij6Kolom2.setToggleGroup(rij6Groep);
        rij6Kolom3.setToggleGroup(rij6Groep);
        
         //CONTROLE VOOR SELECTIE//
        
        //Controle eerste groep (Vergewissen)
        try {
            
        int getalGroep1 = Configuratie.evaluatie.getRijtechniek().getKijkTechniek().getKijkTechniekVergewissen();
         
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
        
        //Controle tweede groep (Spiegels)
        try {
            
        int getalGroep2 = Configuratie.evaluatie.getRijtechniek().getKijkTechniek().getKijkTechniekSpiegels();
         
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
        
        //Controle derde groep (Dode hoek)
        try {
            
        int getalGroep3 = Configuratie.evaluatie.getRijtechniek().getKijkTechniek().getKijkTechniekDodeHoek();
         
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
        
        //Controle vierde groep (Ver genoeg)
        try {
            
        int getalGroep4 = Configuratie.evaluatie.getRijtechniek().getKijkTechniek().getKijkTechniekVerGenoeg();
         
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
        
        //Controle vijfde groep (Selecteren)
        try {
            
        int getalGroep5 = Configuratie.evaluatie.getRijtechniek().getKijkTechniek().getKijkTechniekSelecteren();
         
        if (getalGroep5 == 1){
            rij5Kolom1.setSelected(true);
        } else if (getalGroep5 == 2){
            rij5Kolom2.setSelected(true);
        } else if (getalGroep5 == 3){
            rij5Kolom3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        //Controle zesde groep (Andere)
        try {
            
        int getalGroep6 = Configuratie.evaluatie.getRijtechniek().getKijkTechniek().getKijkTechniekAndere();
         
        if (getalGroep6 == 1){
            rij6Kolom1.setSelected(true);
        } else if (getalGroep6 == 2){
            rij6Kolom2.setSelected(true);
        } else if (getalGroep6 == 3){
            rij6Kolom3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
        
        
        //CHANGELISTENERS// 
        
        //Controle voor Vergewissen(Groep 1)
        rij1Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            Rijtechniek_Kijktechniek kijktechniek = new Rijtechniek_Kijktechniek();
                if (rij1Kolom1.isSelected() == true){
                    kijktechniek.setKijkTechniekVergewissen(1);
                } else if (rij1Kolom2.isSelected() == true) {
                    kijktechniek.setKijkTechniekVergewissen(2);
                } else {
                    kijktechniek.setKijkTechniekVergewissen(3);
                }
                Configuratie.evaluatie.getRijtechniek().setKijkTechniek(kijktechniek);
            }});
        
         //Controle voor Spiegels(Groep 2)
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
                Configuratie.evaluatie.getRijtechniek().getKijkTechniek().setKijkTechniekSpiegels(getal);
            }
        });
        
        //Controle voor Dode hoek(Groep 3)
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
                
                Configuratie.evaluatie.getRijtechniek().getKijkTechniek().setKijkTechniekDodeHoek(getal);
            }
        });
        
        //Controle voor Ver genoeg(Groep 4)
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
                
                Configuratie.evaluatie.getRijtechniek().getKijkTechniek().setKijkTechniekVerGenoeg(getal);
            }
        });
        
        //Controle voor Selecteren (Groep 5)
        rij5Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            int getal = 0;
                if (rij5Kolom1.isSelected() == true){
                    getal = 1;                    
                } else if (rij5Kolom2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                
                Configuratie.evaluatie.getRijtechniek().getKijkTechniek().setKijkTechniekSelecteren(getal);
            }
        });
        
        //Controle voor Bocht (Groep 6)
        rij6Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            int getal = 0;
                if (rij6Kolom1.isSelected() == true){
                    getal = 1;                    
                } else if (rij6Kolom2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                
                Configuratie.evaluatie.getRijtechniek().getKijkTechniek().setKijkTechniekAndere(getal);
            }
        });
        
        
        Leerling leerling = Configuratie.getLeerling();
        lblNaamLeerling.setText(leerling.getVolledigeNaam());
    }
    
    @FXML
    public void opmerkingOpslaan() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Opmerking opslaan");
        alert.setHeaderText(null);
        alert.setContentText("Wilt u deze opmerking op het Dashboard bijhouden?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            Configuratie.evaluatie.setOpmerkingen(kijktechniekOpmerking.getText());
            EvaluatieDAO.getInstance().updateEvaluatie(Configuratie.evaluatie);}
        }
    @FXML
    public void rijtechniek()
    {
         try {
        Configuratie.evaluatie.getRijtechniek().getKijkTechniek().setKijkTechniekOpm((kijktechniekOpmerking.getText()));
        RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        } catch(NullPointerException ex)  {
            
        }
        switcher.rijtechniek();
    }

}
