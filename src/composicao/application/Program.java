package composicao.application;

import composicao.entities.ContratoHora;
import composicao.entities.Departamento;
import composicao.entities.Trabalhador;
import composicao.entities.enums.NivelTrabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Informe o nome do departamento: ");
        String nomeDepartamento = scan.nextLine();

        System.out.println("Informe os seguintes dados do trabalhador:");

        System.out.print("Nome: ");
        String nomeTrabalhador = scan.nextLine();

        System.out.print("Nível: ");
        String nivelTrabalhador = scan.nextLine();

        System.out.print("Salário base: ");
        double salarioTrabalhador = scan.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, salarioTrabalhador, NivelTrabalho.valueOf(nivelTrabalhador), new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos esse trabalhador possui?");
        int qtdContratos = scan.nextInt();

        for (int i = 1; i <= qtdContratos; i++) {
            System.out.println("Informe os dados do " + i + "° contrato: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(scan.next());
            System.out.print("Valor por hora: ");
            double valorHora = scan.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = scan.nextInt();

            ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
            trabalhador.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Informe o mês e ano para calcular o salário (MM/YYYY): ");
        String mesAno = scan.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Recebidos " + mesAno + ": " + String.format("%.2f", trabalhador.recebidos(ano, mes)));

        scan.close();
    }
}
