package Models.Verkeerstechniek;

public class Verkeerstechniek_PlaatsOpenbareWeg 
{
    private int verkeerstechniekPlaatsOpDeWeg;
    private int verkeerstechniekVoorsorteren;
    private int verkeerstechniekAndere;

    public Verkeerstechniek_PlaatsOpenbareWeg() 
    {
        
    }

    public Verkeerstechniek_PlaatsOpenbareWeg(int verkeerstechniekPlaatsOpDeWeg, int verkeerstechniekVoorsorteren, int verkeerstechniekAndere) 
    {
        this.verkeerstechniekPlaatsOpDeWeg = verkeerstechniekPlaatsOpDeWeg;
        this.verkeerstechniekVoorsorteren = verkeerstechniekVoorsorteren;
        this.verkeerstechniekAndere = verkeerstechniekAndere;
    }

    public int getVerkeerstechniekPlaatsOpDeWeg() 
    {
        return verkeerstechniekPlaatsOpDeWeg;
    }

    public void setVerkeerstechniekPlaatsOpDeWeg(int verkeerstechniekPlaatsOpDeWeg) 
    {
        this.verkeerstechniekPlaatsOpDeWeg = verkeerstechniekPlaatsOpDeWeg;
    }

    public int getVerkeerstechniekVoorsorteren() {
        return verkeerstechniekVoorsorteren;
    }

    public void setVerkeerstechniekVoorsorteren(int verkeerstechniekVoorsorteren) 
    {
        this.verkeerstechniekVoorsorteren = verkeerstechniekVoorsorteren;
    }

    public int getVerkeerstechniekAndere() 
    {
        return verkeerstechniekAndere;
    }

    public void setVerkeerstechniekAndere(int verkeerstechniekAndere) 
    {
        this.verkeerstechniekAndere = verkeerstechniekAndere;
    }
}