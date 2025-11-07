package herancaPolimorfismo.introduction.application;

import herancaPolimorfismo.introduction.entities.Account;
import herancaPolimorfismo.introduction.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withDraw(50.0);
        y.withDraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
