package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Kijktechniek {

    private int kijkTechniekVergewissen;
    private int kijkTechniekSpiegels;
    private int kijkTechniekDodeHoek;
    private int kijkTechniekVerGenoeg;
    private int kijkTechniekSelecteren;
    private int kijkTechniekAndere;
    private String kijkTechniekOpm;

    public int getKijkTechniekVergewissen() {
        return kijkTechniekVergewissen;
    }

    public void setKijkTechniekVergewissen(int kijkTechniekVergewissen) {
        this.kijkTechniekVergewissen = kijkTechniekVergewissen;
    }

    public int getKijkTechniekSpiegels() {
        return kijkTechniekSpiegels;
    }

    public void setKijkTechniekSpiegels(int kijkTechniekSpiegels) {
        this.kijkTechniekSpiegels = kijkTechniekSpiegels;
    }

    public String getKijkTechniekOpm() {
        return kijkTechniekOpm;
    }

    public void setKijkTechniekOpm(String kijkTechniekOpm) {
        this.kijkTechniekOpm = kijkTechniekOpm;
    }

    public int getKijkTechniekDodeHoek() {
        return kijkTechniekDodeHoek;
    }

    public void setKijkTechniekDodeHoek(int kijkTechniekDodeHoek) {
        this.kijkTechniekDodeHoek = kijkTechniekDodeHoek;
    }

    public int getKijkTechniekVerGenoeg() {
        return kijkTechniekVerGenoeg;
    }

    public void setKijkTechniekVerGenoeg(int kijkTechniekVerGenoeg) {
        this.kijkTechniekVerGenoeg = kijkTechniekVerGenoeg;
    }

    public int getKijkTechniekSelecteren() {
        return kijkTechniekSelecteren;
    }

    public void setKijkTechniekSelecteren(int kijkTechniekSelecteren) {
        this.kijkTechniekSelecteren = kijkTechniekSelecteren;
    }

    public int getKijkTechniekAndere() {
        return kijkTechniekAndere;
    }

    public void setKijkTechniekAndere(int kijkTechniekAndere) {
        this.kijkTechniekAndere = kijkTechniekAndere;
    }

    public Rijtechniek_Kijktechniek() {

    }
}
