package DAO;

import Models.Leerling;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LeerlingDAO {

    public List<Leerling> findAllLeerlingen() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            List<Leerling> results = em.createNamedQuery("Leerling.findAll", Leerling.class).getResultList();
            return results;
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }

    public void addLeerling(Leerling l) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(l);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }

    public void verwijderLeerling(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            Leerling l = em.getReference(Leerling.class, id);
            l.getInschrijvingsNr();
            em.remove(l);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }

    private LeerlingDAO() {
    }

    private static final LeerlingDAO instance = new LeerlingDAO();

    public static LeerlingDAO getInstance() {
        return instance;
    }
}
