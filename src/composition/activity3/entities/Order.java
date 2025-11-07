package composition.activity3.entities;


import composition.activity3.entities.enums.OrderStatus;
import composition.activity3.entities.Client;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final DateTimeFormatter formatDateBirth = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter formatDateOrder = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;
    List<OrderItem> listItem = new ArrayList<>();

    private Client client;

    public Order(OrderStatus status, LocalDateTime moment, Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getListItem() {
        return listItem;
    }

    public void addItem(OrderItem item) {
        listItem.add(item);
    }

    public void removeItem(OrderItem item) {
        listItem.remove(item);
    }

    public Double total() {
        double value = 0;
        for (OrderItem item : listItem) {
           value += item.subTotal();
        }
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(formatDateOrder.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : listItem) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
