package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_Stad {

    private int stad;

    public int getStad() {
        return stad;
    }

    public void setStad(int stad) {
        this.stad = stad;
    }

}
