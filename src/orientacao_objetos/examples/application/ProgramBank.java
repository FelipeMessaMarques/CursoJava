package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Bank;
import java.util.Scanner;

public class ProgramBank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Account number: ");
        int accountNumber = scan.nextInt();

        scan.nextLine();
        System.out.println("Account holder name: ");
        String holder = scan.nextLine();

        System.out.println("Would you like to make an initial deposit (y/n)?");
        char depositConfirmation = scan.nextLine().charAt(0);

        Bank account = null;
        if (depositConfirmation == 'y') {

            System.out.println("Enter the amount to deposit: ");
            double deposit = scan.nextDouble();

            account = new Bank(accountNumber, holder, deposit);
            System.out.print(account.accountInfo());

        } else if (depositConfirmation == 'n') {
            account = new Bank(accountNumber, holder);
            System.out.print("Account:" + account.accountInfo());

        }

        System.out.println("\nMake a deposit: ");
        account.deposit(scan.nextDouble());

        System.out.println("Account updates: ");
        System.out.print(account.accountInfo());

        System.out.println("\nMake a withdrawal: ");
        account.withdraw(scan.nextDouble());

        System.out.println("\nAccount updates: ");
        System.out.print(account.accountInfo());

        scan.close();
    }

}
