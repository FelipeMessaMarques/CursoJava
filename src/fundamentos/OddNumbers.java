/*Read an integer value X (1 <= X <= 1000). Then show the odd numbers from 1 to X, one value per line, including X
if applicable.*/

package fundamentos;
import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number (1 to 1000):");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
