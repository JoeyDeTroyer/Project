package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Stuurtechniek {
    private int stuurtechniekDosering;
    private int stuurtechniekHouding;
    private int stuurtechniekAndere;

    public int getStuurtechniekDosering() {
        return stuurtechniekDosering;
    }

    public void setStuurtechniekDosering(int stuurtechniekDosering) {
        this.stuurtechniekDosering = stuurtechniekDosering;
    }

    public int getStuurtechniekHouding() {
        return stuurtechniekHouding;
    }

    public void setStuurtechniekHouding(int stuurtechniekHouding) {
        this.stuurtechniekHouding = stuurtechniekHouding;
    }

    public int getStuurtechniekAndere() {
        return stuurtechniekAndere;
    }

    public void setStuurtechniekAndere(int stuurtechniekAndere) {
        this.stuurtechniekAndere = stuurtechniekAndere;
    }
    
    
}
