package exercicioVetores.application;

import java.util.Scanner;

public class mediaPares {
    public static void main(String[] args) {

        double media, soma, npares;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você quer digitar?");
        int n = scan.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scan.nextInt();
        }

        soma = 0;
        npares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                npares++;
            }
        }

        media = soma / npares;

        if (soma == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.2f", media);
        }
        scan.close();
    }
}
