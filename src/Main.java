package src;

import src.models.*;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Sample products
        Product product1 = new Product(1, "Laptop", 10, "Aisle 1");
        Product product2 = new Product(2, "Smartphone", 5, "Aisle 2");
        Product product3 = new Product(3, "Headphones", 2, "Aisle 3");

        // Sample stock
        Stock stock1 = new Stock(product1.getQuantity(), 5, 3);
        Stock stock2 = new Stock(product2.getQuantity(), 5, 2);
        Stock stock3 = new Stock(product3.getQuantity(), 3, 2);

        // Sample supplier
        Supplier supplier1 = new Supplier(1, "Tech Supplies Inc.", 4.8, Arrays.asList(product1, product2, product3));

        // Sample order
        Order order1 = new Order(1, Arrays.asList(product1, product2), "Pending", new Date());

        // Display product details
        System.out.println("Products:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        // Display stock details
        System.out.println("\nStock Details:");
        System.out.println("Stock 1 needs reorder? " + stock1.needsReorder());
        System.out.println("Stock 2 needs reorder? " + stock2.needsReorder());
        System.out.println("Stock 3 needs reorder? " + stock3.needsReorder());

        // Display supplier details
        System.out.println("\nSupplier Details:");
        System.out.println(supplier1);

        // Display order details
        System.out.println("\nOrder Details:");
        System.out.println(order1);

        // Simulate stock movement
        System.out.println("\nSimulating Stock Movement:");
        product1.setQuantity(product1.getQuantity() - 2); // Sold 2 laptops
        stock1.setLevel(product1.getQuantity());
        System.out.println("Updated stock for " + product1.getName() + ": " + stock1.getLevel());

        // Generate low stock alert
        System.out.println("\nLow Stock Alerts:");
        if (stock3.needsReorder()) {
            System.out.println(product3.getName() + " is running low on stock. Reorder needed!");
        }
    }
}
