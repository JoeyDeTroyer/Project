package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_GPS {
    
    private int gps;

    public int getGps() {
        return gps;
    }

    public void setGps(int gps) {
        this.gps = gps;
    }
    
    
    
}
