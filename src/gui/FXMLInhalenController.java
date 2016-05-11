package gui;

import DAO.VerkeerstechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Verkeerstechniek.Verkeerstechniek_Inhalen;
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

public class FXMLInhalenController extends BorderPane {

    @FXML
    Button btnTerug;

    @FXML
    Label lblNaamLeerling;

    @FXML
    RadioButton rij1Kolom1, rij1Kolom2, rij1Kolom3, rij2Kolom1, rij2Kolom2, rij2Kolom3,
            rij3Kolom1, rij3Kolom2, rij3Kolom3;

    @FXML
    ToggleGroup rij1Groep, rij2Groep, rij3Groep;

    ScreenSwitcher switcher;

    public FXMLInhalenController(ScreenSwitcher switcher) {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLInhalen.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //CONTROLES SELECTIE BUTTONS//
        //Controle eerste groep (Inhalen)
        try {

            int getalGroep1 = Configuratie.evaluatie.getVerkeerstechniek().getInhalen().getInhalen();

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

        //Controle tweede groep (Voorbij Rijden)
        try {

            int getalGroep2 = Configuratie.evaluatie.getVerkeerstechniek().getInhalen().getVoorbijrijden();

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

        //Controle derde groep (Inhalen Andere Auto)
        try {

            int getalGroep3 = Configuratie.evaluatie.getVerkeerstechniek().getInhalen().getInhalenAndere();
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

        //CHANGELISTENERS// 
        //Controle voor Inhalen (Groep 1)
        rij1Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                Verkeerstechniek_Inhalen inhalen = new Verkeerstechniek_Inhalen();
                if (rij1Kolom1.isSelected() == true) {
                    inhalen.setInhalen(1);
                } else if (rij1Kolom2.isSelected() == true) {
                    inhalen.setInhalen(2);
                } else {
                    inhalen.setInhalen(3);
                }
                Configuratie.evaluatie.getVerkeerstechniek().setInhalen(inhalen);
            }
        });

        //Controle voor Voorbij Rijden (Groep 2)
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
                Configuratie.evaluatie.getVerkeerstechniek().getInhalen().setVoorbijrijden(getal);
            }
        });

        //Controle voor Inhalen Andere (Groep 3)
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

                Configuratie.evaluatie.getVerkeerstechniek().getInhalen().setInhalenAndere(getal);
            }
        });

        Leerling leerling = Configuratie.getLeerling();
        lblNaamLeerling.setText(leerling.getVolledigeNaam());
    }

    @FXML
    public void verkeerstechniek() {
        VerkeerstechniekDAO.getInstance().updateVerkeerstechniek(Configuratie.evaluatie.getVerkeerstechniek());
        switcher.verkeerstechniek();
    }
}
