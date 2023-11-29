package vn.edu.iuh.fit.week02_www_lab.frontend.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.internal.build.AllowSysOut;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;
import vn.edu.iuh.fit.week02_www_lab.backend.services.CustomerService;
import vn.edu.iuh.fit.week02_www_lab.backend.services.EmployeeService;
import vn.edu.iuh.fit.week02_www_lab.frontend.models.CustomerModel;
import vn.edu.iuh.fit.week02_www_lab.frontend.models.EmployeeModel;

import java.io.IOException;

@WebServlet(urlPatterns = "/ControlServlet")
public class ControllerServlet extends HttpServlet {
    EmployeeModel employeeModel = new EmployeeModel();
    CustomerModel customerModel = new CustomerModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if(actionObject != null) {
                String action = actionObject.toString();
                switch (action) {
                    case "emp_list":
                        resp.sendRedirect("listEmployee.jsp");
                        break;
                    case "cust_list":
                        resp.sendRedirect("listCustomer.jsp");
                        break;
                    case  "delete-customer":
                        CustomerService customerService = new CustomerService();
                        long idDelete = Long.parseLong(req.getParameter("customerIdDelete"));
                        System.out.println(idDelete);
                        customerService.deleteCustomer(idDelete);
                        resp.sendRedirect("listCustomer.jsp");
                        break;
                    case  "delete-employee":
                        EmployeeService employeeService = new EmployeeService();
                        long idDelete1 = Long.parseLong(req.getParameter("employeeIdDelete"));
                        System.out.println(idDelete1);
                        employeeService.delete(idDelete1);
                        resp.sendRedirect("listEmployee.jsp");
                        break;
                }
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if(actionObject != null){
                String action = actionObject.toString();
                switch (action) {
                    case "insert_employee":
                        employeeModel.insertEmployee(req,resp);
                        resp.sendRedirect("listEmployee.jsp");
                        break;
                    case "insert_customer":
                        customerModel.insertCust(req,resp);
                        resp.sendRedirect("listCustomer.jsp");
                        break;

                }
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
