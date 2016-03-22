package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Stuurtechniek {
    private int stuurTechniek;

    public int getStuurTechniek() {
        return stuurTechniek;
    }

    public void setStuurTechniek(int stuurTechniek) {
        this.stuurTechniek = stuurTechniek;
    }   

    public Rijtechniek_Stuurtechniek() 
    {
        
    }

    public Rijtechniek_Stuurtechniek(int stuurTechniek) 
    {
        this.stuurTechniek = stuurTechniek;
    }
}
