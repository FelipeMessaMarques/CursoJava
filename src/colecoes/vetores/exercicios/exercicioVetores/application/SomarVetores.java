package colecoes.vetores.exercicios.exercicioVetores.application;

import java.util.Scanner;

public class SomarVetores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos números você quer informar em cada conjunto: ");
        int n = scan.nextInt();

        double[] vetorA = new double[n];
        double[] vetorB = new double[n];
        double[] vetorC = new double[n];

        System.out.println("Preenchimento do conjunto A.");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número: ");
            vetorA[i] = scan.nextDouble();
        }

        System.out.println("Preenchimento do conjunto B.");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite um número: ");
            vetorB[i] = scan.nextDouble();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("%.2f\n", vetorC[i]);
        }

        scan.close();
    }
}
