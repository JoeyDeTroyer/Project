package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Achteruitrijden {

    private int achteruitRijden;

    public int getAchteruitRijden() {
        return achteruitRijden;
    }

    public void setAchteruitRijden(int achteruitRijden) {
        this.achteruitRijden = achteruitRijden;
    }

}
