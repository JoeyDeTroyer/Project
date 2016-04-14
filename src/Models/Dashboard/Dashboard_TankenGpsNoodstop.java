package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_TankenGpsNoodstop {
    
    private int tanken;
    private int gps;
    private int noodstop;

    public int getTanken() {
        return tanken;
    }

    public void setTanken(int tanken) {
        this.tanken = tanken;
    }

    public int getGps() {
        return gps;
    }

    public void setGps(int gps) {
        this.gps = gps;
    }

    public int getNoodstop() {
        return noodstop;
    }

    public void setNoodstop(int noodstop) {
        this.noodstop = noodstop;
    }
}
