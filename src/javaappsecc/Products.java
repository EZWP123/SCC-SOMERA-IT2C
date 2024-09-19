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
        
        System.out.println("Product information:");        
        product.addProduct(id, name, sold, stock, price);
         System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-15s %-10s\n",
                      "Id", "Name" , "sold" , "Stock" , "prices", "profit" , "status", "TotalValue");
        product.viewProduct();
    
   
}
}
