package assuntos.MembrosEstaticos.util;

public class Calculador {

    public static final double PI = 3.14159;

    public static double circunferencia(double radius) {
        return 2 * PI * radius;
    }
    public static double volume(double radius) {
        return 4 * PI * Math.pow(radius, 3) / 3;
    }
}
