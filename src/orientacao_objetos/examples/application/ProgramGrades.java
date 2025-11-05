package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Grades;
import java.util.Scanner;

public class ProgramGrades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Grades student = new Grades();

        System.out.println("Enter the final grade for each trimester: ");
        student.name = scan.nextLine();
        student.grade1 = scan.nextInt();
        student.grade2 = scan.nextInt();
        student.grade3 = scan.nextInt();

        if (student.finalGrade() > 60) {
            System.out.println(student.passed());
        } else {
            System.out.println(student.failed());
        }
    }
}
