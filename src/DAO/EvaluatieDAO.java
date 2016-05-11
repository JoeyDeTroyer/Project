package DAO;

import Models.Evaluatie;
import Models.Leerling;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EvaluatieDAO {

    public Evaluatie findAllByLeerling(Leerling l, int volgNummer) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            TypedQuery<Evaluatie> q = em.createNamedQuery("Evaluatie.findAllByLeerling", Evaluatie.class);
            q.setParameter("leerling", l);
            q.setParameter("volgnummer", volgNummer);
            return q.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }

    public void addEvaluatie(Evaluatie e) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            emf.close();
        }
    }

    private static final EvaluatieDAO instance = new EvaluatieDAO();

    public static EvaluatieDAO getInstance() {
        return instance;
    }
}
