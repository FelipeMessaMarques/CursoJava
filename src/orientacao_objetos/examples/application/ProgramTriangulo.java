package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Triangulo;
import java.util.Scanner;

public class ProgramTriangulo {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("lados do primeiro triângulo: ");
        x.a = scan.nextInt();
        x.b = scan.nextInt();
        x.c = scan.nextInt();

        System.out.println("lados do segundo triângulo: ");
        y.a = scan.nextInt();
        y.b = scan.nextInt();
        y.c = scan.nextInt();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("área do primeiro triângulo: %.2f%n", areaX);
        System.out.printf("área do segundo triângulo: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("o primeiro triângulo é maior que o segundo");
        } else {
            System.out.println("o sengundo triângulo é maior que o primeiro");
        }
        scan.close();
    }
}
