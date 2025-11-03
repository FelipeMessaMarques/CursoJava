package exercicioVetores.application;

import java.util.Scanner;

public class pares {
    public static void main(String[] args) {

        int contador;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número:");
            vect[i] = scan.nextInt();
        }

        contador = 0;

        System.out.println("Números pares:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                contador++;
                System.out.println(vect[i]);
            }
        }

        System.out.println("Quantidade de números pares: " + contador);

        scan.close();
    }
}
