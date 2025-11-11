package herancaPolimorfismo.activity3.application;

import herancaPolimorfismo.activity3.entities.Company;
import herancaPolimorfismo.activity3.entities.Individual;
import herancaPolimorfismo.activity3.entities.TaxPayer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        double count;

        System.out.print("Enter the number of tax payers: ");
        int numberPayers = scan.nextInt();

        for (int i = 1; i <= numberPayers; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char choice = scan.next().charAt(0);
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Anual income: ");
            double anualIncome = scan.nextDouble();


            if (choice == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpeditures = scan.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpeditures));
            }
            if (choice == 'c') {
                System.out.print("Number of employees: ");
                int numberEmployees = scan.nextInt();
                list.add(new Company(name, anualIncome, numberEmployees));
            }

        }

        count = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");

        for (TaxPayer tax : list) {
            System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
            count += tax.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", count);

        scan.close();
    }
}
