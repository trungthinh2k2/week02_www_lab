package vn.edu.iuh.fit.week02_www_lab.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.ProductStatus;

import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(name = "name", columnDefinition = "varchar(150)")
    private String name;
    @Column(name = "unit", columnDefinition = "varchar(25)")
    private String unit;
    @Enumerated
    @Column(name = "status", columnDefinition = "int(11)")
    private ProductStatus productStatus;
    @Column(name = "manufacturer_name", columnDefinition = "varchar(100)")
    private String manufacturer;
    @Column(name = "description", columnDefinition = "varchar(250)")
    private String description;
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;
    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImages;
    @OneToMany(mappedBy = "product")
    private List<ProductPrice> productPrices;

    public Product() {
    }

    public Product(long id, String name, String unit, ProductStatus productStatus, String manufacturer, String description) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.productStatus = productStatus;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }

    public List<ProductPrice> getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(List<ProductPrice> productPrices) {
        this.productPrices = productPrices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", productStatus=" + productStatus +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
