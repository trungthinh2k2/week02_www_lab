package vn.edu.iuh.fit.week02_www_lab.backend.repositories;

import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AddEmployee {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        Employee employee = new Employee("Trung Thịnh", LocalDate.now(),"trungthinh@gmail.com", "Quảng Ngãi", "0965355011", EmployeeStatus.ACTIVE);
        repository.insertEmployee(employee);
    }
}
