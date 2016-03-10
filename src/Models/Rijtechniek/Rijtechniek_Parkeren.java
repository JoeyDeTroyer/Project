package Models.Rijtechniek;

public class Rijtechniek_Parkeren {
    
    private int parkerenTweeVoertuigen;
    private int parkerenAchterVoertuigen;
    private int parkerenLinks;

    public int getParkerenTweeVoertuigen() {
        return parkerenTweeVoertuigen;
    }

    public void setParkerenTweeVoertuigen(int parkerenTweeVoertuigen) {
        this.parkerenTweeVoertuigen = parkerenTweeVoertuigen;
    }

    public int getParkerenAchterVoertuigen() {
        return parkerenAchterVoertuigen;
    }

    public void setParkerenAchterVoertuigen(int parkerenAchterVoertuigen) {
        this.parkerenAchterVoertuigen = parkerenAchterVoertuigen;
    }

    public int getParkerenLinks() {
        return parkerenLinks;
    }

    public void setParkerenLinks(int parkerenLinks) {
        this.parkerenLinks = parkerenLinks;
    }

    public Rijtechniek_Parkeren() 
    {
        
    }

    public Rijtechniek_Parkeren(int parkerenTweeVoertuigen, int parkerenAchterVoertuigen, int parkerenLinks) 
    {
        this.parkerenTweeVoertuigen = parkerenTweeVoertuigen;
        this.parkerenAchterVoertuigen = parkerenAchterVoertuigen;
        this.parkerenLinks = parkerenLinks;
    }
        
}
