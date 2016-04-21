package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_RechtsAfslaan
{
    private int opstellingRechts;
    private int uitvoeringRechts;
    private int rechtsAfslaanAndere;

    public Verkeerstechniek_RechtsAfslaan() 
    {
        
    }

//    public Verkeerstechniek_RechtsAfslaan(int opstelling, int uitvoering, int rechtsAfslaanAndere) {
//        this.opstelling = opstelling;
//        this.uitvoering = uitvoering;
//        this.rechtsAfslaanAndere = rechtsAfslaanAndere;
//    }
    

    public int getOpstellingRechts() {
        return opstellingRechts;
    }

    public void setOpstellingRechts(int opstellingRechts) {
        this.opstellingRechts = opstellingRechts;
    }

    public int getUitvoeringRechts() {
        return uitvoeringRechts;
    }

    public void setUitvoeringRechts(int uitvoeringRechts) {
        this.uitvoeringRechts = uitvoeringRechts;
    }

    

    public int getRechtsAfslaanAndere() {
        return rechtsAfslaanAndere;
    }

    public void setRechtsAfslaanAndere(int rechtsAfslaanAndere) {
        this.rechtsAfslaanAndere = rechtsAfslaanAndere;
    }

   
}