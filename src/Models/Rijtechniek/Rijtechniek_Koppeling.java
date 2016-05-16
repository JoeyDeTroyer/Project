package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Koppeling {

    private int koppelingDosering;
    private int koppelingVolledig;
    private int koppelingVoetAf;
    private int koppelingBedieningAndere;

    private int koppelingOnnodig;
    private int koppelingBocht;
    private int koppelingGebruikAndere;
    private String koppelingOpm;

    public int getKoppelingDosering() {
        return koppelingDosering;
    }

    public void setKoppelingDosering(int koppelingDosering) {
        this.koppelingDosering = koppelingDosering;
    }

    public int getKoppelingVolledig() {
        return koppelingVolledig;
    }

    public void setKoppelingVolledig(int koppelingVolledig) {
        this.koppelingVolledig = koppelingVolledig;
    }

    public int getKoppelingVoetAf() {
        return koppelingVoetAf;
    }

    public String getKoppelingOpm() {
        return koppelingOpm;
    }

    public void setKoppelingOpm(String koppelingOpm) {
        this.koppelingOpm = koppelingOpm;
    }

    public void setKoppelingVoetAf(int koppelingVoetAf) {
        this.koppelingVoetAf = koppelingVoetAf;
    }

    public int getKoppelingBedieningAndere() {
        return koppelingBedieningAndere;
    }

    public void setKoppelingBedieningAndere(int koppelingBedieningAndere) {
        this.koppelingBedieningAndere = koppelingBedieningAndere;
    }

    public int getKoppelingOnnodig() {
        return koppelingOnnodig;
    }

    public void setKoppelingOnnodig(int koppelingOnnodig) {
        this.koppelingOnnodig = koppelingOnnodig;
    }

    public int getKoppelingBocht() {
        return koppelingBocht;
    }

    public void setKoppelingBocht(int koppelingBocht) {
        this.koppelingBocht = koppelingBocht;
    }

    public int getKoppelingGebruikAndere() {
        return koppelingGebruikAndere;
    }

    public void setKoppelingGebruikAndere(int koppelingGebruikAndere) {
        this.koppelingGebruikAndere = koppelingGebruikAndere;
    }

}
