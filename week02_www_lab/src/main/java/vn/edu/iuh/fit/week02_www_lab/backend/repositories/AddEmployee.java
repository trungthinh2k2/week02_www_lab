package vn.edu.iuh.fit.week02_www_lab.backend.repositories;

import org.joda.time.LocalDateTime;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;

public class AddEmployee {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        Employee employee = new Employee("Trung Thịnh", new LocalDateTime(2002,6,8,6,30),"trungthinh@gmail.com", "Quảng Ngãi", "0965355011", EmployeeStatus.ACTIVE);
        repository.insertEmployee(employee);

    }
}
