package vn.edu.iuh.fit.week02_www_lab.backend.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;
import vn.edu.iuh.fit.week02_www_lab.backend.services.EmployeeService;

public class EmployeeResource {
    private EmployeeService employeeService;

    @Inject
    public EmployeeResource() {
        EmployeeService employeeService = new EmployeeService();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Employee employee) {
        employeeService.insertEmployee(employee);
        return Response.ok(employee).build();
    }
}
