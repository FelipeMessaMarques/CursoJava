/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

package fundamentos;
import java.util.Scanner;

public class LerCoordenadas {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a coordenada de X:");
        int x = scan.nextInt();

        System.out.println("Digite a coordenada de Y:");
        int y = scan.nextInt();

        while (x != 0 || y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("As coordenadas X = " + x + " Y = " + y + ", pertencem ao 1° quadrante.");

            } else if (x < 0 && y > 0) {
                System.out.println("As coordenadas X = " + x + " Y = " + y + ", pertencem ao 2° quadrante.");

            } else if (x < 0 && y < 0) {
                System.out.println("As coordenadas X = " + x + " Y = " + y + ", pertencem ao 3° quadrante.");

            } else {
                System.out.println("As coordenadas X = " + x + " Y = " + y + ", pertencem ao 4° quadrante.");
            }

            System.out.println("Digite a coordenada de X:");
            x = scan.nextInt();

            System.out.println("Digite a coordenada de Y:");
            y = scan.nextInt();
        }
        scan.close();
    }
}
