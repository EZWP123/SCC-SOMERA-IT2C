package javaappsecc;
import java.util.Scanner;
class ProductInput {
    public void genProducts() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter product name: ");
        String name = scanner.next();

        System.out.print("Enter number of products sold: ");
        int sold = scanner.nextInt();

        System.out.print("Enter current stock: ");
        int stock = scanner.nextInt();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        product.addProduct(id, name, sold, stock, price);

        System.out.println("Product information:");
        product.viewProduct();
    }
}
