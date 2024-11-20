package src.models;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private List<Product> products;
    private String status; // Pending, Completed, or Cancelled
    private Date date;

    public Order(int id, List<Product> products, String status, Date date) {
        this.id = id;
        this.products = products;
        this.status = status;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", status='" + status + "', date=" + date + "}";
    }
}
