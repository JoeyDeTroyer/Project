package Models;

import Models.Rijtechniek.Rijtechniek;
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
    @Id @GeneratedValue
    private int evaluatieId;
    
    @ManyToOne
    private Leerling leerling;
    
    @OneToOne
    private Rijtechniek rijtechniek;
    
    private int volgNummer;

    public int getEvaluatieId() {
        return evaluatieId;
    }

    public void setEvaluatieId(int evaluatieId) {
        this.evaluatieId = evaluatieId;
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
    
    
    
}
