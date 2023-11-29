package vn.edu.iuh.fit.week02_www_lab.backend.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;
import vn.edu.iuh.fit.week02_www_lab.backend.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

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
    public boolean updateEmployee(Employee employee) {
        return  employeeRepository.updateEmployee(employee);
    }
    public Optional<Employee> findById(long id) {
        return employeeRepository.findbyId(id);
    }

    public boolean delete(long id) {
        return employeeRepository.delete(id);
    }
    public void setStatus(Employee employee, EmployeeStatus employeeStatus) {
        employeeRepository.setStatus(employee, EmployeeStatus.TERMIATED);
    }
}
