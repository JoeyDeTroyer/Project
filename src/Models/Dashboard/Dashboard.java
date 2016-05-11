package Models.Dashboard;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = "Dashboard.findAll", query = "SELECT d FROM Dashboard d")
})
public class Dashboard {

    @Embedded
    private Dashboard_GPS gps;
    @Embedded
    private Dashboard_Noodstop noodstop;
    @Embedded
    private Dashboard_Tanken tanken;
    @Embedded
    private Dashboard_Banden banden;
    @Embedded
    private Dashboard_Schakelaars schakelaars;
    @Embedded
    private Dashboard_Vloeistoffen vloeistoffen;
    @Embedded
    private Dashboard_Autosnelweg autosnelweg;
    @Embedded
    private Dashboard_Rijstroken rijstroken;
    @Embedded
    private Dashboard_Rotonde rotonde;
    @Embedded
    private Dashboard_Stad stad;
    @Embedded
    private Dashboard_ProgressBar progress;
//    @Embedded
//    private Dashboard_Opmerkingen opmerkingen;

    @Id
    @GeneratedValue
    private long id;

    public Dashboard_ProgressBar getProgress() {
        return progress;
    }

    public void setProgress(Dashboard_ProgressBar progress) {
        this.progress = progress;
    }

    public Dashboard_Autosnelweg getAutosnelweg() {
        return autosnelweg;
    }

    public void setAutosnelweg(Dashboard_Autosnelweg autosnelweg) {
        this.autosnelweg = autosnelweg;
    }

    public Dashboard_Rijstroken getRijstroken() {
        return rijstroken;
    }

    public void setRijstroken(Dashboard_Rijstroken rijstroken) {
        this.rijstroken = rijstroken;
    }

    public Dashboard_Rotonde getRotonde() {
        return rotonde;
    }

    public void setRotonde(Dashboard_Rotonde rotonde) {
        this.rotonde = rotonde;
    }

    public Dashboard_Banden getBanden() {
        return banden;
    }

    public void setBanden(Dashboard_Banden banden) {
        this.banden = banden;
    }

    public Dashboard_Schakelaars getSchakelaars() {
        return schakelaars;
    }

    public void setSchakelaars(Dashboard_Schakelaars schakelaars) {
        this.schakelaars = schakelaars;
    }

    public Dashboard_Vloeistoffen getVloeistoffen() {
        return vloeistoffen;
    }

    public void setVloeistoffen(Dashboard_Vloeistoffen vloeistoffen) {
        this.vloeistoffen = vloeistoffen;
    }

    public Dashboard_Stad getStad() {
        return stad;
    }

    public void setStad(Dashboard_Stad stad) {
        this.stad = stad;
    }

    public Dashboard_GPS getGps() {
        return gps;
    }

    public void setGps(Dashboard_GPS gps) {
        this.gps = gps;
    }

    public Dashboard_Noodstop getNoodstop() {
        return noodstop;
    }

    public void setNoodstop(Dashboard_Noodstop noodstop) {
        this.noodstop = noodstop;
    }

    public Dashboard_Tanken getTanken() {
        return tanken;
    }

    public void setTanken(Dashboard_Tanken tanken) {
        this.tanken = tanken;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
