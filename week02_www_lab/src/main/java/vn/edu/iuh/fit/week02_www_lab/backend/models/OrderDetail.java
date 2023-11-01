package vn.edu.iuh.fit.week02_www_lab.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @EmbeddedId
    private  OrderDetailsId id;

    @MapsId("orderId")
    @ManyToOne()
    @JoinColumn(name = "order_id")
    private Orders orders;

    @MapsId("productId")
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "quantity", columnDefinition = "Double")
    private double quantity;
    @Column(name = "price", columnDefinition = "Double")
    private double price;
    @Column(name = "note", columnDefinition = "varchar(255)")
    private String note;

    public OrderDetail() {
    }

    public OrderDetail(Orders orders, Product product, double quantity, double price, String note) {
        this.orders = orders;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.note = note;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orders=" + orders +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}

