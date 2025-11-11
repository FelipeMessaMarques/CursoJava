/*Version 1 of this code had static functions, now it doesn't anymore */
package MembrosEstaticos.application;

import MembrosEstaticos.util.Calculator;
import java.util.Scanner;

public class StaticMembers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scan.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scan.close();
    }


}
