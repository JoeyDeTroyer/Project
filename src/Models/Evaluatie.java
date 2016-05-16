package Models;

import Models.Dashboard.Dashboard;
import Models.Rijtechniek.Rijtechniek;
import Models.Verkeerstechniek.Verkeerstechniek;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
    @NamedQuery(name = "Evaluatie.findAllByLeerling", query = "SELECT e FROM Evaluatie e WHERE e.leerling = :leerling AND e.volgNummer = :volgnummer")
})
public class Evaluatie {

    @Id
    @GeneratedValue
    private int evaluatieId;
    //Relatie met Leerling leggen
    @ManyToOne
    private Leerling leerling;
    //Relatie met Rijtechniek
    @OneToOne
    private Rijtechniek rijtechniek;
    //Relatie met Verkeerstechniek
    @OneToOne
    private Verkeerstechniek verkeerstechniek;
    @OneToOne
    private Dashboard dashboard;

    private int volgNummer;

    private Double progress;
    private String opmerkingen;

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public int getEvaluatieId() {
        return evaluatieId;
    }

    public void setEvaluatieId(int evaluatieId) {
        this.evaluatieId = evaluatieId;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public Leerling getLeerling() {
        return leerling;
    }

    public void setLeerling(Leerling leerling) {
        this.leerling = leerling;
    }

    public int getVolgNummer() {
        return volgNummer;
    }

    public void setVolgNummer(int volgNummer) {
        this.volgNummer = volgNummer;
    }

    public Rijtechniek getRijtechniek() {
        return rijtechniek;
    }

    public void setRijtechniek(Rijtechniek rijtechniek) {
        this.rijtechniek = rijtechniek;
    }

    public Verkeerstechniek getVerkeerstechniek() {
        return verkeerstechniek;
    }

    public void setVerkeerstechniek(Verkeerstechniek verkeerstechniek) {
        this.verkeerstechniek = verkeerstechniek;
    }

    public String getOpmerkingen() {
        return opmerkingen;
    }

    public void setOpmerkingen(String opmerkingen) {
        this.opmerkingen = opmerkingen;
    }

}
