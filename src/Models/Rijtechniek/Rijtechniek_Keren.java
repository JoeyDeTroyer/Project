package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Keren {

    private int keren;

    public int getKeren() {
        return keren;
    }

    public void setKeren(int keren) {
        this.keren = keren;
    }

}
