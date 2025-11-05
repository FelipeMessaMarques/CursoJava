package vetores.matrizes.atividade;

import java.util.Scanner;

public class BuscaNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Defina a quantidade de linhas e colunas da sua matriz: ");
        int l = scan.nextInt();
        int c = scan.nextInt();

        int[][] numeros = new int[l][c];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = scan.nextInt();
            }
        }

        System.out.println("Digite um número que você quer encontrar na matriz: ");
        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == x) {

                    //vetor = i
                    //indice = j

                    System.out.println("Posição: " + i + ", " + j);

                    if (j > 0)  System.out.println("Esquerda: " + numeros[i][j - 1]);

                    if (j < numeros[i].length - 1)  System.out.println("Direita: " + numeros[i][j + 1]);

                    if (i > 0) System.out.println("Acima: " + numeros[i - i][j]);

                    if (i < numeros.length - 1) System.out.println("Abaixo: " + numeros[i + 1][j]);
                }
            }
        }

        scan.close();
    }
}
