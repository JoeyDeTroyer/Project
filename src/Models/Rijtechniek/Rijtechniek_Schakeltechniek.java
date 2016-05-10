package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Schakeltechniek {
    private int schakeltechniekDosering;
    private int schakeltechniekBedieningAndere;
    
    private int schakeltechniekAangepast;
    private int schakeltechniekMotorrem;
    private int schakeltechniekGebruikAndere;

    public int getSchakeltechniekDosering() {
        return schakeltechniekDosering;
    }

    public void setSchakeltechniekDosering(int schakeltechniekDosering) {
        this.schakeltechniekDosering = schakeltechniekDosering;
    }

    public int getSchakeltechniekBedieningAndere() {
        return schakeltechniekBedieningAndere;
    }

    public void setSchakeltechniekBedieningAndere(int schakeltechniekBedieningAndere) {
        this.schakeltechniekBedieningAndere = schakeltechniekBedieningAndere;
    }

    public int getSchakeltechniekAangepast() {
        return schakeltechniekAangepast;
    }

    public void setSchakeltechniekAangepast(int schakeltechniekAangepast) {
        this.schakeltechniekAangepast = schakeltechniekAangepast;
    }

    public int getSchakeltechniekMotorrem() {
        return schakeltechniekMotorrem;
    }

    public void setSchakeltechniekMotorrem(int schakeltechniekMotorrem) {
        this.schakeltechniekMotorrem = schakeltechniekMotorrem;
    }

    public int getSchakeltechniekGebruikAndere() {
        return schakeltechniekGebruikAndere;
    }

    public void setSchakeltechniekGebruikAndere(int schakeltechniekGebruikAndere) {
        this.schakeltechniekGebruikAndere = schakeltechniekGebruikAndere;
    }
    
    
}
