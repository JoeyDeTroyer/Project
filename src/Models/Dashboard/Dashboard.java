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
    private Dashboard_TankenGpsNoodstop tankenGpsNoodstop;
    @Embedded 
    private Dashboard_Controles controles;
    @Embedded
    private Dashboard_TypesOpenbareWeg openbareWegKeuzes;

    
    @Embedded
    private Dashboard_ProgressBar progress;
//    @Embedded
//    private Dashboard_Opmerkingen opmerkingen;
    
    @Id @GeneratedValue
    private long id;

    public Dashboard_TankenGpsNoodstop getTankenGpsNoodstop() {
        return tankenGpsNoodstop;
    }

    public void setTankenGpsNoodstop(Dashboard_TankenGpsNoodstop tankenGpsNoodstop) {
        this.tankenGpsNoodstop = tankenGpsNoodstop;
    }

    public Dashboard_Controles getControles() {
        return controles;
    }

    public void setControles(Dashboard_Controles controles) {
        this.controles = controles;
    }

    public Dashboard_TypesOpenbareWeg getOpenbareWegKeuzes() {
        return openbareWegKeuzes;
    }

    public void setOpenbareWegKeuzes(Dashboard_TypesOpenbareWeg openbareWegKeuzes) {
        this.openbareWegKeuzes = openbareWegKeuzes;
    }
    

    public Dashboard_ProgressBar getProgress() {
        return progress;
    }

    public void setProgress(Dashboard_ProgressBar progress) {
        this.progress = progress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
   
}
