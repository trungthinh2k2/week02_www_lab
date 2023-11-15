package vn.edu.iuh.fit.week02_www_lab.frontend.models;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;
import vn.edu.iuh.fit.week02_www_lab.backend.services.EmployeeService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class EmployeeModel {
    private final EmployeeService employeeService = new EmployeeService();

    public void insertEmployee(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String empName = req.getParameter("full_name");
        LocalDate empDob = LocalDate.parse(req.getParameter("dob"));
        String empPhone = req.getParameter("phone");
        String empEmail = req.getParameter("email");
        String empAddress = req.getParameter("address");

        Employee emp  = new Employee(empName,empDob,empEmail,empAddress,empPhone, EmployeeStatus.ACTIVE);
        employeeService.insertEmployee(emp);
    }
    public List<Employee> getEmployeeList(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        return employeeService.getListEmployee();
    }
    public void updateEmployee(HttpServletRequest req, HttpServletResponse resp){
        String empName = req.getParameter("full_name");
        LocalDate empDob = LocalDate.parse(req.getParameter("dob"));
        String empPhone = req.getParameter("phone");
        String empEmail = req.getParameter("email");
        String empAddress = req.getParameter("address");

        Employee employee  = new Employee(empName,empDob,empEmail,empAddress,empPhone, EmployeeStatus.ACTIVE);
        employeeService.updateEmployee(employee);
    }
}
