package vn.edu.iuh.fit.week02_www_lab.backend.models;

import jakarta.persistence.*;
import org.joda.time.LocalDateTime;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "price_date_time", columnDefinition = "Datetime(6)")
    private LocalDateTime price_date_time;
    @Column(name = "price", columnDefinition = "Double")
    private double price;
    @Column(name = "note", columnDefinition = "varchar(255)")
    private String note;

    public ProductPrice() {
    }

    public ProductPrice(Product product, LocalDateTime price_date_time, double price, String note) {
        this.product = product;
        this.price_date_time = price_date_time;
        this.price = price;
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getPrice_date_time() {
        return price_date_time;
    }

    public void setPrice_date_time(LocalDateTime price_date_time) {
        this.price_date_time = price_date_time;
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
        return "ProductPrice{" +
                "product=" + product +
                ", price_date_time=" + price_date_time +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}

