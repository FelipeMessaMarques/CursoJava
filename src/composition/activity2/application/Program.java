package composition.activity2.application;

import composition.activity2.entities.Comment;
import composition.activity2.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(
                LocalDateTime.parse("06/11/2025 15:18:43", dtf),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        p1.addComments(c1);
        p1.addComments(c2);

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(
                LocalDateTime.parse("28/07/2025 23:14:19",dtf),
                "Good night guys",
                "See you tomorrow",
                5);

        p2.addComments(c3);
        p2.addComments(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
