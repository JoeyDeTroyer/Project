package Models.Rijtechniek;

public class Rijtechniek {
    private int kerenID;
    private Rijtechniek_Kijktechniek kijkTechniek;
    private Rijtechniek_Koppeling koppeling;
    private Rijtechniek_Parkeren parkeren;
    private Rijtechniek_Remtechniek remTechniek;
    private Rijtechniek_Schakeltechniek schakelTechniek;
    private Rijtechniek_Stuurtechniek stuurTechniek;
    private Rijtechniek_Zithouding zithouding; 
    
    public Rijtechniek()
    {
        
    }

    public Rijtechniek(int kerenID, Rijtechniek_Kijktechniek kijkTechniek, Rijtechniek_Koppeling koppeling, Rijtechniek_Parkeren parkeren, Rijtechniek_Remtechniek remTechniek, Rijtechniek_Schakeltechniek schakelTechniek, Rijtechniek_Stuurtechniek stuurTechniek, Rijtechniek_Zithouding zithouding) {
        this.kerenID = kerenID;
        this.kijkTechniek = kijkTechniek;
        this.koppeling = koppeling;
        this.parkeren = parkeren;
        this.remTechniek = remTechniek;
        this.schakelTechniek = schakelTechniek;
        this.stuurTechniek = stuurTechniek;
        this.zithouding = zithouding;
    }
}