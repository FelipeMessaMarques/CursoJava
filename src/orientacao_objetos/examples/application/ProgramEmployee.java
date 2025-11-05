package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Employee;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter employee name, gross salary and tax percentage: ");
        employee.name = scan.nextLine();
        employee.grossSalary = scan.nextDouble();
        employee.tax = scan.nextDouble();

        System.out.printf("Employee: %s, $ %.2f", employee.name, employee.netSalary());

        System.out.println("\nEnter the salary increase percentage: ");
        employee.increaseSalary(scan.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.netSalary());

        scan.close();
    }
}
