package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Conversor;

import java.util.Scanner;

public class ProgramDolar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do dólar?");
        Conversor.dolar = scan.nextDouble();

        System.out.println("Quantos dólar deseja comprar? ");
        Conversor.reais = scan.nextDouble();

        System.out.printf("Valor a ser pago em reais: %.2f", Conversor.conversorReais());

        scan.close();
    }
}
