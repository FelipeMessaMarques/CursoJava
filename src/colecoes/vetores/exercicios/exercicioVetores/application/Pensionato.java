package colecoes.vetores.exercicios.exercicioVetores.application;

import colecoes.vetores.exercicios.exercicioVetores.entities.Pensao;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Pensao[] quartos = new Pensao[2];

        System.out.println("Quantos quartos vão ser alugados?");
        int quartosAlugados = scan.nextInt();

        while (quartosAlugados > 10) {
            System.out.println("Temos apenas 10 quartos na pensão.\nQuantos quartos serão alugados?");
            quartosAlugados = scan.nextInt();
        }

        for (int i = 1; i <= quartosAlugados; i++) {
            scan.nextLine();
            System.out.println();

            System.out.println(i + "° aluguel:");
            System.out.print("Nome: ");
            String nome = scan.nextLine();

            System.out.print("E-mail: ");
            String email = scan.nextLine();

            System.out.print("Quarto: ");
            int quarto = scan.nextInt();

            quartos[quarto] = new Pensao(nome, email);
        }


        System.out.println();
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null)
                System.out.println(i + ": " + quartos[i]);
        }

        scan.close();
    }
}
