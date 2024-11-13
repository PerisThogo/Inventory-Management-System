package models;

import java.util.List;

public class Order {
    private int id;
    private List<Product> products;
    private String status;
    private String date;

    public Order(int id, List<Product> products, String status, String date) {
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

    public String getDate() {
        return date;
    }
}
