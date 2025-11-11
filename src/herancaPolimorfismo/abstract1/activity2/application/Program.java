package herancaPolimorfismo.abstract1.activity2.application;

import herancaPolimorfismo.abstract1.activity2.entities.Circle;
import herancaPolimorfismo.abstract1.activity2.entities.Rectangle;
import herancaPolimorfismo.abstract1.activity2.entities.Shape;
import herancaPolimorfismo.abstract1.activity2.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color =  Color.valueOf(scan.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = scan.nextDouble();
                System.out.print("Height: ");
                double height = scan.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = scan.nextDouble();
                list.add(new Circle(color, radius));
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shapes : list) {
            System.out.println(String.format("%.2f", shapes.area()));
        }

        scan.close();
    }
}
