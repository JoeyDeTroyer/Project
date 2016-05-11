
package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Vloeistoffen {
    private int vloeistoffen;

    public int getVloeistoffen() {
        return vloeistoffen;
    }

    public void setVloeistoffen(int vloeistoffen) {
        this.vloeistoffen = vloeistoffen;
    }
    
    
    
}
