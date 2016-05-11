package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Rijstroken {
    
    private int Rijstroken;

    public int getRijstroken() {
        return Rijstroken;
    }

    public void setRijstroken(int Rijstroken) {
        this.Rijstroken = Rijstroken;
    }
    
    
    
}
