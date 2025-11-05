package orientacao_objetos.examples.entities;

public class Products {

    private String name;
    private double price;
    private int quantity;

    public Products(){}

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    };

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 0;
    };

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
     this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Methods
    public double totalStockValue() {
        return price * quantity;
    }

    public void addProducts(int quantity) { this.quantity += quantity; }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return  "\nProduct data:\n"
                + getName()
                + "\n$ "
                + String.format("%.2f", getPrice())
                + "\n"
                + getQuantity()
                + " units\nTotal: $ "
                + String.format("%.2f", totalStockValue());
    }

}
