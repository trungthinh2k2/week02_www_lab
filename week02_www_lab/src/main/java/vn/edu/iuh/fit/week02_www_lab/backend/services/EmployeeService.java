package vn.edu.iuh.fit.week02_www_lab.backend.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;
import vn.edu.iuh.fit.week02_www_lab.backend.repositories.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService() {
        employeeRepository = new EmployeeRepository();
    }
    public void insertEmployee(Employee employee) {
        employeeRepository.insertEmployee(employee);
    }
    public List<Employee> getListEmployee() {
        return employeeRepository.getAllEmp();
    }
    public void updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee);
    }
}
