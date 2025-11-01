package exercicioVetores.application;

import java.util.Scanner;

public class maiorValor {
    public static void main(String[] args) {

        double maior;
        int posicao;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = scan.nextDouble();
        }

        maior = vect[0];
        posicao = 0;

        for (int i = 1; i < vect.length; i++) {
            if(vect[i] > maior) {
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.printf("Maior: %.2f", maior);
        System.out.println("\nPosição: " + posicao);

        scan.close();
    }
}