package gui;

import DAO.EvaluatieDAO;
import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Stuurtechniek;
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

public class FXMLStuurtechniekController extends BorderPane {

    @FXML
    Button btnTerug;

    @FXML
    Label lblNaamLeerling;
    @FXML
    RadioButton rij1Kolom1, rij1Kolom2, rij1Kolom3, rij2Kolom1, rij2Kolom2, rij2Kolom3,
            rij3Kolom1, rij3Kolom2, rij3Kolom3;

    @FXML
    ToggleGroup rij1Groep, rij2Groep, rij3Groep;
    @FXML
    TextArea stuurtechniekOpmerking;

    ScreenSwitcher switcher;

    public FXMLStuurtechniekController(ScreenSwitcher switcher) {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLStuurtechniek.fxml"));
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

        //Tweede groep aanmaken (Houding)
        rij2Kolom1.setToggleGroup(rij2Groep);
        rij2Kolom2.setToggleGroup(rij2Groep);
        rij2Kolom3.setToggleGroup(rij2Groep);

        //Derde groep aanmaken (Andere)
        rij3Kolom1.setToggleGroup(rij3Groep);
        rij3Kolom2.setToggleGroup(rij3Groep);
        rij3Kolom3.setToggleGroup(rij3Groep);

        try {
            String text = Configuratie.evaluatie.getRijtechniek().getStuurTechniek().getStuurtechniekOpm();
            stuurtechniekOpmerking.setText(text);
        } catch (NullPointerException ex) {
        }

        //Controle eerste groep (Dosering)
        try {

            int getalGroep1 = Configuratie.evaluatie.getRijtechniek().getStuurTechniek().getStuurtechniekDosering();

            if (getalGroep1 == 1) {
                rij1Kolom1.setSelected(true);
            } else if (getalGroep1 == 2) {
                rij1Kolom2.setSelected(true);
            } else if (getalGroep1 == 3) {
                rij1Kolom3.setSelected(true);
            }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }

        //Controle tweede groep (Houding)
        try {

            int getalGroep2 = Configuratie.evaluatie.getRijtechniek().getStuurTechniek().getStuurtechniekHouding();

            if (getalGroep2 == 1) {
                rij2Kolom1.setSelected(true);
            } else if (getalGroep2 == 2) {
                rij2Kolom2.setSelected(true);
            } else if (getalGroep2 == 3) {
                rij2Kolom3.setSelected(true);
            }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }

        //Controle derde groep (Andere)
        try {

            int getalGroep3 = Configuratie.evaluatie.getRijtechniek().getStuurTechniek().getStuurtechniekAndere();

            if (getalGroep3 == 1) {
                rij3Kolom1.setSelected(true);
            } else if (getalGroep3 == 2) {
                rij3Kolom2.setSelected(true);
            } else if (getalGroep3 == 3) {
                rij3Kolom3.setSelected(true);
            }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }

        //Controle voor Dosering(Groep 1)
        rij1Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                Rijtechniek_Stuurtechniek stuurtechniek = new Rijtechniek_Stuurtechniek();
                int getal = 0;
                if (rij1Kolom1.isSelected() == true) {
                    stuurtechniek.setStuurtechniekDosering(1);
                    getal = 1;
                    System.out.println("1");
                } else if (rij1Kolom2.isSelected() == true) {
                    getal = 2;
                    stuurtechniek.setStuurtechniekDosering(2);
                } else {
                    getal = 3;
                    stuurtechniek.setStuurtechniekDosering(3);
                }

                Configuratie.evaluatie.getRijtechniek().setStuurTechniek(stuurtechniek);
            }
        });

        //Controle voor Houding(Groep 2)
        rij2Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                int getal = 0;
                if (rij2Kolom1.isSelected() == true) {
                    getal = 1;

                } else if (rij2Kolom2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }

                Configuratie.evaluatie.getRijtechniek().getStuurTechniek().setStuurtechniekHouding(getal);
            }
        });

        //Controle voor Andere (Groep 3)
        rij3Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                int getal = 0;
                if (rij3Kolom1.isSelected() == true) {
                    getal = 1;

                } else if (rij3Kolom2.isSelected() == true) {
                    getal = 2;
                } else {
                    getal = 3;
                }

                Configuratie.evaluatie.getRijtechniek().getStuurTechniek().setStuurtechniekAndere(getal);
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
            Configuratie.evaluatie.setOpmerkingen(stuurtechniekOpmerking.getText());
            EvaluatieDAO.getInstance().updateEvaluatie(Configuratie.evaluatie);}
        }

    @FXML
    public void rijtechniek() {
        try {
        Configuratie.evaluatie.getRijtechniek().getStuurTechniek().setStuurtechniekOpm(stuurtechniekOpmerking.getText());

        RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        }catch(NullPointerException ex) {
            
        }
        switcher.rijtechniek();
    }
}
