package colecoes.vetores.exercicios.exercicioVetores.application;

import colecoes.vetores.exercicios.exercicioVetores.entities.Pessoa;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        int posicao, contador;
        double media, porcentagem, soma;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoa serão cadastradas?");
        int n = scan.nextInt();

        Pessoa[] vect = new Pessoa[n];

        posicao = 1;
        for (int i = 0; i < vect.length; i++) {
            scan.nextLine();
            System.out.println("Dados da " + posicao + "a pessoa: ");

            System.out.println("Nome:");
            String nome = scan.nextLine();

            System.out.println("Idade:");
            int idade = scan.nextInt();

            System.out.println("Altura:");
            double altura = scan.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
            posicao++;
        }

        soma = 0;
        for(int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
        }

        media = soma / vect.length;

        System.out.printf("Altura média: %.2f\n", media);
        porcentagem = 0;
        contador = 0;


        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getIdade() < 16) {
                contador++;
            }
        }

        porcentagem = ((double)contador / vect.length) * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.2f\n", porcentagem);

        for (int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        System.out.println();

        scan.close();
    }
}
