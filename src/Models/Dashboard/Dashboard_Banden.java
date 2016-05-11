
package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Banden {
    
    private int banden;

    public int getBanden() {
        return banden;
    }

    public void setBanden(int banden) {
        this.banden = banden;
    }
    
    
    
}
