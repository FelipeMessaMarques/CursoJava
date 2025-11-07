package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Products;
import java.util.Scanner;

public class ProgramProducts {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Initial product info
        System.out.println("Enter product data");

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Price: ");
        double price = scan.nextDouble();

        // Creating object
        Products product = new Products(name, price);

        // Stock input and output info
        System.out.println(product);
        System.out.print("\nEnter the quantity to add to stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println(product);
        System.out.print("\nEnter the quantity to remove from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println(product);

        scan.close();
    }
}
