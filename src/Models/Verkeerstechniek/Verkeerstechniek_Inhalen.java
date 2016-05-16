package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_Inhalen {

    private int inhalen;
    private int voorbijrijden;
    private int inhalenAndere;

    public Verkeerstechniek_Inhalen() {

    }

    public int getInhalen() {
        return inhalen;
    }

    public void setInhalen(int inhalen) {
        this.inhalen = inhalen;
    }

    public int getVoorbijrijden() {
        return voorbijrijden;
    }

    public void setVoorbijrijden(int voorbijrijden) {
        this.voorbijrijden = voorbijrijden;
    }

    public int getInhalenAndere() {
        return inhalenAndere;
    }

    public void setInhalenAndere(int inhalenAndere) {
        this.inhalenAndere = inhalenAndere;
    }

}
