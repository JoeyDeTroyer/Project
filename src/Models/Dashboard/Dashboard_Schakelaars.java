package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Schakelaars {

    private int schakelaars;

    public int getSchakelaars() {
        return schakelaars;
    }

    public void setSchakelaars(int schakelaars) {
        this.schakelaars = schakelaars;
    }

}
