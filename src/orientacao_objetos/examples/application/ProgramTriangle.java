package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Triangle;
import java.util.Scanner;

public class ProgramTriangle {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the sides of the first triangle: ");
        x.a = scan.nextInt();
        x.b = scan.nextInt();
        x.c = scan.nextInt();

        System.out.println("Enter the sides of the second triangle: ");
        y.a = scan.nextInt();
        y.b = scan.nextInt();
        y.c = scan.nextInt();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area of the first triangle: %.2f%n", areaX);
        System.out.printf("Area of the second triangle: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("The first triangle is larger than the second");
        } else {
            System.out.println("The second triangle is larger than the first");
        }
        scan.close();
    }
}
