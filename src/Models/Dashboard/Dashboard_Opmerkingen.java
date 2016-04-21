package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Opmerkingen {
    
    String[] opmerkingen = new String[30];

    public String[] getOpmerkingen() {
        return opmerkingen;
    }

    public void setOpmerkingen(String[] opmerkingen) {
        this.opmerkingen = opmerkingen;
    }
}
