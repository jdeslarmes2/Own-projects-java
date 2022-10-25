
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
import udi.caritas.logica.Pariente;
import udi.caritas.persistencia.exceptions.NonexistentEntityException;


public class ParientesJpaController implements Serializable {

    public ParientesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
    private EntityManagerFactory emf = null;
    
    public ParientesJpaController(){
    emf = Persistence.createEntityManagerFactory("UDI-CaritasPU");
    }
    
    
    

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pariente parientes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(parientes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pariente parientes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            parientes = em.merge(parientes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = parientes.getId_Familiar();
                if (findParientes(id) == null) {
                    throw new NonexistentEntityException("The parientes with id " + id + " no longer exists.");
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
            Pariente parientes;
            try {
                parientes = em.getReference(Pariente.class, id);
                parientes.getId_Familiar();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The parientes with id " + id + " no longer exists.", enfe);
            }
            em.remove(parientes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pariente> findParientesEntities() {
        return findParientesEntities(true, -1, -1);
    }

    public List<Pariente> findParientesEntities(int maxResults, int firstResult) {
        return findParientesEntities(false, maxResults, firstResult);
    }

    private List<Pariente> findParientesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pariente.class));
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

    public Pariente findParientes(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pariente.class, id);
        } finally {
            em.close();
        }
    }

    public int getParientesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pariente> rt = cq.from(Pariente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
