package herancaPolimorfismo.activity2.application;

import herancaPolimorfismo.activity2.entities.ImportedProduct;
import herancaPolimorfismo.activity2.entities.Product;
import herancaPolimorfismo.activity2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner scan = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantityProducts = scan.nextInt();

        for (int i = 1; i <= quantityProducts; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char statusProduct = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextInt();
            scan.nextLine();
            if (statusProduct == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            } else if (statusProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate moment = LocalDate.parse(scan.nextLine(), dtf);
                productList.add(new UsedProduct(name, price, moment));
            } else {
                productList.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product items : productList) {
            System.out.println(items.priceTag());
        }

        scan.close();
    }
}
