package colecoes.vetores.exercicios.exercicioVetores.application;

import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {

        int contador, contarMulheres, contarHomem;
        double maiorAltura, menorAltura, media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = scan.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        contador = 0;
        for (int i = 0; i < n; i++) {
            contador++;

            System.out.println("Altura da " + contador + "° pessoa:");
            altura[i] = scan.nextDouble();

            scan.nextLine();

            System.out.println("Genêro da " + contador + "° pessoa:");
            genero[i] = scan.nextLine().charAt(0);
        }

        menorAltura = altura[0];
        maiorAltura = altura[0];

        for (int i = 1; i < altura.length; i++) {
            if (menorAltura > altura[i]) {
                menorAltura = altura[i];
            }

            if (maiorAltura < altura[i]) {
                maiorAltura = altura[i];
            }
        }

        System.out.printf("Menor altura = %.2f", menorAltura);
        System.out.printf("\nMaior altura = %.2f", maiorAltura);


        contarMulheres = 0;
        media = 0;

        System.out.println("\n ");
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'F') {
                contarMulheres++;
                media += altura[i];
            }
        }
        System.out.printf("Média das alturas das mulheres: %.2f", media / contarMulheres);

        contarHomem = 0;
        for (int i = 0; i < genero.length; i++) {
            if (genero[i] == 'M') {
                contarHomem++;
            }
        }

        System.out.println("\nNúmero de homens: " + contarHomem);

        scan.close();
    }
}
