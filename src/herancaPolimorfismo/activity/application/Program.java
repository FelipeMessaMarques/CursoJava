package herancaPolimorfismo.activity.application;

import herancaPolimorfismo.activity.entities.Employee;
import herancaPolimorfismo.activity.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Hours: ");
            int hours = scan.nextInt();
            System.out.print("Values per hour: ");
            double valuePerHour = scan.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double addtionalCharge = scan.nextDouble();
                list.add(new OutsourceEmployee(name, hours, valuePerHour, addtionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        scan.close();
    }
}
