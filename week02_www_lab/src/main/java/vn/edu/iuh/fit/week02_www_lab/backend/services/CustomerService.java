package vn.edu.iuh.fit.week02_www_lab.backend.services;

import vn.edu.iuh.fit.week02_www_lab.backend.models.Customer;
import vn.edu.iuh.fit.week02_www_lab.backend.repositories.CustomerRepository;

import java.util.List;

public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService() {
        repository = new CustomerRepository();
    }

    public void insertCust(Customer customer) {
        repository.insertCust(customer);
    }

    public List<Customer> getAll() {
        return repository.getAllCust();
    }
}
