package vetores.matrizes.atividade;

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Define the number of rows and columns for your matrix: ");
        int r = scan.nextInt();
        int c = scan.nextInt();

        int[][] numbers = new int[r][c];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter a number you want to find in the matrix: ");
        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == x) {

                    //row = i
                    //column = j

                    System.out.println("Position: " + i + ", " + j);

                    if (j > 0)  System.out.println("Left: " + numbers[i][j - 1]);

                    if (j < numbers[i].length - 1)  System.out.println("Right: " + numbers[i][j + 1]);

                    if (i > 0) System.out.println("Above: " + numbers[i - i][j]);

                    if (i < numbers.length - 1) System.out.println("Below: " + numbers[i + 1][j]);
                }
            }
        }

        scan.close();
    }
}
