package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_PlaatsOpenbareWeg 
{
    private int plaatsOpDeWeg;
    private int Voorsorteren;
    private int plaatsOpenbarewegAndere;

    public Verkeerstechniek_PlaatsOpenbareWeg() 
    {
        
    }

    public Verkeerstechniek_PlaatsOpenbareWeg(int verkeerstechniekPlaatsOpDeWeg, int verkeerstechniekVoorsorteren, int verkeerstechniekAndere) 
    {
        this.plaatsOpDeWeg = plaatsOpDeWeg;
        this.Voorsorteren = Voorsorteren;
        this.plaatsOpenbarewegAndere = plaatsOpenbarewegAndere;
    }

    public int getPlaatsOpDeWeg() {
        return plaatsOpDeWeg;
    }

    public void setPlaatsOpDeWeg(int plaatsOpDeWeg) {
        this.plaatsOpDeWeg = plaatsOpDeWeg;
    }

    public int getVoorsorteren() {
        return Voorsorteren;
    }

    public void setVoorsorteren(int Voorsorteren) {
        this.Voorsorteren = Voorsorteren;
    }

    public int getPlaatsOpenbarewegAndere() {
        return plaatsOpenbarewegAndere;
    }

    public void setPlaatsOpenbarewegAndere(int plaatsOpenbarewegAndere) {
        this.plaatsOpenbarewegAndere = plaatsOpenbarewegAndere;
    }

    
}