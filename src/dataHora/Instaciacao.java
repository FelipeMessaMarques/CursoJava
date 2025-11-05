package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instaciacao {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-14");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-14T01:30:26");

        LocalDate d06 = LocalDate.parse("20/07/2025", fmt1);

        System.out.println("D01: " + d01.toString());
        System.out.println("D02: " + d02.toString());
        System.out.println("D03: " + d03.toString());
        System.out.println("D04: " + d04.toString());
        System.out.println("D05: " + d05.toString());
        System.out.println("D06: " + d06.toString());
    }
}
