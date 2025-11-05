package composition.application;
import composition.entities.Department;
import composition.entities.HourContract;
import composition.entities.Worker;
import composition.entities.enums.WorkLevel;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {


        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Enter department name: ");
        String departmentName = scan.nextLine();


        System.out.println("Enter worker data:");


        System.out.print("Name: ");
        String workerName = scan.nextLine();


        System.out.print("Level: ");
        String workerLevelInput = scan.nextLine();


        WorkLevel workerLevel;
        try {
            workerLevel = WorkLevel.valueOf(workerLevelInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid level! Use JUNIOR, MID_LEVEL or SENIOR.");
            scan.close();
            return;
        }


        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();


        Worker worker = new Worker(workerName, baseSalary, workerLevel, new Department(departmentName));


        System.out.print("How many contracts does this worker have? ");
        int contractsCount = scan.nextInt();
        if (contractsCount < 0) {
            System.out.println("Invalid number of contracts.");
            scan.close();
            return;
        }


        for (int i = 1; i <= contractsCount; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scan.nextInt();


            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }


        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYear = scan.next();
        int month = Integer.parseInt(monthYear.substring(0, 2));
        int year = Integer.parseInt(monthYear.substring(3));


        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: $ %.2f%n", monthYear, worker.income(year, month));


        scan.close();
    }
}