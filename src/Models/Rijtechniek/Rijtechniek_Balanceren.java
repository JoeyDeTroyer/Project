package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Balanceren {
    
    private int balanceren;
    private int voetrem;
    private int handrem;

    public int getVoetrem() {
        return voetrem;
    }

    public void setVoetrem(int voetrem) {
        this.voetrem = voetrem;
    }

    public int getHandrem() {
        return handrem;
    }

    public void setHandrem(int handrem) {
        this.handrem = handrem;
    }
    

    public int getBalanceren() {
        return balanceren;
    }

    public void setBalanceren(int balanceren) {
        this.balanceren = balanceren;
    }

    public Rijtechniek_Balanceren() 
    {
    }

    public Rijtechniek_Balanceren(int balanceren) 
    {
        this.balanceren = balanceren;
    }  
}
