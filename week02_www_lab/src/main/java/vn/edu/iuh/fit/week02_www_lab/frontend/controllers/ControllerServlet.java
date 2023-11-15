package vn.edu.iuh.fit.week02_www_lab.frontend.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.internal.build.AllowSysOut;
import vn.edu.iuh.fit.week02_www_lab.frontend.models.CustomerModel;
import vn.edu.iuh.fit.week02_www_lab.frontend.models.EmployeeModel;

import java.io.IOException;

@WebServlet(urlPatterns = "/ControlServlet")
public class ControllerServlet extends HttpServlet {
    EmployeeModel employeeModel = new EmployeeModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if(actionObject != null) {
                String action = actionObject.toString();
                switch (action) {
                    case "emp_list":
                        resp.sendRedirect("listEmployee.jsp");
                    case "cust_list":
                        resp.sendRedirect("listCustomer.jsp");
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
//                        EmployeeModel employeeModel = new EmployeeModel();
                        employeeModel.insertEmployee(req,resp);
                        resp.sendRedirect("listEmployee.jsp");

                    case "insertCust":
                        CustomerModel customerModel = new CustomerModel();
                        customerModel.insertCust(req,resp);
                        resp.sendRedirect("listCustomer.jsp");
                    case "update_employee":
//                        EmployeeModel employeeModel = new EmployeeModel();
                        employeeModel.updateEmployee(req,resp);
                        resp.sendRedirect("listEmployee.jsp");
                }
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
