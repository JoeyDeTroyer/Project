package gui;

import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek_Achteruitrijden;
import Models.Rijtechniek.Rijtechniek_Garage;
import Models.Rijtechniek.Rijtechniek_Keren;
import Models.Rijtechniek.Rijtechniek_Stuuroefening;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FXMLRijtechniekController extends BorderPane {

    @FXML
    Label lblNaamLeerling;
    @FXML
    Button btnHome, btnZithouding, btnKijktechniek, btnSchakeltechniek, btnStuurtechniek, btnRemtechniek,
            btnKoppeling, btnHelling, btnParkeren, btnKeren, btnStuuroefening, btnGarage;

    @FXML
    Circle stuuroefening, achteruit, garageBol, kerenBol;
    ScreenSwitcher switcher;

    public FXMLRijtechniekController(ScreenSwitcher switcher) {
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

        //Controle voor Stuuroefening selectie
        try {
            int getalStuuroefening = Configuratie.evaluatie.getRijtechniek().getStuuroefening().getStuuroefening();
            if (getalStuuroefening == 1) {
                stuuroefening.setFill(Color.ORANGE);
                System.out.println("getalstuuroef is " + getalStuuroefening);
            } else if (getalStuuroefening == 2) {
                stuuroefening.setFill(Color.GREEN);
                System.out.println("getalstuuroef is " + getalStuuroefening);

            } else if (getalStuuroefening == 3) {
                stuuroefening.setFill(Color.WHITE);
            }
            System.out.println("getalstuuroef is " + getalStuuroefening);

        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }

        //Controle voor achteruitrijden selectie
        try {
            int getalAchteruit = Configuratie.evaluatie.getRijtechniek().getAchteruitrijden().getAchteruitRijden();
            if (getalAchteruit == 1) {
                achteruit.setFill(Color.ORANGE);
            } else if (getalAchteruit == 2) {
                achteruit.setFill(Color.GREEN);
            } else if (getalAchteruit == 3) {
                achteruit.setFill(Color.WHITE);
            }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }

        //Controle voor garage selectie
        try {
            int getalGarage = Configuratie.evaluatie.getRijtechniek().getGarage().getGarage();
            if (getalGarage == 1) {
                garageBol.setFill(Color.ORANGE);
            } else if (getalGarage == 2) {
                garageBol.setFill(Color.GREEN);
            } else if (getalGarage == 3) {
                garageBol.setFill(Color.WHITE);
            }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }

        //Controle voor keren selectie
        try {
            int getalKeren = Configuratie.evaluatie.getRijtechniek().getKeren().getKeren();
            if (getalKeren == 1) {
                kerenBol.setFill(Color.ORANGE);
            } else if (getalKeren == 2) {
                kerenBol.setFill(Color.GREEN);
            } else if (getalKeren == 3) {
                kerenBol.setFill(Color.WHITE);
            }
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
    }

    @FXML
    public void dashboard() {

        switcher.dashboard();
    }

    @FXML
    public void zithouding() {
        switcher.zithouding();
    }

    @FXML
    public void kijktechniek() {
        switcher.kijktechniek();
    }

    @FXML
    public void schakeltechniek() {
        switcher.schakeltechniek();
    }

    @FXML
    public void stuurtechniek() {
        switcher.stuurtechniek();
    }

    @FXML
    public void remtechniek() {
        switcher.remtechniek();
    }

    @FXML
    public void koppeling() {
        switcher.koppeling();
    }

    @FXML
    public void helling() {
        switcher.helling();
    }

    @FXML
    public void parkeren() {
        switcher.parkeren();
    }

    @FXML
    public void keren() {

        Rijtechniek_Keren kerenR = new Rijtechniek_Keren();
        if (kerenBol.getFill() == Color.WHITE) {
            kerenBol.setFill(Color.ORANGE);
            kerenR.setKeren(1);
            Configuratie.evaluatie.getRijtechniek().setKeren(kerenR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

        } else if (kerenBol.getFill() == Color.ORANGE) {
            kerenBol.setFill(Color.GREEN);
            kerenR.setKeren(2);
            Configuratie.evaluatie.getRijtechniek().setKeren(kerenR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

        } else {
            kerenR.setKeren(3);
            kerenBol.setFill(Color.WHITE);
            Configuratie.evaluatie.getRijtechniek().setKeren(kerenR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        }
    }

    @FXML
    public void stuuroef() {

        Rijtechniek_Stuuroefening rStuuroefening = new Rijtechniek_Stuuroefening();
        if (stuuroefening.getFill() == Color.WHITE) {
            stuuroefening.setFill(Color.ORANGE);
            rStuuroefening.setStuuroefening(1);
            Configuratie.evaluatie.getRijtechniek().setStuuroefening(rStuuroefening);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

        } else if (stuuroefening.getFill() == Color.ORANGE) {
            stuuroefening.setFill(Color.GREEN);
            rStuuroefening.setStuuroefening(2);
            Configuratie.evaluatie.getRijtechniek().setStuuroefening(rStuuroefening);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

        } else {
            rStuuroefening.setStuuroefening(3);
            stuuroefening.setFill(Color.WHITE);
            Configuratie.evaluatie.getRijtechniek().setStuuroefening(rStuuroefening);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        }
    }

    @FXML
    public void achteruitrijden() {

        Rijtechniek_Achteruitrijden achteruitR = new Rijtechniek_Achteruitrijden();
        if (achteruit.getFill() == Color.WHITE) {
            achteruit.setFill(Color.ORANGE);
            achteruitR.setAchteruitRijden(1);
            Configuratie.evaluatie.getRijtechniek().setAchteruitrijden(achteruitR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

        } else if (achteruit.getFill() == Color.ORANGE) {
            achteruit.setFill(Color.GREEN);
            achteruitR.setAchteruitRijden(2);
            Configuratie.evaluatie.getRijtechniek().setAchteruitrijden(achteruitR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

        } else {
            achteruitR.setAchteruitRijden(3);
            achteruit.setFill(Color.WHITE);
            Configuratie.evaluatie.getRijtechniek().setAchteruitrijden(achteruitR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        }

    }

    @FXML
    public void garage() {

        Rijtechniek_Garage garageR = new Rijtechniek_Garage();
        if (garageBol.getFill() == Color.WHITE) {
            garageBol.setFill(Color.ORANGE);
            garageR.setGarage(1);
            Configuratie.evaluatie.getRijtechniek().setGarage(garageR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

        } else if (garageBol.getFill() == Color.ORANGE) {
            garageBol.setFill(Color.GREEN);
            garageR.setGarage(2);
            Configuratie.evaluatie.getRijtechniek().setGarage(garageR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());

        } else {
            garageR.setGarage(3);
            garageBol.setFill(Color.WHITE);
            Configuratie.evaluatie.getRijtechniek().setGarage(garageR);
            RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
        }
    }
}
