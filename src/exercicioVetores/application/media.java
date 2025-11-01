package exercicioVetores.application;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        double media, soma;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar: ");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scan.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.printf("MEDIA DO VETOR: %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

        scan.close();
    }
}
