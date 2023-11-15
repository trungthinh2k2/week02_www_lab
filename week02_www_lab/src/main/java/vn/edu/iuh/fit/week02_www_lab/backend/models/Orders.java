package vn.edu.iuh.fit.week02_www_lab.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;
    @Column(name = "order_date", columnDefinition = "Datetime(6)")
    private LocalDate orderDate;
    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetails;

    public Orders() {
    }

    public Orders(long id, LocalDate orderDate, Customer customer, Employee employee) {
        this.id = id;
        this.orderDate = orderDate;
        this.customer = customer;
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", customer=" + customer +
                ", employee=" + employee +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
