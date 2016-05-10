package gui;

import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Koppeling;
import Models.Rijtechniek.Rijtechniek_Stuurtechniek;
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

public class FXMLKoppelingController extends BorderPane
{
    @FXML
    Button btnTerug;
    
    @FXML
    Label lblNaamLeerling;
    
    @FXML
    RadioButton rij1Kolom1, rij1Kolom2, rij1Kolom3, rij2Kolom1, rij2Kolom2, rij2Kolom3,
            rij3Kolom1, rij3Kolom2, rij3Kolom3, rij4Kolom1, rij4Kolom2, rij4Kolom3,
            rij5Kolom1, rij5Kolom2, rij5Kolom3, rij6Kolom1, rij6Kolom2, rij6Kolom3,
            rij7Kolom1, rij7Kolom2, rij7Kolom3;
    
    @FXML
    ToggleGroup rij1Groep, rij2Groep, rij3Groep, rij4Groep, rij5Groep, rij6Groep, rij7Groep;
    
    ScreenSwitcher switcher;
    
    public FXMLKoppelingController(ScreenSwitcher switcher)
    {
         this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLKoppeling.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        //TOGGLEGROUPS AANMAKEN//
        
         //Eerste groep aanmaken (Dosering)
        rij1Kolom1.setToggleGroup(rij1Groep);
        rij1Kolom2.setToggleGroup(rij1Groep);
        rij1Kolom3.setToggleGroup(rij1Groep);
        
        //Tweede groep aanmaken (Volledig)
        rij2Kolom1.setToggleGroup(rij2Groep);
        rij2Kolom2.setToggleGroup(rij2Groep);
        rij2Kolom3.setToggleGroup(rij2Groep);
        
        //Derde groep aanmaken (Voet Af)
        rij3Kolom1.setToggleGroup(rij3Groep);
        rij3Kolom2.setToggleGroup(rij3Groep);
        rij3Kolom3.setToggleGroup(rij3Groep);
        
        //Vierde groep aanmaken (Andere)
        rij4Kolom1.setToggleGroup(rij4Groep);
        rij4Kolom2.setToggleGroup(rij4Groep);
        rij4Kolom3.setToggleGroup(rij4Groep);
        
        //Vijfde groep aanmaken (Onnodig)
        rij5Kolom1.setToggleGroup(rij5Groep);
        rij5Kolom2.setToggleGroup(rij5Groep);
        rij5Kolom3.setToggleGroup(rij5Groep);
        
        //Zesde groep aanmaken (Bocht)
        rij6Kolom1.setToggleGroup(rij6Groep);
        rij6Kolom2.setToggleGroup(rij6Groep);
        rij6Kolom3.setToggleGroup(rij6Groep);
        
        //Zevende groep aanmaken (Andere Gebruik)
        rij7Kolom1.setToggleGroup(rij7Groep);
        rij7Kolom2.setToggleGroup(rij7Groep);
        rij7Kolom3.setToggleGroup(rij7Groep);
        
        //CONTROLE VOOR SELECTIE//
        
        //Controle eerste groep (Dosering)
        try {
            
        int getalGroep1 = Configuratie.evaluatie.getRijtechniek().getKoppeling().getKoppelingDosering();
         
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
        
        //Controle tweede groep (Volledig)
        try {
            
        int getalGroep2 = Configuratie.evaluatie.getRijtechniek().getKoppeling().getKoppelingVolledig();
         
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
        
        //Controle derde groep (Voet Af)
        try {
            
        int getalGroep3 = Configuratie.evaluatie.getRijtechniek().getKoppeling().getKoppelingVoetAf();
         
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
        
        //Controle vierde groep (Andere)
        try {
            
        int getalGroep4 = Configuratie.evaluatie.getRijtechniek().getKoppeling().getKoppelingBedieningAndere();
         
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
        
        //Controle vijfde groep (Onnodig)
        try {
            
        int getalGroep5 = Configuratie.evaluatie.getRijtechniek().getKoppeling().getKoppelingOnnodig();
         
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
        
        //Controle zesde groep (Bocht)
        try {
            
        int getalGroep6 = Configuratie.evaluatie.getRijtechniek().getKoppeling().getKoppelingBocht();
         
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
        
        //Controle zevende groep (Andere Gebruik)
        try {
            
        int getalGroep7 = Configuratie.evaluatie.getRijtechniek().getKoppeling().getKoppelingGebruikAndere();
         
        if (getalGroep7 == 1){
            rij7Kolom1.setSelected(true);
        } else if (getalGroep7 == 2){
            rij7Kolom2.setSelected(true);
        } else if (getalGroep7 == 3){
            rij7Kolom3.setSelected(true);   
        }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
          
        //CHANGELISTENERS// 
        
        //Controle voor Dosering(Groep 1)
        rij1Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            Rijtechniek_Koppeling koppeling = new Rijtechniek_Koppeling();
                if (rij1Kolom1.isSelected() == true){
                    koppeling.setKoppelingDosering(1);
                } else if (rij1Kolom2.isSelected() == true) {
                    koppeling.setKoppelingDosering(2);
                } else {
                    koppeling.setKoppelingDosering(3);
                }
                Configuratie.evaluatie.getRijtechniek().setKoppeling(koppeling);
            }});
        
         //Controle voor Volledig(Groep 2)
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
                Configuratie.evaluatie.getRijtechniek().getKoppeling().setKoppelingVolledig(getal);
            }
        });
        
        //Controle voor Voet Af(Groep 3)
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
                
                Configuratie.evaluatie.getRijtechniek().getKoppeling().setKoppelingVoetAf(getal);
            }
        });
        
        //Controle voor Bediening Andere(Groep 4)
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
                
                Configuratie.evaluatie.getRijtechniek().getKoppeling().setKoppelingBedieningAndere(getal);
            }
        });
        
        //Controle voor Onnodig (Groep 5)
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
                
                Configuratie.evaluatie.getRijtechniek().getKoppeling().setKoppelingOnnodig(getal);
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
                
                Configuratie.evaluatie.getRijtechniek().getKoppeling().setKoppelingBocht(getal);
            }
        });
        
        //Controle voor Gebruik Andere (Groep 7)
        rij7Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
            int getal = 0;
                if (rij7Kolom1.isSelected() == true){
                    getal = 1;                    
                } else if (rij7Kolom2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }
                
                Configuratie.evaluatie.getRijtechniek().getKoppeling().setKoppelingGebruikAndere(getal);
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
