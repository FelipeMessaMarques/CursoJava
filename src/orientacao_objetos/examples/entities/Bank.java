package orientacao_objetos.examples.entities;

public class Bank {

    private int accountNumber;
    private String holder;
    private double balance;

    public Bank(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public Bank(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    // Getters and Setters
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


    // Methods
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public String accountInfo() {
        return "\nAccount: "
                + getAccountNumber()
                + ", Holder: "
                + getHolder()
                + ", Balance: "
                + String.format("$ %.2f", getBalance());
    }
}
