package vn.edu.iuh.fit.week02_www_lab.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Customer;

import java.util.List;

public class CustomerRepository {
    private EntityManager em;
    private EntityTransaction trans;

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public CustomerRepository() {
        em = Persistence
                .createEntityManagerFactory("week02_www_lab")
                .createEntityManager();
        trans = em.getTransaction();
    }

    public void insertCust(Customer customer) {
        try {
            trans.begin();
            em.persist(customer);
            trans.commit();
        } catch (Exception ex) {
            trans.rollback();
            logger.error(ex.getMessage());
        }
    }

    public List<Customer> getAllCust() {
        return em.createNamedQuery("Customer.getListCustomer", Customer.class).getResultList();
    }
}
