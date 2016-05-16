package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Tanken {

    private int tanken;

    public int getTanken() {
        return tanken;
    }

    public void setTanken(int tanken) {
        this.tanken = tanken;
    }

}
