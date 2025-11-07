package herancaPolimorfismo.activity2.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    private LocalDate moment;

    public UsedProduct(String name, Double price, LocalDate moment) {
        super(name, price);
        this.moment = moment;
    }

    @Override
    public String priceTag() {
        return name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + dtf.format(moment) + ")";
    }
}
