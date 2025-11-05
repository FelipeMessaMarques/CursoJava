package colecoes.vetores.application;

import colecoes.vetores.entities.Product;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many products do you want to add? ");
        int n = scan.nextInt();

        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++) {
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double average = sum / vect.length;

        System.out.printf("Average price = %.2f ", average);
        scan.close();
    }

}
