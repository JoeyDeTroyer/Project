package Models;

import Models.Rijtechniek.Rijtechniek;

public class Configuratie {
    public static Leerling leerling;
    public static Evaluatie evaluatie;
    public static Rijtechniek rijtechniek;

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
