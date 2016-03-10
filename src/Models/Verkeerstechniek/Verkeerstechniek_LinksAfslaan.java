package Models.Verkeerstechniek;

public class Verkeerstechniek_LinksAfslaan 
{
    private int verkeerstechniekOpstelling;
    private int verkeerstechniekUitvoering;
    private int verkeerstechniekAndere;

    public Verkeerstechniek_LinksAfslaan() 
    {
        
    }

    public Verkeerstechniek_LinksAfslaan(int verkeerstechniekOpstelling, int verkeerstechniekUitvoering, int verkeerstechniekAndere) 
    {
        this.verkeerstechniekOpstelling = verkeerstechniekOpstelling;
        this.verkeerstechniekUitvoering = verkeerstechniekUitvoering;
        this.verkeerstechniekAndere = verkeerstechniekAndere;
    }

    public int getVerkeerstechniekOpstelling() 
    {
        return verkeerstechniekOpstelling;
    }

    public void setVerkeerstechniekOpstelling(int verkeerstechniekOpstelling) 
    {
        this.verkeerstechniekOpstelling = verkeerstechniekOpstelling;
    }

    public int getVerkeerstechniekUitvoering() 
    {
        return verkeerstechniekUitvoering;
    }

    public void setVerkeerstechniekUitvoering(int verkeerstechniekUitvoering) 
    {
        this.verkeerstechniekUitvoering = verkeerstechniekUitvoering;
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