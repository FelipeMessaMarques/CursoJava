/*A gas station wants to determine which of its products is preferred by its customers. Write an
algorithm to read the type of fuel filled (coded as follows: 1.Alcohol 2.Gasoline 3.Diesel
4.End). If the user enters an invalid code (outside the range 1 to 4), a new code must be requested (until
it is valid). The program will end when the code entered is number 4. The message must be written:
"THANK YOU" and the number of customers who filled each type of fuel*/

package fundamentos;
import java.util.Scanner;

public class GasStation {

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         int gasoline = 0;
         int alcohol = 0;
         int diesel = 0;

         System.out.println("Hello, what would you like to fill?\n1 - Gasoline\n2 - Alcohol\n3 - Diesel\n4 - Exit");
         int fuel = scan.nextInt();

         while (fuel != 4) {
             if (fuel == 1) {
                 gasoline++;
             } else if (fuel == 2){
                 alcohol++;
             } else if (fuel == 3) {
                 diesel++;
             }

             System.out.println("Hello, what would you like to fill?\n1 - Gasoline\n2 - Alcohol\n3 - Diesel\n4 - Exit");
             fuel = scan.nextInt();
         }

         System.out.println("THANK YOU");
         System.out.println("Gasoline: " + gasoline);
         System.out.println("Alcohol: " + alcohol);
         System.out.println("Diesel: " + diesel);

         scan.close();
    }
}
