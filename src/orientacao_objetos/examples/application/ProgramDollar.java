package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Converter;

import java.util.Scanner;

public class ProgramDollar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        Converter.dollarPrice = scan.nextDouble();

        System.out.println("How many dollars do you want to buy? ");
        Converter.dollars = scan.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", Converter.convertToReais());

        scan.close();
    }
}
