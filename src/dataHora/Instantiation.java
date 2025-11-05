package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instantiation {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-14");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-14T01:30:26");

        LocalDate d06 = LocalDate.parse("20/07/2025", fmt1);

        System.out.println("Date 1: " + d01.toString());
        System.out.println("Date 2: " + d02.toString());
        System.out.println("Date 3: " + d03.toString());
        System.out.println("Date 4: " + d04.toString());
        System.out.println("Date 5: " + d05.toString());
        System.out.println("Date 6: " + d06.toString());
    }
}
