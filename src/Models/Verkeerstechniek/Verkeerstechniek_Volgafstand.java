package Models.Verkeerstechniek;

public class Verkeerstechniek_Volgafstand 
{
    private int verkeerstechniekVolgafstand;
    private int verkeerstechniekZijdelings;
    private int verkeerstechniekAndere;

    public Verkeerstechniek_Volgafstand() 
    {
        
    }

    public Verkeerstechniek_Volgafstand(int verkeerstechniekVolgafstand, int verkeerstechniekZijdelings, int verkeerstechniekAndere) 
    {
        this.verkeerstechniekVolgafstand = verkeerstechniekVolgafstand;
        this.verkeerstechniekZijdelings = verkeerstechniekZijdelings;
        this.verkeerstechniekAndere = verkeerstechniekAndere;
    }

    public int getVerkeerstechniekVolgafstand() 
    {
        return verkeerstechniekVolgafstand;
    }

    public void setVerkeerstechniekVolgafstand(int verkeerstechniekVolgafstand) 
    {
        this.verkeerstechniekVolgafstand = verkeerstechniekVolgafstand;
    }

    public int getVerkeerstechniekZijdelings() 
    {
        return verkeerstechniekZijdelings;
    }

    public void setVerkeerstechniekZijdelings(int verkeerstechniekZijdelings) 
    {
        this.verkeerstechniekZijdelings = verkeerstechniekZijdelings;
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