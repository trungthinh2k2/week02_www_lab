package vn.edu.iuh.fit.week02_www_lab.backend.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;
import vn.edu.iuh.fit.week02_www_lab.backend.repositories.EmployeeRepository;

@ApplicationScoped
public class EmployeeService {
    @Inject
    private EmployeeRepository employeeRepository;
    @Inject
    public EmployeeService() {
        this.employeeRepository = employeeRepository;
    }
    public void insertEmployee(Employee employee) {
        employeeRepository.insertEmployee(employee);
    }
}
