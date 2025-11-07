package composition.activity3.application;

import composition.activity3.entities.Client;
import composition.activity3.entities.Order;
import composition.activity3.entities.OrderItem;
import composition.activity3.entities.Product;
import composition.activity3.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

//        DateTimeFormatter formatDateOrder = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatDateBirth = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Email: ");
        String email = scan.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(scan.nextLine(), formatDateBirth);

        Client c1 = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.nextLine());

        System.out.print("How many items to this order: ");
        int orderItems = scan.nextInt();
        Order order = new Order(status, LocalDateTime.now(), c1);

        for (int i = 1; i <= orderItems; i++) {
            System.out.println("Enter #" + i + " item data: ");
            scan.nextLine();
            System.out.print("Product name: ");
            String nameProduct = scan.nextLine();
            System.out.print("Product price: ");
            double priceProduct = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scan.nextInt();

            Product product = new Product(nameProduct, priceProduct);
            OrderItem orderItem = new OrderItem(quantity, priceProduct, product);
            order.addItem(orderItem);
        }

        System.out.println(order);
        scan.close();
    }
}
