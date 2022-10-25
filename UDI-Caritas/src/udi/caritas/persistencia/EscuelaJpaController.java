
package udi.caritas.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import udi.caritas.logica.Escuela;
import udi.caritas.persistencia.exceptions.NonexistentEntityException;


public class EscuelaJpaController implements Serializable {

    public EscuelaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
    private EntityManagerFactory emf = null;

        public EscuelaJpaController() {
        emf = Persistence.createEntityManagerFactory("UDI-CaritasPU");
    }
    
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Escuela escuela) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(escuela);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Escuela escuela) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            escuela = em.merge(escuela);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = escuela.getId_escuela();
                if (findEscuela(id) == null) {
                    throw new NonexistentEntityException("The escuela with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Escuela escuela;
            try {
                escuela = em.getReference(Escuela.class, id);
                escuela.getId_escuela();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The escuela with id " + id + " no longer exists.", enfe);
            }
            em.remove(escuela);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Escuela> findEscuelaEntities() {
        return findEscuelaEntities(true, -1, -1);
    }

    public List<Escuela> findEscuelaEntities(int maxResults, int firstResult) {
        return findEscuelaEntities(false, maxResults, firstResult);
    }

    private List<Escuela> findEscuelaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Escuela.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Escuela findEscuela(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Escuela.class, id);
        } finally {
            em.close();
        }
    }

    public int getEscuelaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Escuela> rt = cq.from(Escuela.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
