package colecoes.vetores.exercicios.exercicioVetores.application;

import java.util.Scanner;

public class Operacoes {
    
    public static void main(String[] args) {

        double soma, media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();
        
        double[] vect = new double[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = scan.nextDouble();
        }


        soma = 0;

        System.out.println("Valores:");
        for (int i = 0; i < vect.length; i++) {
           System.out.printf("%.2f ", vect[i]);
           soma += vect[i];
       }

        media = soma / vect.length;

        System.out.printf("\nSoma: %.2f", soma);
        System.out.printf("\nMédia: %.2f", media);
        scan.close();
    }
    
}
