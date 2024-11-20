package src.models;

import java.util.List;

public class Supplier {
    private int id;
    private String name;
    private double reliability; // Correct type: double
    private List<Product> products;

    public Supplier(int id, String name, double reliability, List<Product> products) {
        this.id = id;
        this.name = name;
        this.reliability = reliability; // Correctly assign the double value
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getReliability() {
        return reliability;
    }

    public void setReliability(double reliability) {
        this.reliability = reliability;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Supplier{id=" + id + ", name='" + name + "', reliability=" + reliability + "}";
    }
}
