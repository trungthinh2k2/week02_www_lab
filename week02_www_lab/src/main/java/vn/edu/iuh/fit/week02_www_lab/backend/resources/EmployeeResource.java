package vn.edu.iuh.fit.week02_www_lab.backend.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Customer;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Employee;
import vn.edu.iuh.fit.week02_www_lab.backend.services.EmployeeService;

import java.util.List;

@Path("/employee")
public class EmployeeResource {
    private final EmployeeService employeeService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public EmployeeResource() {
        employeeService = new EmployeeService();
    }

    @GET
    @Produces("application/json")
    public Response getAll() {
        //paging if possible
        List<Employee> lst = employeeService.getListEmployee();
        return Response.ok(lst).build();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Employee employee) {
        employeeService.insertEmployee(employee);
        return Response.ok(employee).build();
    }
    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    public Response update(Employee employee) {
        employeeService.updateEmployee(employee);
        return Response.ok(employee).build();
    }
}
