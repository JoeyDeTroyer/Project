package DAO;

import Models.Rijtechniek.Rijtechniek;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RijtechniekDAO {

    public List<Rijtechniek> findAllRijtechnieken() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            List<Rijtechniek> results = em.createNamedQuery("Rijtechniek.findAll", Rijtechniek.class).getResultList();
            return results;
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }

    public void addRijtechniek(Rijtechniek r) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }

    public void updateRijtechniek(Rijtechniek r) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.merge(r);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }

    private RijtechniekDAO() {
    }

    private static final RijtechniekDAO instance = new RijtechniekDAO();

    public static RijtechniekDAO getInstance() {
        return instance;
    }
}
