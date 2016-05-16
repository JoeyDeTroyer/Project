package Models.Verkeerstechniek;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name = "Verkeerstechniek.findById", query = "SELECT g FROM Verkeerstechniek g WHERE g.idVerkeerstechniek = :idVerkeerstechniek"),
@NamedQuery(name = "Verkeerstechniek.findAll", query = "SELECT v FROM Verkeerstechniek v")
})

public class Verkeerstechniek {
    @Id @GeneratedValue
    private long idVerkeerstechniek;
    @Embedded
    private Verkeerstechniek_Inhalen inhalen;
    @Embedded
    private Verkeerstechniek_LinksAfslaan linksAfslaan;
    @Embedded
    private Verkeerstechniek_PlaatsOpenbareWeg plaatsOpenbareWeg;
    @Embedded
    private Verkeerstechniek_RechtsAfslaan rechtsAfslaan;
    @Embedded
    private Verkeerstechniek_Richtingsaanwijzers richtingsaanwijzers;
    @Embedded
    private Verkeerstechniek_Verkeerstekens verkeerstekens;
    @Embedded
    
    private Verkeerstechniek_Volgafstand volgafstand;
    
    public Verkeerstechniek_PlaatsOpenbareWeg getPlaatsOpenbareWeg() {
        return plaatsOpenbareWeg;
    }

    public void setPlaatsOpenbareWeg(Verkeerstechniek_PlaatsOpenbareWeg plaatsOpenbareWeg) {
        this.plaatsOpenbareWeg = plaatsOpenbareWeg;
    }

    public Verkeerstechniek_Verkeerstekens getVerkeerstekens() {
        return verkeerstekens;
    }

    public void setVerkeerstekens(Verkeerstechniek_Verkeerstekens verkeerstekens) {
        this.verkeerstekens = verkeerstekens;
    }

    public Verkeerstechniek_Richtingsaanwijzers getRichtingsaanwijzers() {
        return richtingsaanwijzers;
    }

    public void setRichtingsaanwijzers(Verkeerstechniek_Richtingsaanwijzers richtingsaanwijzers) {
        this.richtingsaanwijzers = richtingsaanwijzers;
    }

    public Verkeerstechniek_Inhalen getInhalen() {
        return inhalen;
    }

    public void setInhalen(Verkeerstechniek_Inhalen inhalen) {
        this.inhalen = inhalen;
    }

    public Verkeerstechniek_Volgafstand getVolgafstand() {
        return volgafstand;
    }

    public void setVolgafstand(Verkeerstechniek_Volgafstand volgafstand) {
        this.volgafstand = volgafstand;
    }

    public Verkeerstechniek_LinksAfslaan getLinksAfslaan() {
        return linksAfslaan;
    }

    public void setLinksAfslaan(Verkeerstechniek_LinksAfslaan linksAfslaan) {
        this.linksAfslaan = linksAfslaan;
    }

    public Verkeerstechniek_RechtsAfslaan getRechtsAfslaan() {
        return rechtsAfslaan;
    }

    public void setRechtsAfslaan(Verkeerstechniek_RechtsAfslaan rechtsAfslaan) {
        this.rechtsAfslaan = rechtsAfslaan;
    }

    public long getIdVerkeerstechniek() {
        return idVerkeerstechniek;
    }

    public void setIdVerkeerstechniek(long idVerkeerstechniek) {
        this.idVerkeerstechniek = idVerkeerstechniek;
    }
    
}