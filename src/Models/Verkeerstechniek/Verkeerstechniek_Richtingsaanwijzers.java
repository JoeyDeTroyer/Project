package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_Richtingsaanwijzers 
{
    private int gebruik;
    private int tijdigGebruik;
    private int richtingsaanwijzersAndere;

    public Verkeerstechniek_Richtingsaanwijzers() 
    {
        
    }

    public Verkeerstechniek_Richtingsaanwijzers(int gebruik, int tijdigGebruik, int richtingsaanwijzersAndere) {
        this.gebruik = gebruik;
        this.tijdigGebruik = tijdigGebruik;
        this.richtingsaanwijzersAndere = richtingsaanwijzersAndere;
    }
    
    

    public int getGebruik() {
        return gebruik;
    }

    public void setGebruik(int gebruik) {
        this.gebruik = gebruik;
    }

    public int getTijdigGebruik() {
        return tijdigGebruik;
    }

    public void setTijdigGebruik(int tijdigGebruik) {
        this.tijdigGebruik = tijdigGebruik;
    }

    public int getRichtingsaanwijzersAndere() {
        return richtingsaanwijzersAndere;
    }

    public void setRichtingsaanwijzersAndere(int richtingsaanwijzersAndere) {
        this.richtingsaanwijzersAndere = richtingsaanwijzersAndere;
    }

    
}