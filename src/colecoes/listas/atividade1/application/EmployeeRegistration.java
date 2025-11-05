package colecoes.listas.atividade1.application;

import colecoes.listas.atividade1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRegistration {
    public static void main(String[] args) {

        int counter;

        Scanner scan = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int registrations = scan.nextInt();

        counter = 0;
        for (int i = 0; i < registrations; i++) {
            scan.nextLine();
            counter++;

            System.out.println("Employee " + counter + ": ");
            System.out.print("ID: ");
            int id = scan.nextInt();

            while(idExists(employees,id)) {
                System.out.println("This ID already exists. Enter another ID:");
                id = scan.nextInt();
            }

            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();

            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        scan.nextLine();
        System.out.println("Enter the employee ID that will receive a salary increase:");
        int id = scan.nextInt();

        Employee empSalary = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (empSalary == null) {
            System.out.println("This employee is not registered!");
        } else {
            System.out.println("Enter the percentage of salary increase:");
            empSalary.increaseSalary(scan.nextDouble());
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee x : employees) {
            System.out.println(x.toString());
        }

        scan.close();
    }

    private static boolean idExists(List<Employee> employees, int id) {
        Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
