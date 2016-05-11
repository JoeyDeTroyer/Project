package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Autosnelweg {
    
    private int autosnelweg;

    public int getAutosnelweg() {
        return autosnelweg;
    }

    public void setAutosnelweg(int autosnelweg) {
        this.autosnelweg = autosnelweg;
    }
    
      
}
