package Models.Verkeerstechniek;

public class Verkeerstechniek 
{
    private Verkeerstechniek_PlaatsOpenbareWeg plaatsOpenbareWeg;
    private Verkeerstechniek_Verkeerstekens verkeerstekens;
    private Verkeerstechniek_Richtingsaanwijzers richtingsaanwijzers;
    private Verkeerstechniek_Inhalen inhalen;
    private Verkeerstechniek_Volgafstand volgafstand;
    private Verkeerstechniek_LinksAfslaan linksAfslaan;
    private Verkeerstechniek_RechtsAfslaan rechtsAfslaan;

    public Verkeerstechniek() 
    {
        
    }

    public Verkeerstechniek(Verkeerstechniek_PlaatsOpenbareWeg plaatsOpenbareWeg, Verkeerstechniek_Verkeerstekens verkeerstekens, Verkeerstechniek_Richtingsaanwijzers richtingsaanwijzers, Verkeerstechniek_Inhalen inhalen, Verkeerstechniek_Volgafstand volgafstand, Verkeerstechniek_LinksAfslaan linksAfslaan, Verkeerstechniek_RechtsAfslaan rechtsAfslaan) 
    {
        this.plaatsOpenbareWeg = plaatsOpenbareWeg;
        this.verkeerstekens = verkeerstekens;
        this.richtingsaanwijzers = richtingsaanwijzers;
        this.inhalen = inhalen;
        this.volgafstand = volgafstand;
        this.linksAfslaan = linksAfslaan;
        this.rechtsAfslaan = rechtsAfslaan;
    }
}