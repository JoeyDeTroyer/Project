package Models.Rijtechniek;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
@NamedQuery(name = "Rijtechniek.findById", query = "SELECT g FROM Rijtechniek g WHERE g.id = :id"),
@NamedQuery(name = "Rijtechniek.findAll", query = "SELECT r FROM Rijtechniek r")
})
public class Rijtechniek {
    //Zo dat de attributen van de verschillende subklassen in de tabel kunnen gezet worden
    @Embedded
    private Rijtechniek_Balanceren balanceren;
    @Embedded
    private Rijtechniek_Keren keren;
    @Embedded
    private Rijtechniek_Kijktechniek kijkTechniek;
    @Embedded
    private Rijtechniek_Koppeling koppeling;
    @Embedded
    private Rijtechniek_Parkeren parkeren;
    @Embedded
    private Rijtechniek_Remtechniek remTechniek;
    @Embedded
    private Rijtechniek_Schakeltechniek schakelTechniek;
    @Embedded
    private Rijtechniek_Stuurtechniek stuurTechniek;
    @Embedded
    private Rijtechniek_VertrekkenHandrem vertrekkenHandrem;
    @Embedded 
    private Rijtechniek_VertrekkenHelling vertrekkenHelling;
    @Embedded
    private Rijtechniek_VertrekkenVoetrem vertrekkenVoetrem;
    @Embedded
    private Rijtechniek_Zithouding zithouding;
    
    //Dit geeft een autonummering als primaire sleutel in de tabel Rijtechniek
    @Id
    private long id;

    /*public Rijtechniek(int kerenID, Rijtechniek_Kijktechniek kijkTechniek, Rijtechniek_Koppeling koppeling, Rijtechniek_Parkeren parkeren, Rijtechniek_Remtechniek remTechniek, Rijtechniek_Schakeltechniek schakelTechniek, Rijtechniek_Stuurtechniek stuurTechniek, Rijtechniek_Zithouding zithouding) {
        this.kerenID = kerenID;
        this.kijkTechniek = kijkTechniek;
        this.koppeling = koppeling;
        this.parkeren = parkeren;
        this.remTechniek = remTechniek;
        this.schakelTechniek = schakelTechniek;
        this.stuurTechniek = stuurTechniek;
        this.zithouding = zithouding;
    }*/
    
    
}