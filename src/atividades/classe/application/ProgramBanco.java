package atividades.classe.application;

import atividades.classe.entities.Banco;
import java.util.Scanner;

public class ProgramBanco {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Número da conta: ");
        int numeroConta = scan.nextInt();

        scan.nextLine();
        System.out.println("Nome do titular da conta: ");
        String titular = scan.nextLine();

        System.out.println("Deseja fazer um depósito inicial(y/n)?");
        char confirmacaoDeposito = scan.nextLine().charAt(0);

        Banco conta = null;
        if (confirmacaoDeposito == 'y') {

            System.out.println("Valor que deseja depositar: ");
            double deposito = scan.nextDouble();

            conta = new Banco(numeroConta, titular, deposito);
            System.out.print(conta.infoConta());

        } else if (confirmacaoDeposito == 'n') {
            conta = new Banco(numeroConta, titular);
            System.out.print("Conta:" + conta.infoConta());

        }

        System.out.println("\nFaça um depósito: ");
        conta.deposito(scan.nextDouble());

        System.out.println("Atualizações da conta: ");
        System.out.print(conta.infoConta());

        System.out.println("\nRealize um saque: ");
        conta.saque(scan.nextDouble());

        System.out.println("\nAtualizações da conta: ");
        System.out.print(conta.infoConta());

        scan.close();
    }

}
