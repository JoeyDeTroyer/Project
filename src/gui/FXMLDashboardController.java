package gui;

import DAO.DashboardDAO;
import DAO.EvaluatieDAO;
import DAO.RijtechniekDAO;
import DAO.VerkeerstechniekDAO;
import Models.Configuratie;
import Models.Dashboard.Dashboard;
import Models.Dashboard.Dashboard_Autosnelweg;
import Models.Dashboard.Dashboard_Rijstroken;
import Models.Dashboard.Dashboard_Rotonde;
import Models.Dashboard.Dashboard_Stad;
import Models.Evaluatie;
import Models.Leerling;
import Models.Rijtechniek.Rijtechniek;
import Models.Verkeerstechniek.Verkeerstechniek;
import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import project.Model;

public class FXMLDashboardController extends BorderPane {

    @FXML
    Label lblNaamLeerling, lblEvaluatie;

    @FXML
    Button btnRijtechniek, btnAttitude, btnVerkeerstechniek, btnLogout, btnEvaluatie1, btnEvaluatie2,
            btnEvaluatie3, btnMin, btnPlus;

    @FXML
    ToggleButton btnBanden, btnTanken, btnNoodstop, btnGPS, btnVloeistoffen, btnSchakelaars;

    @FXML
    TextArea txtOpmerkingen;

    @FXML
    Circle circleSchakelaars, circleVloeistoffen, circleBanden, circleTanken, circleGPS,
            circleNoodstop, circleAutostrade, circleStad, circleRijstroken, circleRotonde;

    @FXML
    ProgressBar progressbar;

    ScreenSwitcher switcher;
    private ObservableList<Evaluatie> evaluatie;
    private Evaluatie evaluatietest;

    public FXMLDashboardController(ScreenSwitcher switcher) {
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
        ophalenGegevens();

    }

    @FXML
    public void attitude() {
        switcher.attitude();
    }

    @FXML
    public void evaluatie1() {
        evaluatieselecteren(1);
        lblEvaluatie.setText("Evaluatie 1");
//        test();
    }

    @FXML
    public void evaluatie2() {
        evaluatieselecteren(2);
        lblEvaluatie.setText("Evaluatie 2");

//        test();
    }

    @FXML
    public void evaluatie3() {

        evaluatieselecteren(3);
        lblEvaluatie.setText("Evaluatie 3");
//        test();
    }

    public void test() {
        try {
            String text = Configuratie.evaluatie.getRijtechniek().getZithouding().getZithoudingOpm();
            txtOpmerkingen.setText("ZithoudingOPMERKING: " + text);
        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
        }
    }

