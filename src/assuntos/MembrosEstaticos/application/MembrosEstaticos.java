/*A versão 1 desse código estava  com as funções estáticas, agora não está mais */
package assuntos.MembrosEstaticos.application;

import assuntos.MembrosEstaticos.util.Calculador;
import java.util.Scanner;

public class MembrosEstaticos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Iforme o raio do circulo: ");
        double radius = scan.nextDouble();

        System.out.printf("Circunferencia: %.2f%n", Calculador.circunferencia(radius));
        System.out.printf("Volume: %.2f%n", Calculador.volume(radius));
        System.out.printf("PI valor: %.2f%n", Calculador.PI);

        scan.close();
    }


}
