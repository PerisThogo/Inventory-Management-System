package utils;

import models.Product;
import java.util.*;

public class ArrayUtils {

    // Sort products by name
    public static void sortProductsByName(List<Product> products) {
        products.sort(Comparator.comparing(Product::getName));
    }

    // Binary search to find product by ID
    public static Product binarySearchById(List<Product> products, int id) {
        int low = 0, high = products.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products.get(mid).getId() == id) {
                return products.get(mid);
            } else if (products.get(mid).getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
