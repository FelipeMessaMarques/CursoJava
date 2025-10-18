/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

package atividades;
import java.util.Scanner;


public class MediaPonderada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double mediaPonderada = 0;
        double resultadoSoma = 0;

        System.out.println("Digite a quantidade de testes: ");
        int numero = scan.nextInt();

        for(int i = 1; i <= numero; i++) {
            for (int t = 1; t <= 3; t++) {
                System.out.println("Informe o "+ t +"° valor para o "+ i +"° teste:");
                double teste = scan.nextDouble();

                if (t == 1) {
                    mediaPonderada = teste * 2;
                    resultadoSoma += mediaPonderada;
                    System.out.printf("%.1f * 3 = %.1f \n", teste, mediaPonderada);
                } else if (t == 2) {
                    mediaPonderada = teste * 3;
                    resultadoSoma += mediaPonderada;

                    System.out.printf("%.1f * 3 = %.1f \n", teste, mediaPonderada);
                } else {
                    mediaPonderada = teste * 5;
                    resultadoSoma += mediaPonderada;
                    System.out.printf("%.1f * 5 %.1f \nSoma total: %.1f ", teste, mediaPonderada, resultadoSoma);
                }

                if (t == 3) {
                    double resultadoFinal = resultadoSoma / (2 + 3 + 5);
                    System.out.printf("Resultado do primeiro teste: %.1f", resultadoFinal);
                }
            }
        }






    }

}
