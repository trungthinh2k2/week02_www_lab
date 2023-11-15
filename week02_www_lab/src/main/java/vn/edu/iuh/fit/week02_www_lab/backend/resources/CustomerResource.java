package vn.edu.iuh.fit.week02_www_lab.backend.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Customer;
import vn.edu.iuh.fit.week02_www_lab.backend.services.CustomerService;

import java.util.List;

@Path("/customers")
public class CustomerResource {
    private final CustomerService customerServices = new CustomerService();
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Customer customer) {
        customerServices.insertCust(customer);
        return Response.ok(customer).build();
    }

    @GET
    @Produces("application/json")
    public Response getAll(){
        List<Customer> lst = customerServices.getAll();
        return Response.ok(lst).build();
    }
}
