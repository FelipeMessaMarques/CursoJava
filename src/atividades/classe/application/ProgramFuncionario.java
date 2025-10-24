package atividades.classe.application;

import entities.Funcionario;
import java.util.Scanner;

public class ProgramFuncionario {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Funcionario felipe = new Funcionario();

        System.out.println("Informe o nome do funcionário, salário bruto e imposto: ");
        felipe.nome = scan.nextLine();
        felipe.salarioBruto = scan.nextDouble();
        felipe.imposto = scan.nextDouble();

        System.out.printf("Funcionário: %s, $ %.2f", felipe.nome, felipe.salarioLiquido());

        System.out.println("\nQuantos porcento vai ser o aumento do salário: ");
        felipe.aumento(scan.nextDouble());

        System.out.printf("Dados atualizados: %s, $ %.2f", felipe.nome, felipe.salarioLiquido());

        scan.close();
    }
}
