package services;

import models.*;
import java.util.*;

public class InventoryManagementService {

    private List<Product> productList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();
    private List<Supplier> supplierList = new ArrayList<>();

    // Method to add a product to inventory
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orderList.add(order);
        for (Product product : order.getProducts()) {
            updateStockLevel(product, -product.getQuantity());
        }
    }

    // Method to update stock levels
    public void updateStockLevel(Product product, int quantityChange) {
        for (Product p : productList) {
            if (p.getId() == product.getId()) {
                p.setQuantity(p.getQuantity() + quantityChange);
                break;
            }
        }
    }

    // Method to generate purchase order
    public List<Product> generatePurchaseOrder() {
        List<Product> lowStockProducts = new ArrayList<>();
        for (Product product : productList) {
            if (product.getQuantity() <= 5) {  // Assuming a threshold of 5 for reorder
                lowStockProducts.add(product);
            }
        }
        return lowStockProducts;
    }

    // Method to get low stock alerts
    public void alertLowStock() {
        for (Product product : productList) {
            if (product.getQuantity() <= 5) {  // Assuming a threshold of 5 for low stock
                System.out.println("Low stock alert for product: " + product.getName());
            }
        }
    }

    // Method to generate inventory reports
    public void generateReport() {
        for (Product product : productList) {
            System.out.println("Product: " + product.getName() + ", Quantity: " + product.getQuantity());
        }
    }
}
