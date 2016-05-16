package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_Verkeerstekens {

    private int verkeerstekens;
    private int bevelenBevoegden;
    private int verkeerstekensAndere;

    public int getVerkeerstekens() {
        return verkeerstekens;
    }

    public void setVerkeerstekens(int verkeerstekens) {
        this.verkeerstekens = verkeerstekens;
    }

    public int getBevelenBevoegden() {
        return bevelenBevoegden;
    }

    public void setBevelenBevoegden(int bevelenBevoegden) {
        this.bevelenBevoegden = bevelenBevoegden;
    }

    public int getVerkeerstekensAndere() {
        return verkeerstekensAndere;
    }

    public void setVerkeerstekensAndere(int verkeerstekensAndere) {
        this.verkeerstekensAndere = verkeerstekensAndere;
    }

}
