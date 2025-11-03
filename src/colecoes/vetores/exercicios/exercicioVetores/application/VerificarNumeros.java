package colecoes.vetores.exercicios.exercicioVetores.application;

import java.util.Scanner;

public class VerificarNumeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();

        while (n > 10) {
            System.out.println("Pode ser informado apenas 10 números.");
            System.out.println("Quantos números você vai digitar?");
            n = scan.nextInt();
        }

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] =  scan.nextDouble();
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%.2f\n", vect[i]);
            }
        }

        scan.close();
    }

}
