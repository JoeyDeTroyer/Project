package Models;

import Models.Dashboard.Dashboard;
import Models.Rijtechniek.Rijtechniek;
import Models.Verkeerstechniek.Verkeerstechniek;

public class Configuratie {
    public static Leerling leerling;
    public static Evaluatie evaluatie;
    public static Rijtechniek rijtechniek;
    public static Verkeerstechniek verkeerstechniek;
    public static Dashboard dashboard;

    public static Dashboard getDashboard() {
        return dashboard;
    }

    public static void setDashboard(Dashboard dashboard) {
        Configuratie.dashboard = dashboard;
    }

    public static Verkeerstechniek getVerkeerstechniek() {
        return verkeerstechniek;
    }

    public static void setVerkeerstechniek(Verkeerstechniek verkeerstechniek) {
        Configuratie.verkeerstechniek = verkeerstechniek;
    }

    public static Rijtechniek getRijtechniek() {
        return rijtechniek;
    }

    public static void setRijtechniek(Rijtechniek rijtechniek) {
        Configuratie.rijtechniek = rijtechniek;
    }

    public static Leerling getLeerling() {
        return leerling;
    }

    public static void setLeerling(Leerling leerling) {
        Configuratie.leerling = leerling;
    }

    public static Evaluatie getEvaluatie() {
        return evaluatie;
    }

    public static void setEvaluatie(Evaluatie evaluatie) {
        Configuratie.evaluatie = evaluatie;
    }  
}
