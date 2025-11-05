/*Read 1 integer value N, which represents the number of test cases that follow. Each test case consists
of 3 real values, each with one decimal place. Present the weighted average for each of these
sets of 3 values, where the first value has weight 2, the second value has weight 3, and the third value has
weight 5.*/

package fundamentos;
import java.util.Scanner;


public class WeightedAverage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double weightedAverage = 0;
        double sumResult = 0;

        System.out.println("Enter the number of tests: ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++) {
            for (int t = 1; t <= 3; t++) {
                System.out.println("Enter the "+ t +"th value for the "+ i +"th test:");
                double test = scan.nextDouble();

                if (t == 1) {
                    weightedAverage = test * 2;
                    sumResult += weightedAverage;
                    System.out.printf("%.1f * 2 = %.1f \n", test, weightedAverage);
                } else if (t == 2) {
                    weightedAverage = test * 3;
                    sumResult += weightedAverage;

                    System.out.printf("%.1f * 3 = %.1f \n", test, weightedAverage);
                } else {
                    weightedAverage = test * 5;
                    sumResult += weightedAverage;
                    System.out.printf("%.1f * 5 = %.1f \nTotal sum: %.1f ", test, weightedAverage, sumResult);
                }

                if (t == 3) {
                    double finalResult = sumResult / (2 + 3 + 5);
                    System.out.printf("Result of the first test: %.1f", finalResult);
                }
            }
        }






    }

}
