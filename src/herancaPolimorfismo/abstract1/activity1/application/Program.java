package herancaPolimorfismo.abstract1.activity1.application;

import herancaPolimorfismo.abstract1.activity1.entities.Account;
import herancaPolimorfismo.abstract1.activity1.entities.BusinessAccount;
import herancaPolimorfismo.abstract1.activity1.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Felipe", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Ana", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Carlos", 300.0, 0.01));
        list.add(new BusinessAccount(1004, "Carla", 500.0, 500.0));

        double sum = 0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }

        for (Account acc : list) {
            System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
