package gui;

import DAO.DashboardDAO;
import DAO.EvaluatieDAO;
import DAO.RijtechniekDAO;
import DAO.VerkeerstechniekDAO;
import Models.Configuratie;
import Models.Dashboard.Dashboard;
import Models.Dashboard.Dashboard_Autosnelweg;
import Models.Dashboard.Dashboard_Banden;
import Models.Dashboard.Dashboard_GPS;
import Models.Dashboard.Dashboard_Noodstop;
import Models.Dashboard.Dashboard_ProgressBar;
import Models.Dashboard.Dashboard_Rijstroken;
import Models.Dashboard.Dashboard_Rotonde;
import Models.Dashboard.Dashboard_Schakelaars;
import Models.Dashboard.Dashboard_Stad;
import Models.Dashboard.Dashboard_Tanken;
import Models.Dashboard.Dashboard_Vloeistoffen;
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

public class FXMLDashboardController extends BorderPane {

    @FXML
    Label lblNaamLeerling, lblEvaluatie;

    @FXML
    Button btnRijtechniek, btnAttitude, btnVerkeerstechniek, btnLogout, btnEvaluatie1, btnEvaluatie2,
            btnEvaluatie3, btnMin, btnPlus;

    @FXML
    ToggleButton btnBanden, btnTanken, btnNoodstop, btnGPS, btnVloeistoffen, btnSchakelaars,
            btnRotonde, btnRijstroken, btnStad, btnAutostrade;

    @FXML
    TextArea txtOpmerkingen;

    @FXML
    Circle circleSchakelaars, circleVloeistoffen, circleBanden, circleTanken, circleGPS,
            circleNoodstop, circleAutostrade, circleStad, circleRijstroken, circleRotonde;

    @FXML
    ProgressBar progressbar;

    ScreenSwitcher switcher;
    private int evaluatieGekozen;
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
//        progressbar.setProgress(0);
        btnMin.setDisable(true);
        lblNaamLeerling.setText(leerling.getVolledigeNaam());
        try {
        if (Configuratie.evaluatie.getVolgNummer() == 1 ){
            lblEvaluatie.setText("Evaluatie 1");
            dashboardActiveren();            
        } else if (Configuratie.evaluatie.getVolgNummer() == 2 ) {
            lblEvaluatie.setText("Evaluatie 2");
            dashboardActiveren();
        }  else if (Configuratie.evaluatie.getVolgNummer() == 3 ) {
            lblEvaluatie.setText("Evaluatie 3");
            dashboardActiveren();
        } else {
            lblEvaluatie.setText("Gelieve een Evaluatie te selecteren");
            dashboardDeactiveren();
        }

        } catch (NullPointerException ex) {
            lblEvaluatie.setText("Gelieve een Evaluatie te selecteren");
            dashboardDeactiveren();
        }
        
       ophalenGegevens();
//        opmerkingVullen();

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

//    public void opmerkingVullen() {
//        try {
//
//            String text = Configuratie.evaluatie.getRijtechniek().getZithouding().getZithoudingOpm();
//            txtOpmerkingen.setText(text);
//        } catch (NullPointerException ex) {
//        }
//    }

    public void ophalenGegevens() {
        
        

        //Controle voor rotonde selectie
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
            circleAutostrade.setFill(Color.WHITE);

        }

