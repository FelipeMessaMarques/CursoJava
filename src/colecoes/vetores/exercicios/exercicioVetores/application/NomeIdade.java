package colecoes.vetores.exercicios.exercicioVetores.application;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {

        int contador, maisVelho, posicao;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar: ");
        int n = scan.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        contador = 0;
        for (int i = 0; i < n; i++) {
            contador++;
            System.out.println("Informe o nome e a idade da " + contador + "a pessoa.");
            nome[i] = scan.next();
            idade[i] = scan.nextInt();
        }

        maisVelho = idade[0];
        posicao = 0;

        for (int i = 1; i < idade.length; i++) {
            if(maisVelho < idade[i]) {
                maisVelho = idade[i];
                posicao = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nome[posicao]);
        scan.close();
    }
}
