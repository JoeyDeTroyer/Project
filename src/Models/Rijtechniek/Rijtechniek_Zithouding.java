package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Zithouding {
    private int zithouding;
    private int zithoudingGordels;
    private int zithoudingSpiegels;
    private int zithoudingHandrem;
    private int zithoudingAndere;
    private String zithoudingOpm;
    private int zithoudingOpmInt;

    public String getZithoudingOpm() {
        return zithoudingOpm;
    }

    public void setZithoudingOpm(String zithoudingOpm) {
        this.zithoudingOpm = zithoudingOpm;
    }

    public int getZithouding() {
        return zithouding;
    }

    public int getZithoudingGordels() {
        return zithoudingGordels;
    }

    public int getZithoudingSpiegels() {
        return zithoudingSpiegels;
    }

    public int getZithoudingHandrem() {
        return zithoudingHandrem;
    }

    public int getZithoudingAndere() {
        return zithoudingAndere;
    }

    public void setZithouding(int zithouding) {
        this.zithouding = zithouding;
    }

    public void setZithoudingGordels(int zithoudingGordels) {
        this.zithoudingGordels = zithoudingGordels;
    }

    public void setZithoudingSpiegels(int zithoudingSpiegels) {
        this.zithoudingSpiegels = zithoudingSpiegels;
    }

    public void setZithoudingHandrem(int zithoudingHandrem) {
        this.zithoudingHandrem = zithoudingHandrem;
    }

    public void setZithoudingAndere(int zithoudingAndere) {
        this.zithoudingAndere = zithoudingAndere;
    }

    public int getZithoudingOpmInt() {
        return zithoudingOpmInt;
    }

    public void setZithoudingOpmInt(int zithoudingOpmInt) {
        this.zithoudingOpmInt = zithoudingOpmInt;
    }
    
    

    public Rijtechniek_Zithouding() 
    {
        
    }

    public Rijtechniek_Zithouding(int zithouding, int zithoudingGordels, int zithoudingSpiegels, int zithoudingHandrem, int zithoudingAndere) 
    {
        this.zithouding = zithouding;
        this.zithoudingGordels = zithoudingGordels;
        this.zithoudingSpiegels = zithoudingSpiegels;
        this.zithoudingHandrem = zithoudingHandrem;
        this.zithoudingAndere = zithoudingAndere;
    }
}
