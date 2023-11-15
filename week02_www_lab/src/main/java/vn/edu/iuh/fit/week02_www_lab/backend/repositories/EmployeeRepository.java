package vn.edu.iuh.fit.week02_www_lab.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Customer;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<Employee> getAllEmp() {
        return em.createNamedQuery("Employee.getListEmployee", Employee.class)
                .setParameter(1, EmployeeStatus.ACTIVE)
                .getResultList();
    }

    public boolean updateEmployee(Employee employee) {
        try {
            trans.begin();
            em.merge(employee);
            trans.commit();
            return  true;
        } catch (Exception ex) {
            trans.rollback();
            logger.error(ex.getMessage());
        }
        return false;
    }

    public Optional<Employee> findbyId(long id) {
        TypedQuery<Employee> query = em.createNamedQuery("Employee.getEmployeeFindById", Employee.class)
                .setParameter("id", id);
        Employee emp = query.getSingleResult();
        return emp == null ? Optional.empty() : Optional.of(emp);
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