package herancaPolimorfismo.activity2.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ImportedProduct extends Product{

    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    private Double totalPrice() {
        return price += customFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + customFee + ")";
    }
}
