package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_RechtsAfslaan
{
    private int opstelling;
    private int uitvoering;
    private int rechtsAfslaanAndere;

    public Verkeerstechniek_RechtsAfslaan() 
    {
        
    }

    public Verkeerstechniek_RechtsAfslaan(int opstelling, int uitvoering, int rechtsAfslaanAndere) {
        this.opstelling = opstelling;
        this.uitvoering = uitvoering;
        this.rechtsAfslaanAndere = rechtsAfslaanAndere;
    }
    

    public int getOpstelling() {
        return opstelling;
    }

    public void setOpstelling(int opstelling) {
        this.opstelling = opstelling;
    }

    public int getUitvoering() {
        return uitvoering;
    }

    public void setUitvoering(int uitvoering) {
        this.uitvoering = uitvoering;
    }

    public int getRechtsAfslaanAndere() {
        return rechtsAfslaanAndere;
    }

    public void setRechtsAfslaanAndere(int rechtsAfslaanAndere) {
        this.rechtsAfslaanAndere = rechtsAfslaanAndere;
    }

   
}