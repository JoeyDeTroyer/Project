package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Remtechniek {

    private int remtechniekDosering;
    private int remtechniekVolgorde;

    private int remtechniekTeLaat;
    private int remtechniekGebruikAndere;
    private String remtechniekOpm;

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

    public int getRemtechniekTeLaat() {
        return remtechniekTeLaat;
    }

    public String getRemtechniekOpm() {
        return remtechniekOpm;
    }

    public void setRemtechniekOpm(String remtechniekOpm) {
        this.remtechniekOpm = remtechniekOpm;
    }

    public void setRemtechniekTeLaat(int remtechniekTeLaat) {
        this.remtechniekTeLaat = remtechniekTeLaat;
    }

    public int getRemtechniekGebruikAndere() {
        return remtechniekGebruikAndere;
    }

    public void setRemtechniekGebruikAndere(int remtechniekGebruikAndere) {
        this.remtechniekGebruikAndere = remtechniekGebruikAndere;
    }

}
