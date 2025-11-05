package enumeracao.application;

import enumeracao.entities.Pedido;
import enumeracao.entities.enums.StatusPedido;

import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        System.setProperty("user.timezone", "America/Sao_Paulo");

        Pedido pedido = new Pedido(1080, new Date(), StatusPedido.PENDING_PAYMENT);

        System.out.println(pedido);

        StatusPedido p1 = StatusPedido.DELIVERED;
        StatusPedido p2 = StatusPedido.valueOf("DELIVERED");

        if(p1 == p2) {
            System.out.println("True");
        }
    }
}
