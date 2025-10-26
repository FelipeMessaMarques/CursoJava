package atividades.classe.entities;

public class Banco {

    private int numeroConta;
    private String titular;
    private double saldo;

    public Banco(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public Banco(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    // Get e Set
    public int getNumeroConta() {
        return  this.numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    // Módulos
    public void deposito(double deposito){
        saldo += deposito;
    }

    public void saque(double saque) {
        saldo -= saque + 5;
    }

    public String infoConta() {
        return "\nConta: "
                + getNumeroConta()
                + ", Titular "
                + getTitular()
                + ", Saldo"
                + String.format(" $ %.2f", getSaldo());
    }
}
