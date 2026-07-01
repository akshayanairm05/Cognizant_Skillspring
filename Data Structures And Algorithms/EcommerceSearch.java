import java.util.Arrays;
import java.util.Comparator;

class Product {

    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void display() {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Category : " + category);
    }
}

public class EcommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            }

            if (products[mid].productId < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Book", "Education")

        };

        System.out.println("----- Linear Search -----");

        Product result = linearSearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found.");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\n----- Binary Search -----");

        result = binarySearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found.");
    }
}
