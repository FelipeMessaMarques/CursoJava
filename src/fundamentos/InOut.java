/*Read an integer value N. This value will be the quantity of integer values X that will be read next.
Show how many of these values X are within the interval [10,20] and how many are outside the interval,
showing this information as per example (use the word "in" for inside the interval, and "out" for outside the interval).*/

package fundamentos;
import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number and I'll tell you how many numbers belong to the interval [10,20]:");
        int numbers = scan.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 1; i <= numbers; i++) {
            if(i >= 10 && i <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println("in " + in);
        System.out.println("out " + out);

        scan.close();
    }
}
