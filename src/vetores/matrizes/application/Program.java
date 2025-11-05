package vetores.matrizes.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Valores na diagonal:");
        for (int i = 0; i < matriz[i].length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0)
                    count++;
            }
        }

        System.out.println("\nQuantidade de números negativos: " + count);
        scan.close();
    }
}
