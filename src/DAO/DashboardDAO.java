package DAO;

import Models.Dashboard.Dashboard;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DashboardDAO {
    
    public List<Dashboard> findAllDashboards() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            List<Dashboard> results = em.createNamedQuery("Dashboard.findAll", Dashboard.class).getResultList();
            return results;
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
        
        
    }
    
    private DashboardDAO() {
            
        }
    
    private static final DashboardDAO instance = new DashboardDAO();

    public static DashboardDAO getInstance() {
        return instance;
    }
    
    
}
