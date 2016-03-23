package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Balanceren {
    
    private int balanceren;

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
