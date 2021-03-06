package Models.Rijtechniek;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

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
    private Rijtechniek_VertrekkenHelling vertrekkenHelling;
    @Embedded
    private Rijtechniek_Zithouding zithouding;
    @Embedded
    private Rijtechniek_Stuuroefening stuuroefening;
    @Embedded
    private Rijtechniek_Achteruitrijden achteruitrijden;
    @Embedded
    private Rijtechniek_Garage garage;

    public Rijtechniek_Garage getGarage() {
        return garage;
    }

    public void setGarage(Rijtechniek_Garage garage) {
        this.garage = garage;
    }

    public Rijtechniek_Achteruitrijden getAchteruitrijden() {
        return achteruitrijden;
    }

    public void setAchteruitrijden(Rijtechniek_Achteruitrijden achteruitrijden) {
        this.achteruitrijden = achteruitrijden;
    }

    public Rijtechniek_Stuuroefening getStuuroefening() {
        return stuuroefening;
    }

    public void setStuuroefening(Rijtechniek_Stuuroefening stuuroefening) {
        this.stuuroefening = stuuroefening;
    }

    //Dit geeft een autonummering als primaire sleutel in de tabel Rijtechniek
    @Id
    @GeneratedValue
    private long id;

    public Rijtechniek_Balanceren getBalanceren() {
        return balanceren;
    }

    public void setBalanceren(Rijtechniek_Balanceren balanceren) {
        this.balanceren = balanceren;
    }

    public Rijtechniek_Keren getKeren() {
        return keren;
    }

    public void setKeren(Rijtechniek_Keren keren) {
        this.keren = keren;
    }

    public Rijtechniek_Kijktechniek getKijkTechniek() {
        return kijkTechniek;
    }

    public void setKijkTechniek(Rijtechniek_Kijktechniek kijkTechniek) {
        this.kijkTechniek = kijkTechniek;
    }

    public Rijtechniek_Koppeling getKoppeling() {
        return koppeling;
    }

    public void setKoppeling(Rijtechniek_Koppeling koppeling) {
        this.koppeling = koppeling;
    }

    public Rijtechniek_Parkeren getParkeren() {
        return parkeren;
    }

    public void setParkeren(Rijtechniek_Parkeren parkeren) {
        this.parkeren = parkeren;
    }

    public Rijtechniek_Remtechniek getRemTechniek() {
        return remTechniek;
    }

    public void setRemTechniek(Rijtechniek_Remtechniek remTechniek) {
        this.remTechniek = remTechniek;
    }

    public Rijtechniek_Schakeltechniek getSchakelTechniek() {
        return schakelTechniek;
    }

    public void setSchakelTechniek(Rijtechniek_Schakeltechniek schakelTechniek) {
        this.schakelTechniek = schakelTechniek;
    }

    public Rijtechniek_Stuurtechniek getStuurTechniek() {
        return stuurTechniek;
    }

    public void setStuurTechniek(Rijtechniek_Stuurtechniek stuurTechniek) {
        this.stuurTechniek = stuurTechniek;
    }

    public Rijtechniek_VertrekkenHelling getVertrekkenHelling() {
        return vertrekkenHelling;
    }

    public void setVertrekkenHelling(Rijtechniek_VertrekkenHelling vertrekkenHelling) {
        this.vertrekkenHelling = vertrekkenHelling;
    }

    public Rijtechniek_Zithouding getZithouding() {
        return zithouding;
    }

    public void setZithouding(Rijtechniek_Zithouding zithouding) {
        this.zithouding = zithouding;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
