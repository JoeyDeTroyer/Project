package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Schakeltechniek {

    private int schakeltechniekDosering;
    private int schakeltechniekBedieningAndere;

    private int schakeltechniekAangepast;
    private int schakeltechniekMotorrem;
    private int schakeltechniekGebruikAndere;
    private String schakeltechniekOpm;

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

    public String getSchakeltechniekOpm() {
        return schakeltechniekOpm;
    }

    public void setSchakeltechniekOpm(String schakeltechniekOpm) {
        this.schakeltechniekOpm = schakeltechniekOpm;
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
