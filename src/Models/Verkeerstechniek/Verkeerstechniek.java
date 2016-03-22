package Models.Verkeerstechniek;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name = "Verkeerstechniek.findAll", query = "SELECT v FROM Verkeerstechniek v")
})
public class Verkeerstechniek {
    @Embedded
    private Verkeerstechniek_PlaatsOpenbareWeg plaatsOpenbareWeg;
    @Embedded
    private Verkeerstechniek_Verkeerstekens verkeerstekens;
    @Embedded
    private Verkeerstechniek_Richtingsaanwijzers richtingsaanwijzers;
    @Embedded
    private Verkeerstechniek_Inhalen inhalen;
    @Embedded
    private Verkeerstechniek_Volgafstand volgafstand;
    @Embedded
    private Verkeerstechniek_LinksAfslaan linksAfslaan;
    @Embedded
    private Verkeerstechniek_RechtsAfslaan rechtsAfslaan;
    
   @Id
   private long id;

//    public Verkeerstechniek() 
//    {
//        
//    }

//    public Verkeerstechniek(Verkeerstechniek_PlaatsOpenbareWeg plaatsOpenbareWeg, Verkeerstechniek_Verkeerstekens verkeerstekens, Verkeerstechniek_Richtingsaanwijzers richtingsaanwijzers, Verkeerstechniek_Inhalen inhalen, Verkeerstechniek_Volgafstand volgafstand, Verkeerstechniek_LinksAfslaan linksAfslaan, Verkeerstechniek_RechtsAfslaan rechtsAfslaan) 
//    {
//        this.plaatsOpenbareWeg = plaatsOpenbareWeg;
//        this.verkeerstekens = verkeerstekens;
//        this.richtingsaanwijzers = richtingsaanwijzers;
//        this.inhalen = inhalen;
//        this.volgafstand = volgafstand;
//        this.linksAfslaan = linksAfslaan;
//        this.rechtsAfslaan = rechtsAfslaan;
//    }
}