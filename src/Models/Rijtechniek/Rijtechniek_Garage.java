package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Garage {
    
    private int garage;

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }
    
    
}
