package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Koppeling {
    private int koppeling;

    public int getKoppeling() {
        return koppeling;
    }

    public void setKoppeling(int koppeling) {
        this.koppeling = koppeling;
    }

    public Rijtechniek_Koppeling() 
    {
        
    }

    public Rijtechniek_Koppeling(int koppeling) 
    {
        this.koppeling = koppeling;
    }   
}