    public void ophalenGegevens() {

        //Controle voor Stuuroefening selectie
        try {
            int getalRotonde = Configuratie.evaluatie.getDashboard().getRotonde().getRotonde();
            if (getalRotonde == 1) {
                circleRotonde.setFill(Color.RED);
            } else if (getalRotonde == 2) {
                circleRotonde.setFill(Color.ORANGE);
            } else if (getalRotonde == 3) {
                circleRotonde.setFill(Color.GREEN);
            } else {
                circleRotonde.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
            circleRotonde.setFill(Color.WHITE);
        }

        //Controle voor Rijstroken selectie
        try {
            int getalRijstroken = Configuratie.evaluatie.getDashboard().getRijstroken().getRijstroken();
            if (getalRijstroken == 1) {
                circleRijstroken.setFill(Color.RED);
            } else if (getalRijstroken == 2) {
                circleRijstroken.setFill(Color.ORANGE);
            } else if (getalRijstroken == 3) {
                circleRijstroken.setFill(Color.GREEN);

            } else {
                circleRijstroken.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
            circleRijstroken.setFill(Color.WHITE);

        }

        //Controle voor Stad selectie
        try {
            int getalStad = Configuratie.evaluatie.getDashboard().getStad().getStad();
            if (getalStad == 1) {
                circleStad.setFill(Color.RED);
            } else if (getalStad == 2) {
                circleStad.setFill(Color.ORANGE);
            } else if (getalStad == 3) {
                circleStad.setFill(Color.GREEN);

            } else {
                circleStad.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
            circleStad.setFill(Color.WHITE);

        }
        
        //Controle voor Autostrade selectie
        try {
            int getalAutosnelweg = Configuratie.evaluatie.getDashboard().getAutosnelweg().getAutosnelweg();
            if (getalAutosnelweg == 1) {
                circleAutostrade.setFill(Color.RED);
            } else if (getalAutosnelweg == 2) {
                circleAutostrade.setFill(Color.ORANGE);
            } else if (getalAutosnelweg == 3) {
                circleAutostrade.setFill(Color.GREEN);

            } else {
                circleAutostrade.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            System.out.println("BESTAAT NOG NIET");
            circleAutostrade.setFill(Color.WHITE);

        }

    }

    public void evaluatieselecteren(int evaluatie) {
        evaluatietest = EvaluatieDAO.getInstance().findAllByLeerling(Configuratie.leerling, evaluatie);
        if (evaluatietest == null) {
            Evaluatie nieuweEvaluatie = new Evaluatie();
            Rijtechniek rijtechniek = new Rijtechniek();
            RijtechniekDAO.getInstance().addRijtechniek(rijtechniek);
            Verkeerstechniek verkeerstechniek = new Verkeerstechniek();
            VerkeerstechniekDAO.getInstance().addVerkeerstechniek(verkeerstechniek);
            Dashboard dashboard = new Dashboard();
            DashboardDAO.getInstance().addDashboard(dashboard);
            nieuweEvaluatie.setRijtechniek(rijtechniek);
            nieuweEvaluatie.setLeerling(Configuratie.leerling);
            nieuweEvaluatie.setVolgNummer(evaluatie);
            nieuweEvaluatie.setVerkeerstechniek(verkeerstechniek);
            nieuweEvaluatie.setDashboard(dashboard);
            EvaluatieDAO.getInstance().addEvaluatie(nieuweEvaluatie);
            evaluatietest = EvaluatieDAO.getInstance().findAllByLeerling(Configuratie.leerling, evaluatie);
            ophalenGegevens();
        }

        Configuratie.setEvaluatie(evaluatietest);
        System.out.println(evaluatietest.getLeerling().getNaamVoornaam());
        ophalenGegevens();

    }

    @FXML
    public void rijtechniek() {
        switcher.rijtechniek();
    }

    @FXML
    public void verkeerstechniek() {
        switcher.verkeerstechniek();
    }

    @FXML
    public void logout() {
        switcher.logout();
    }

    @FXML
    public void schakelaars() {
        if (circleSchakelaars.getFill() == Color.WHITE) {
            circleSchakelaars.setFill(Color.GREEN);
        } else {
            circleSchakelaars.setFill(Color.WHITE);
        }
    }

    @FXML
    public void vloeistoffen() {
        if (circleVloeistoffen.getFill() == Color.WHITE) {
            circleVloeistoffen.setFill(Color.GREEN);

        } else {
            circleVloeistoffen.setFill(Color.WHITE);
        }
    }

    @FXML
    public void banden() {
        if (circleBanden.getFill() == Color.WHITE) {
            circleBanden.setFill(Color.GREEN);
        } else {
            circleBanden.setFill(Color.WHITE);
        }
    }

    @FXML
    public void tanken() {
        if (circleTanken.getFill() == Color.WHITE) {
            circleTanken.setFill(Color.GREEN);
        } else {
            circleTanken.setFill(Color.WHITE);
        }
    }

    @FXML
    public void gps() {
        if (circleGPS.getFill() == Color.WHITE) {
            circleGPS.setFill(Color.GREEN);
        } else {
            circleGPS.setFill(Color.WHITE);
        }
    }

    @FXML
    public void noodstop() {
        if (circleNoodstop.getFill() == Color.WHITE) {
            circleNoodstop.setFill(Color.GREEN);
        } else {
            circleNoodstop.setFill(Color.WHITE);
        }
    }

    @FXML
    public void pbMin() {
        btnPlus.setDisable(false);
        if (progressbar.getProgress() <= 0.101) {
            //kan niet lager dan 0
            progressbar.setProgress(0);
            btnMin.setDisable(true);
        } else {
            progressbar.setProgress(progressbar.getProgress() - 0.1);
        }
    }

    @FXML
    public void pbPlus() {
        btnMin.setDisable(false);

        if (progressbar.getProgress() >= 0.899) {
            //kan niet hoger dan 1
            progressbar.setProgress(1);
            btnPlus.setDisable(true);
        } else {
            progressbar.setProgress(progressbar.getProgress() + 0.1);
        }
    }

    @FXML
    public void rotonde() {
        Dashboard_Rotonde rotonde = new Dashboard_Rotonde();
        if (circleRotonde.getFill() == Color.WHITE) {
            circleRotonde.setFill(Color.RED);
            rotonde.setRotonde(1);
            Configuratie.evaluatie.getDashboard().setRotonde(rotonde);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleRotonde.getFill() == Color.RED) {
            circleRotonde.setFill(Color.ORANGE);
            rotonde.setRotonde(2);
            Configuratie.evaluatie.getDashboard().setRotonde(rotonde);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleRotonde.getFill() == Color.ORANGE) {
            circleRotonde.setFill(Color.GREEN);
            rotonde.setRotonde(3);
            Configuratie.evaluatie.getDashboard().setRotonde(rotonde);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            rotonde.setRotonde(3);
            circleRotonde.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setRotonde(rotonde);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }
    }

    @FXML
    public void rijstroken() {

        Dashboard_Rijstroken rijstroken = new Dashboard_Rijstroken();
        if (circleRijstroken.getFill() == Color.WHITE) {
            circleRijstroken.setFill(Color.RED);
            rijstroken.setRijstroken(1);
            Configuratie.evaluatie.getDashboard().setRijstroken(rijstroken);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleRijstroken.getFill() == Color.RED) {
            circleRijstroken.setFill(Color.ORANGE);
            rijstroken.setRijstroken(2);
            Configuratie.evaluatie.getDashboard().setRijstroken(rijstroken);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleRijstroken.getFill() == Color.ORANGE) {
            circleRijstroken.setFill(Color.GREEN);
            rijstroken.setRijstroken(3);
            Configuratie.evaluatie.getDashboard().setRijstroken(rijstroken);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            rijstroken.setRijstroken(3);
            circleRijstroken.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setRijstroken(rijstroken);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }
    }

    @FXML
    public void stad() {

        Dashboard_Stad stad = new Dashboard_Stad();
        if (circleStad.getFill() == Color.WHITE) {
            circleStad.setFill(Color.RED);
            stad.setStad(1);
            Configuratie.evaluatie.getDashboard().setStad(stad);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleStad.getFill() == Color.RED) {
            circleStad.setFill(Color.ORANGE);
            stad.setStad(2);
            Configuratie.evaluatie.getDashboard().setStad(stad);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleStad.getFill() == Color.ORANGE) {
            circleStad.setFill(Color.GREEN);
            stad.setStad(3);
            Configuratie.evaluatie.getDashboard().setStad(stad);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            stad.setStad(4);
            circleStad.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setStad(stad);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }

    }

    @FXML
    public void autostrade() {
         Dashboard_Autosnelweg autosnelweg = new Dashboard_Autosnelweg();
        if (circleAutostrade.getFill() == Color.WHITE) {
            circleAutostrade.setFill(Color.RED);
            autosnelweg.setAutosnelweg(1);
            Configuratie.evaluatie.getDashboard().setAutosnelweg(autosnelweg);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleAutostrade.getFill() == Color.RED) {
            circleAutostrade.setFill(Color.ORANGE);
            autosnelweg.setAutosnelweg(2);
            Configuratie.evaluatie.getDashboard().setAutosnelweg(autosnelweg);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleAutostrade.getFill() == Color.ORANGE) {
            circleAutostrade.setFill(Color.GREEN);
            autosnelweg.setAutosnelweg(3);
            Configuratie.evaluatie.getDashboard().setAutosnelweg(autosnelweg);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            autosnelweg.setAutosnelweg(4);
            circleAutostrade.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setAutosnelweg(autosnelweg);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }
    }

}
