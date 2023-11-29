package vn.edu.iuh.fit.week02_www_lab.frontend.models;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.week02_www_lab.backend.models.Customer;
import vn.edu.iuh.fit.week02_www_lab.backend.services.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerModel {
    private final CustomerService services = new CustomerService();

    public void insertCust(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String name = req.getParameter("cust_name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");

        Customer customer = new Customer(name, email, address, phone);
        services.insertCust(customer);
    }

    public Optional<Customer> getFindById(long id){
        return services.findById(id);
    }

    public List<Customer> getAllCustomer() {
        return  services.getAll();
    }

}
