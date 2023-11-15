package vn.edu.iuh.fit.week02_www_lab.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "employee")
@NamedQueries({
        @NamedQuery(name = "Employee.getListEmployee", query = "select e from Employee e where e.status= ?1"),
        @NamedQuery(name = "Employee.getEmployeeFindById", query = "select e from Employee e where e.id=:id"),
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
    @Column(name = "full_name", columnDefinition = "varchar(150)")
    private String fullname;
    @Column(name = "dob", columnDefinition = "Datetime(6)")
    private LocalDate dob;
    @Column(name = "email", columnDefinition = "varchar(150)")
    private String email;
    @Column(name = "address", columnDefinition = "varchar(250)")
    private String address;
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Column(name = "status", columnDefinition = "int(11)")
    private EmployeeStatus status;
    @OneToMany(mappedBy = "employee")
    private List<Orders> orders;

    public Employee() {
    }
    public Employee(String fullname, LocalDate dob, String email, String address, String phone, EmployeeStatus status) {

        this.fullname = fullname;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public Employee(long id, String fullname, LocalDate dob, String email, String address, String phone, EmployeeStatus status, List<Orders> orders) {
        this.id = id;
        this.fullname = fullname;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.orders = orders;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = LocalDate.from(dob);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }
}