        //Controle voor Tanken selectie
        try {
            int getalTanken = Configuratie.evaluatie.getDashboard().getTanken().getTanken();
            if (getalTanken == 1) {
                circleTanken.setFill(Color.RED);
            } else if (getalTanken == 2) {
                circleTanken.setFill(Color.ORANGE);
            } else if (getalTanken == 3) {
                circleTanken.setFill(Color.GREEN);

            } else {
                circleTanken.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            circleTanken.setFill(Color.WHITE);

        }

        //Controle voor GPS selectie
        try {
            int getalGPS = Configuratie.evaluatie.getDashboard().getGps().getGps();
            if (getalGPS == 1) {
                circleGPS.setFill(Color.RED);
            } else if (getalGPS == 2) {
                circleGPS.setFill(Color.ORANGE);
            } else if (getalGPS == 3) {
                circleGPS.setFill(Color.GREEN);
            } else {
                circleGPS.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            circleGPS.setFill(Color.WHITE);

        }

        //Controle voor Noodstop selectie
        try {
            int getalNoodstop = Configuratie.evaluatie.getDashboard().getNoodstop().getNoodstop();
            if (getalNoodstop == 1) {
                circleNoodstop.setFill(Color.RED);
            } else if (getalNoodstop == 2) {
                circleNoodstop.setFill(Color.ORANGE);
            } else if (getalNoodstop == 3) {
                circleNoodstop.setFill(Color.GREEN);
            } else {
                circleNoodstop.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            circleNoodstop.setFill(Color.WHITE);

        }

        //Controle voor Noodstop selectie
        try {
            int getalSchakelaars = Configuratie.evaluatie.getDashboard().getSchakelaars().getSchakelaars();
            if (getalSchakelaars == 1) {
                circleSchakelaars.setFill(Color.RED);
            } else if (getalSchakelaars == 2) {
                circleSchakelaars.setFill(Color.ORANGE);
            } else if (getalSchakelaars == 3) {
                circleSchakelaars.setFill(Color.GREEN);
            } else {
                circleSchakelaars.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            circleSchakelaars.setFill(Color.WHITE);

        }

        //Controle voor Noodstop selectie
        try {
            int getalVloeistoffen = Configuratie.evaluatie.getDashboard().getVloeistoffen().getVloeistoffen();
            if (getalVloeistoffen == 1) {
                circleVloeistoffen.setFill(Color.RED);
            } else if (getalVloeistoffen == 2) {
                circleVloeistoffen.setFill(Color.ORANGE);
            } else if (getalVloeistoffen == 3) {
                circleVloeistoffen.setFill(Color.GREEN);
            } else {
                circleVloeistoffen.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            circleVloeistoffen.setFill(Color.WHITE);

        }

        //Controle voor Noodstop selectie
        try {
            int getalBanden = Configuratie.evaluatie.getDashboard().getBanden().getBanden();
            if (getalBanden == 1) {
                circleBanden.setFill(Color.RED);
            } else if (getalBanden == 2) {
                circleBanden.setFill(Color.ORANGE);
            } else if (getalBanden == 3) {
                circleBanden.setFill(Color.GREEN);
            } else {
                circleBanden.setFill(Color.WHITE);
            }

        } catch (NullPointerException ex) {
            circleBanden.setFill(Color.WHITE);

        }
        try {
            progressbar.setProgress(Configuratie.getEvaluatie().getProgress());
        } catch (NullPointerException ex) {
       
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
            dashboardActiveren();
        }
        
        if (evaluatie == 0) {
            dashboardLeegmaken();
        }

        Configuratie.setEvaluatie(evaluatietest);
        System.out.println(evaluatietest.getLeerling().getNaamVoornaam());
        try {
            progressbar.setProgress(Configuratie.getEvaluatie().getProgress());
        } catch (NullPointerException ex) {

        }
        ophalenGegevens();
        dashboardActiveren();
//        opmerkingVullen();

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
        evaluatieselecteren(0);
        switcher.logout();
        
    }

    @FXML
    public void schakelaars() {
        Dashboard_Schakelaars schakelaar = new Dashboard_Schakelaars();
        if (circleSchakelaars.getFill() == Color.WHITE) {
            circleSchakelaars.setFill(Color.RED);
            schakelaar.setSchakelaars(1);
            Configuratie.evaluatie.getDashboard().setSchakelaars(schakelaar);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleSchakelaars.getFill() == Color.RED) {
            circleSchakelaars.setFill(Color.ORANGE);
            schakelaar.setSchakelaars(2);
            Configuratie.evaluatie.getDashboard().setSchakelaars(schakelaar);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleSchakelaars.getFill() == Color.ORANGE) {
            circleSchakelaars.setFill(Color.GREEN);
            schakelaar.setSchakelaars(3);
            Configuratie.evaluatie.getDashboard().setSchakelaars(schakelaar);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            schakelaar.setSchakelaars(4);
            circleSchakelaars.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setSchakelaars(schakelaar);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }
    }

    @FXML
    public void vloeistoffen() {
        Dashboard_Vloeistoffen vloeistof = new Dashboard_Vloeistoffen();
        if (circleVloeistoffen.getFill() == Color.WHITE) {
            circleVloeistoffen.setFill(Color.RED);
            vloeistof.setVloeistoffen(1);
            Configuratie.evaluatie.getDashboard().setVloeistoffen(vloeistof);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleVloeistoffen.getFill() == Color.RED) {
            circleVloeistoffen.setFill(Color.ORANGE);
            vloeistof.setVloeistoffen(2);
            Configuratie.evaluatie.getDashboard().setVloeistoffen(vloeistof);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleVloeistoffen.getFill() == Color.ORANGE) {
            circleVloeistoffen.setFill(Color.GREEN);
            vloeistof.setVloeistoffen(3);
            Configuratie.evaluatie.getDashboard().setVloeistoffen(vloeistof);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            vloeistof.setVloeistoffen(4);
            circleVloeistoffen.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setVloeistoffen(vloeistof);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }
    }

    @FXML
    public void banden() {
        Dashboard_Banden band = new Dashboard_Banden();
        if (circleBanden.getFill() == Color.WHITE) {
            circleBanden.setFill(Color.RED);
            band.setBanden(1);
            Configuratie.evaluatie.getDashboard().setBanden(band);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleBanden.getFill() == Color.RED) {
            circleBanden.setFill(Color.ORANGE);
            band.setBanden(2);
            Configuratie.evaluatie.getDashboard().setBanden(band);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleBanden.getFill() == Color.ORANGE) {
            circleBanden.setFill(Color.GREEN);
            band.setBanden(3);
            Configuratie.evaluatie.getDashboard().setBanden(band);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            band.setBanden(4);
            circleBanden.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setBanden(band);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }
    }

    @FXML
    public void tanken() {
        Dashboard_Tanken tanken = new Dashboard_Tanken();
        if (circleTanken.getFill() == Color.WHITE) {
            circleTanken.setFill(Color.RED);
            tanken.setTanken(1);
            Configuratie.evaluatie.getDashboard().setTanken(tanken);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleTanken.getFill() == Color.RED) {
            circleTanken.setFill(Color.ORANGE);
            tanken.setTanken(2);
            Configuratie.evaluatie.getDashboard().setTanken(tanken);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleTanken.getFill() == Color.ORANGE) {
            circleTanken.setFill(Color.GREEN);
            tanken.setTanken(3);
            Configuratie.evaluatie.getDashboard().setTanken(tanken);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            tanken.setTanken(4);
            circleTanken.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setTanken(tanken);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }
    }

    @FXML
    public void gps() {
        Dashboard_GPS gps = new Dashboard_GPS();
        if (circleGPS.getFill() == Color.WHITE) {
            circleGPS.setFill(Color.RED);
            gps.setGps(1);
            Configuratie.evaluatie.getDashboard().setGps(gps);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleGPS.getFill() == Color.RED) {
            circleGPS.setFill(Color.ORANGE);
            gps.setGps(2);
            Configuratie.evaluatie.getDashboard().setGps(gps);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleGPS.getFill() == Color.ORANGE) {
            circleGPS.setFill(Color.GREEN);
            gps.setGps(3);
            Configuratie.evaluatie.getDashboard().setGps(gps);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            gps.setGps(4);
            circleGPS.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setGps(gps);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        }
    }

    @FXML
    public void noodstop() {
        Dashboard_Noodstop nood = new Dashboard_Noodstop();
        if (circleNoodstop.getFill() == Color.WHITE) {
            circleNoodstop.setFill(Color.RED);
            nood.setNoodstop(1);
            Configuratie.evaluatie.getDashboard().setNoodstop(nood);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleNoodstop.getFill() == Color.RED) {
            circleNoodstop.setFill(Color.ORANGE);
            nood.setNoodstop(2);
            Configuratie.evaluatie.getDashboard().setNoodstop(nood);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

        } else if (circleNoodstop.getFill() == Color.ORANGE) {
            circleNoodstop.setFill(Color.GREEN);
            nood.setNoodstop(3);
            Configuratie.evaluatie.getDashboard().setNoodstop(nood);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());
        } else {
            nood.setNoodstop(4);
            circleNoodstop.setFill(Color.WHITE);
            Configuratie.evaluatie.getDashboard().setNoodstop(nood);
            DashboardDAO.getInstance().updateDashboard(Configuratie.evaluatie.getDashboard());

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
        Configuratie.evaluatie.setProgress(progressbar.getProgress());
        EvaluatieDAO.getInstance().updateEvaluatie(Configuratie.evaluatie);
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
        Configuratie.evaluatie.setProgress(progressbar.getProgress());

        EvaluatieDAO.getInstance().updateEvaluatie(Configuratie.evaluatie);
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
            rotonde.setRotonde(4);
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
            rijstroken.setRijstroken(4);
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
    
    @FXML
    public void dashboardLeegmaken()
    {
        txtOpmerkingen.clear();
        circleRotonde.setFill(Color.WHITE);
        circleRijstroken.setFill(Color.WHITE);
        circleStad.setFill(Color.WHITE);
        circleAutostrade.setFill(Color.WHITE);
        circleTanken.setFill(Color.WHITE);
        circleGPS.setFill(Color.WHITE);
        circleNoodstop.setFill(Color.WHITE);
        circleSchakelaars.setFill(Color.WHITE);
        circleVloeistoffen.setFill(Color.WHITE);
        circleBanden.setFill(Color.WHITE);
    }
    
    public void dashboardActiveren()
    {
        //Buttons activeren
        btnRijtechniek.setDisable(false);
        btnAttitude.setDisable(false); 
        btnVerkeerstechniek.setDisable(false);
        btnMin.setDisable(false); 
        btnPlus.setDisable(false); 
        btnBanden.setDisable(false);
        btnTanken.setDisable(false); 
        btnNoodstop.setDisable(false); 
        btnGPS.setDisable(false); 
        btnVloeistoffen.setDisable(false); 
        btnSchakelaars.setDisable(false);
        btnRotonde.setDisable(false);
        btnRijstroken.setDisable(false); 
        btnStad.setDisable(false);
        btnAutostrade.setDisable(false);
        
        //Andere dingen activeren
        txtOpmerkingen.setDisable(false);
        
    }
    public void dashboardDeactiveren()
    {
        btnRijtechniek.setDisable(true);
        btnAttitude.setDisable(true); 
        btnVerkeerstechniek.setDisable(true);
        btnMin.setDisable(true); 
        btnPlus.setDisable(true);
        btnBanden.setDisable(true);
        btnTanken.setDisable(true); 
        btnNoodstop.setDisable(true); 
        btnGPS.setDisable(true); 
        btnVloeistoffen.setDisable(true); 
        btnSchakelaars.setDisable(true);
        btnRotonde.setDisable(true);
        btnRijstroken.setDisable(true); 
        btnStad.setDisable(true);
        btnAutostrade.setDisable(true);
        
    }

}
