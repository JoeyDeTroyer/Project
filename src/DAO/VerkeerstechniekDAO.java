package DAO;
import Models.Rijtechniek.Rijtechniek;
import Models.Verkeerstechniek.Verkeerstechniek;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VerkeerstechniekDAO {
    
    public List<Verkeerstechniek> findAllVerkeerstechnieken() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            List<Verkeerstechniek> results = em.createNamedQuery("Verkeerstechniek.findAll", Verkeerstechniek.class).getResultList();
            return results;
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        } 
    }
    
    public void addVerkeerstechniek(Verkeerstechniek v)  {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(v);        
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }
    
    public void updateVerkeerstechniek(Verkeerstechniek v){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.merge(v);        
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }
    
    private VerkeerstechniekDAO() {}
    
    private static final VerkeerstechniekDAO instance = new VerkeerstechniekDAO();

    public static VerkeerstechniekDAO getInstance() {
        return instance;
    }    
}
