import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%s - $%.2f x %d = $%.2f", name, price, quantity, getTotal());
    }
}

class Invoice {
    private List<Product> products;
    private String customerName;

    public Invoice(String customerName) {
        this.customerName = customerName;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotal();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("Invoice for: " + customerName);
        System.out.println("==================================");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total Amount: $" + getTotalAmount());
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("AB Devilliers");

        Product product1 = new Product("Item 1", 10.0, 2);
        Product product2 = new Product("Item 2", 5.0, 4);

        invoice.addProduct(product1);
        invoice.addProduct(product2);

        invoice.printInvoice();
    }
}
