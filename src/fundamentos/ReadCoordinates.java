/*Write a program to read the coordinates (X,Y) of an indeterminate number of points in the Cartesian
system. For each point, write which quadrant it belongs to. The algorithm will end when at least
one of the two coordinates is NULL (in this situation without writing any message).*/

package fundamentos;
import java.util.Scanner;

public class ReadCoordinates {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X coordinate:");
        int x = scan.nextInt();

        System.out.println("Enter Y coordinate:");
        int y = scan.nextInt();

        while (x != 0 || y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("The coordinates X = " + x + " Y = " + y + " belong to the 1st quadrant.");

            } else if (x < 0 && y > 0) {
                System.out.println("The coordinates X = " + x + " Y = " + y + " belong to the 2nd quadrant.");

            } else if (x < 0 && y < 0) {
                System.out.println("The coordinates X = " + x + " Y = " + y + " belong to the 3rd quadrant.");

            } else {
                System.out.println("The coordinates X = " + x + " Y = " + y + " belong to the 4th quadrant.");
            }

            System.out.println("Enter X coordinate:");
            x = scan.nextInt();

            System.out.println("Enter Y coordinate:");
            y = scan.nextInt();
        }
        scan.close();
    }
}
