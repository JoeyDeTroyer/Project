package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Rotonde {

    private int rotonde;

    public int getRotonde() {
        return rotonde;
    }

    public void setRotonde(int rotonde) {
        this.rotonde = rotonde;
    }

}
