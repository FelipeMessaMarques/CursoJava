/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/

package atividades;
import java.util.Scanner;

public class Impares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número (1 a 1000):");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
