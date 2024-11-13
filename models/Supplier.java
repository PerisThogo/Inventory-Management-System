package models;

import java.util.List;

public class Supplier {
    private int id;
    private String name;
    private int reliability; // 1-10 rating
    private List<Product> products;

    public Supplier(int id, String name, int reliability, List<Product> products) {
        this.id = id;
        this.name = name;
        this.reliability = reliability;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getReliability() {
        return reliability;
    }

    public List<Product> getProducts() {
        return products;
    }
}
