package atividades.classe.entities;

public class Conversor {

    public static double dolar;
    public static double reais;

    public static double conversorReais() {
        double iof = (dolar * reais) * 0.06;
        return iof + dolar * reais;
    }

}
