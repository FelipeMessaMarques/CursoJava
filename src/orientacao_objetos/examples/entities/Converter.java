package orientacao_objetos.examples.entities;

public class Converter {

    public static double dollarPrice;
    public static double dollars;

    public static double convertToReais() {
        double iof = (dollarPrice * dollars) * 0.06;
        return iof + dollarPrice * dollars;
    }

}
