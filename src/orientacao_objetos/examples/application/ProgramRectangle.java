package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Rectangle;
import java.util.Scanner;

public class ProgramRectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Rectangle x = new Rectangle();

        System.out.println("Enter the height and width of the rectangle: ");
        x.height = scan.nextDouble();
        x.width = scan.nextDouble();

        System.out.printf("AREA: %.2f\n", x.area());
        System.out.printf("PERIMETER: %.2f\n", x.perimeter());
        System.out.printf("DIAGONAL: %.2f", x.diagonal());

        scan.close();
    }

}
