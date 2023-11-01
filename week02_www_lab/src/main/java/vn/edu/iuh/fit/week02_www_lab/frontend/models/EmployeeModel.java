package vn.edu.iuh.fit.week02_www_lab.frontend.models;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.joda.time.LocalDateTime;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;
import vn.edu.iuh.fit.week02_www_lab.backend.services.EmployeeService;

import java.io.IOException;
import java.util.List;

public class EmployeeModel {
    @Inject
    private EmployeeService employeeService;
    @Inject
    public EmployeeModel(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void insertEmployee(HttpServletRequest req, HttpServletResponse resp) {
        String empName = req.getParameter("name");
        LocalDateTime empDob = LocalDateTime.parse(req.getParameter("dob"));
        String empPhone = req.getParameter("phone");
        String empEmail = req.getParameter("email");
        String empAddress = req.getParameter("address");

        Employee emp  = new Employee(empName,empDob,empEmail,empAddress,empPhone, EmployeeStatus.ACTIVE);
        employeeService.insertEmployee(emp);
    }
    public void getEmployeeList(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        List<Employee> empList = employeeService.getListEmployee();
        req.setAttribute("empList", empList);
        req.getRequestDispatcher("employee.jsp").forward(req, resp);
    }
}
