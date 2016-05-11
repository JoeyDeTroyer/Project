
package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Noodstop {
    
    private int noodstop;

    public int getNoodstop() {
        return noodstop;
    }

    public void setNoodstop(int noodstop) {
        this.noodstop = noodstop;
    }
    
    
    
}
