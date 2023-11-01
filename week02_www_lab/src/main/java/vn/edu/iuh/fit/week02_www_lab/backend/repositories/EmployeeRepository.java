package vn.edu.iuh.fit.week02_www_lab.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private EntityManager em;
    private EntityTransaction trans;
    private final Logger logger =
            LoggerFactory.getLogger(this.getClass().getName());
    public EmployeeRepository() {
        em = Persistence
                .createEntityManagerFactory("week02_www_lab")
                .createEntityManager();
        trans = em.getTransaction();
    }
    public void insertEmployee(Employee employee) {
        try {
            trans.begin();
            em.persist(employee);
            trans.commit();
        } catch (Exception ex) {
            trans.rollback();
            logger.error(ex.getMessage());
        }
    }
    public List<Employee> getListEmployee() {
        try {
            return em.createNamedQuery("Employee.getListEmployee", Employee.class).getResultList();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        EntityManager em = Persistence
                .createEntityManagerFactory("week02_www_lab")
                .createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try {
            trans.begin();
            trans.commit();
        } catch (Exception ex) {
            trans.rollback();
            ex.printStackTrace();

        }
    }
}