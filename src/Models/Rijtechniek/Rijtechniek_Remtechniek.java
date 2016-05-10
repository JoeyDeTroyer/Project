package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Remtechniek {
    private int remtechniekDosering;
    private int remtechniekVolgorde;
    private int remtechniekBedieningAndere;
    
    private int remtechniekTeLaat;
    private int remtechniekAfremmenMotor;
    private int remtechniekGebruikAndere;

    public int getRemtechniekDosering() {
        return remtechniekDosering;
    }

    public void setRemtechniekDosering(int remtechniekDosering) {
        this.remtechniekDosering = remtechniekDosering;
    }

    public int getRemtechniekVolgorde() {
        return remtechniekVolgorde;
    }

    public void setRemtechniekVolgorde(int remtechniekVolgorde) {
        this.remtechniekVolgorde = remtechniekVolgorde;
    }

    public int getRemtechniekBedieningAndere() {
        return remtechniekBedieningAndere;
    }

    public void setRemtechniekBedieningAndere(int remtechniekBedieningAndere) {
        this.remtechniekBedieningAndere = remtechniekBedieningAndere;
    }

    public int getRemtechniekTeLaat() {
        return remtechniekTeLaat;
    }

    public void setRemtechniekTeLaat(int remtechniekTeLaat) {
        this.remtechniekTeLaat = remtechniekTeLaat;
    }

    public int getRemtechniekAfremmenMotor() {
        return remtechniekAfremmenMotor;
    }

    public void setRemtechniekAfremmenMotor(int remtechniekAfremmenMotor) {
        this.remtechniekAfremmenMotor = remtechniekAfremmenMotor;
    }

    public int getRemtechniekGebruikAndere() {
        return remtechniekGebruikAndere;
    }

    public void setRemtechniekGebruikAndere(int remtechniekGebruikAndere) {
        this.remtechniekGebruikAndere = remtechniekGebruikAndere;
    }
    
    
}
