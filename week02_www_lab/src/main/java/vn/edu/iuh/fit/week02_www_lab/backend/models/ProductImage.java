package vn.edu.iuh.fit.week02_www_lab.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    @Column(name = "alternative", columnDefinition = "varchar(250)")
    private String alternative;
    @Column(name = "path", columnDefinition = "varchar(250)")
    private String path;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductImage() {
    }

    public ProductImage(long id, String alternative, String path, Product product) {
        this.id = id;
        this.alternative = alternative;
        this.path = path;
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "id=" + id +
                ", alternative='" + alternative + '\'' +
                ", path='" + path + '\'' +
                ", product=" + product +
                '}';
    }
}
