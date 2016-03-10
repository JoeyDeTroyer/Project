package Models.Verkeerstechniek;

public class Verkeerstechniek_Inhalen 
{
    private int verkeerstechniekInhalen;
    private int verkeersVoorbijrijden;
    private int verkeerstechniekAndere;

    public Verkeerstechniek_Inhalen() 
    {
        
    }

    public Verkeerstechniek_Inhalen(int verkeerstechniekInhalen, int verkeersVoorbijrijden, int verkeerstechniekAndere) 
    {
        this.verkeerstechniekInhalen = verkeerstechniekInhalen;
        this.verkeersVoorbijrijden = verkeersVoorbijrijden;
        this.verkeerstechniekAndere = verkeerstechniekAndere;
    }

    public int getVerkeerstechniekInhalen() 
    {
        return verkeerstechniekInhalen;
    }

    public void setVerkeerstechniekInhalen(int verkeerstechniekInhalen) 
    {
        this.verkeerstechniekInhalen = verkeerstechniekInhalen;
    }

    public int getVerkeersVoorbijrijden() 
    {
        return verkeersVoorbijrijden;
    }

    public void setVerkeersVoorbijrijden(int verkeersVoorbijrijden) 
    {
        this.verkeersVoorbijrijden = verkeersVoorbijrijden;
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