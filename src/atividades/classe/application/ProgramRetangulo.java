package atividades.classe.application;

import entities.Retangulo;
import java.util.Scanner;

public class ProgramRetangulo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Retangulo x = new Retangulo();

        System.out.println("Informe a altura e largura do retângulo: ");
        x.altura = scan.nextDouble();
        x.largura = scan.nextDouble();

        System.out.printf("AREA: %.2f\n", x.area());
        System.out.printf("PERIMETRO: %.2f\n", x.perimetro());
        System.out.printf("DIAGONAL: %.2f", x.diagonal());

        scan.close();
    }

}
