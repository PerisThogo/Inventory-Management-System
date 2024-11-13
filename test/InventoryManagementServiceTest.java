package tests;

import models.*;
import services.*;
import java.util.*;

public class InventoryManagementServiceTest {

    public static void main(String[] args) {
        InventoryManagementService service = new InventoryManagementService();

        // Create sample products
        Product p1 = new Product(1, "Laptop", 10, "Warehouse A");
        Product p2 = new Product(2, "Phone", 5, "Store");
        service.addProduct(p1);
        service.addProduct(p2);

        // Create order
        List<Product> orderProducts = Arrays.asList(p1, p2);
        Order order = new Order(1, orderProducts, "Placed", "2024-11-13");
        service.placeOrder(order);

        // Test stock level and alert
        service.alertLowStock();
        service.generateReport();

        // Generate purchase order for low stock
        List<Product> purchaseOrder = service.generatePurchaseOrder();
        System.out.println("Purchase Order generated for the following products: ");
        for (Product product : purchaseOrder) {
            System.out.println(product.getName());
        }
    }
}
