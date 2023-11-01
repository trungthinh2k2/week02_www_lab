package vn.edu.iuh.fit.week02_www_lab.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderDetailsId implements Serializable {
    @Column(name = "product_id", nullable = false)
    private long productId;
    @Column(name = "order_id", nullable = false)
    private long orderId;

    public OrderDetailsId() {
    }

    public OrderDetailsId(long productId, long orderId) {
        this.productId = productId;
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
    @Override
    public String toString() {
        return "OrderDetailsId{" +
                "productId=" + productId +
                ", orderId=" + orderId +
                '}';
    }
}
