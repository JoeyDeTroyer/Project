package Models.Dashboard;

import javax.persistence.Embedded;
import javax.persistence.Entity;
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
    private Dashboard_TypesOpenbareWeg openbareWeg;
    @Embedded
    private Dashboard_ProgressBar progress;
    @Embedded
    private Dashboard_Opmerkingen opmerkingen;
    
    @Id
    private long id;
   
}
