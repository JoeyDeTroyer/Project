package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_LinksAfslaan 
{
    private int opstelling;
    private int uitvoering;
    private int linksAfslaanAndere;

    public Verkeerstechniek_LinksAfslaan() 
    {
        
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

    public int getLinksAfslaanAndere() {
        return linksAfslaanAndere;
    }

    public void setLinksAfslaanAndere(int linksAfslaanAndere) {
        this.linksAfslaanAndere = linksAfslaanAndere;
    }

    
}