package exception1.one.application;

import exception1.one.model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(scan.nextLine(), dtf);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(scan.next(), dtf);

         if (!checkOut.isAfter(checkIn)) {
             System.out.println("Error in reservation: Check-out must be after check-in date");
         }
         else {
             Reservation reservation = new Reservation(number, checkIn, checkOut);
             System.out.println(reservation);

             System.out.println();
             System.out.println("Enter data the update the reservation: ");
             scan.nextLine();
             System.out.print("Check-in date (dd/MM/yyyy): ");
             checkIn = LocalDate.parse(scan.nextLine(), dtf);
             System.out.print("Check-out date (dd/MM/yyyy): ");
             checkOut = LocalDate.parse(scan.next(), dtf);

             if (checkIn.isBefore(LocalDate.now()) || checkIn.isBefore(LocalDate.now())) {
                 System.out.println("Error in reservation: Reservation dates for update must be future dates.");
             }
             else if (!checkOut.isAfter(checkIn)) {
                 System.out.println("Error in reservation: Check-out must be after check-in date");
             }
             else {
                 reservation.updateDates(checkIn, checkOut);
                 System.out.println("Resevation: " + reservation);
             }
         }
        scan.close();
    }
}
