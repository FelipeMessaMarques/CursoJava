/*Write a program that repeats reading a password until it is valid. For each reading of an
incorrect password, write the message "Invalid Password". When the password is entered correctly,
print the message "Access Granted" and end the algorithm. Consider that the correct password is 2002.*/

package fundamentos;
import java.util.Scanner;


public class PasswordVerifier {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int attempts = 3;
        int password = 2002;

        System.out.println("Enter the safe password. You have " + attempts + " attempts.");
        int enteredPassword = scan.nextInt();

        while(enteredPassword != password) {

            attempts--;

            if (attempts > 0) {
                System.out.println("Enter the password again. You have " + attempts + " attempts left.");
                enteredPassword = scan.nextInt();
            } else {
                System.out.println("You're out of attempts, you lost!!");
                break;
            }
        }

        if(enteredPassword == password) {
            System.out.println("Correct password!!");
        }
        scan.close();

    }
}
