package Models;

public class Configuratie {
    public static Leerling leerling;
    public static Evaluatie evaluatie;

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
