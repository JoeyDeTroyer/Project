package Models.Verkeerstechniek;

public class Verkeerstechniek_Richtingsaanwijzers 
{
    private int verkeerstechniekGebruik;
    private int verkeerstechniekTijdigGebruik;
    private int verkeerstechniekAndere;

    public Verkeerstechniek_Richtingsaanwijzers() 
    {
        
    }

    public Verkeerstechniek_Richtingsaanwijzers(int verkeerstechniekGebruik, int verkeerstechniekTijdigGebruik, int verkeerstechniekAndere) 
    {
        this.verkeerstechniekGebruik = verkeerstechniekGebruik;
        this.verkeerstechniekTijdigGebruik = verkeerstechniekTijdigGebruik;
        this.verkeerstechniekAndere = verkeerstechniekAndere;
    }

    public int getVerkeerstechniekGebruik() 
    {
        return verkeerstechniekGebruik;
    }

    public void setVerkeerstechniekGebruik(int verkeerstechniekGebruik) 
    {
        this.verkeerstechniekGebruik = verkeerstechniekGebruik;
    }

    public int getVerkeerstechniekTijdigGebruik() 
    {
        return verkeerstechniekTijdigGebruik;
    }

    public void setVerkeerstechniekTijdigGebruik(int verkeerstechniekTijdigGebruik) 
    {
        this.verkeerstechniekTijdigGebruik = verkeerstechniekTijdigGebruik;
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