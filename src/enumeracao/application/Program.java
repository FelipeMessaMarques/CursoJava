package enumeracao.application;

import enumeracao.entities.Order;
import enumeracao.entities.enums.OrderStatus;

import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        System.setProperty("user.timezone", "America/Sao_Paulo");

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus p1 = OrderStatus.DELIVERED;
        OrderStatus p2 = OrderStatus.valueOf("DELIVERED");

        if(p1 == p2) {
            System.out.println("True");
        }
    }
}
