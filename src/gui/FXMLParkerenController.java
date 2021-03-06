package gui;

import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Parkeren;
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

public class FXMLParkerenController extends BorderPane {

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

    public FXMLParkerenController(ScreenSwitcher switcher) {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLParkeren.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //Eerste groep aanmaken (Twee Voertuigen)
        rij1Kolom1.setToggleGroup(rij1Groep);
        rij1Kolom2.setToggleGroup(rij1Groep);
        rij1Kolom3.setToggleGroup(rij1Groep);

        //Tweede groep aanmaken (Een voertuig)
        rij2Kolom1.setToggleGroup(rij2Groep);
        rij2Kolom2.setToggleGroup(rij2Groep);
        rij2Kolom3.setToggleGroup(rij2Groep);

        //Derde groep aanmaken (Links)
        rij3Kolom1.setToggleGroup(rij3Groep);
        rij3Kolom2.setToggleGroup(rij3Groep);
        rij3Kolom3.setToggleGroup(rij3Groep);

        //CONTROLES SELECTIE BUTTONS//
        //Controle eerste groep (Twee Voertuigen)
        try {

            int getalGroep1 = Configuratie.evaluatie.getRijtechniek().getParkeren().getParkerenTweeVoertuigen();

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

        //Controle tweede groep (Een Voertuig)
        try {

            int getalGroep2 = Configuratie.evaluatie.getRijtechniek().getParkeren().getParkerenAchterVoertuigen();

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

        //Controle derde groep (Links)
        try {

            int getalGroep3 = Configuratie.evaluatie.getRijtechniek().getParkeren().getParkerenLinks();

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
        //Controle voor Twee Voertuigen (Groep 1)
        rij1Groep.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                Rijtechniek_Parkeren parkeren = new Rijtechniek_Parkeren();
                if (rij1Kolom1.isSelected() == true) {
                    parkeren.setParkerenTweeVoertuigen(1);
                } else if (rij1Kolom2.isSelected() == true) {
                    parkeren.setParkerenTweeVoertuigen(2);
                } else {
                    parkeren.setParkerenTweeVoertuigen(3);
                }
                Configuratie.evaluatie.getRijtechniek().setParkeren(parkeren);
            }
        });

        //Controle voor Een Voertuig (Groep 2)
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
                Configuratie.evaluatie.getRijtechniek().getParkeren().setParkerenAchterVoertuigen(getal);
            }
        });

        //Controle voor Links (Groep 3)
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

                Configuratie.evaluatie.getRijtechniek().getParkeren().setParkerenLinks(getal);
            }
        });

        Leerling leerling = Configuratie.getLeerling();
        lblNaamLeerling.setText(leerling.getVolledigeNaam());
    }

    @FXML
    public void rijtechniek() {
        RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        switcher.rijtechniek();
    }
}
