package vn.edu.iuh.fit.week02_www_lab.frontend.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.week02_www_lab.frontend.models.EmployeeModel;

import java.io.IOException;

@WebServlet(urlPatterns = "/ControlServlet")
public class ControllerServlet extends HttpServlet {
    @Inject
    EmployeeModel employeeModel;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if(actionObject != null){
                String action = actionObject.toString();
                switch (action) {
                    case "add_employee":
                        employeeModel.insertEmployee(req,resp);
                        resp.sendRedirect("index.jsp");
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
