package colecoes.vetores.exercicios.exercicioVetores.application;

import colecoes.vetores.exercicios.exercicioVetores.entities.Alunos;

import java.util.Scanner;

public class NomeMedia {
    public static void main(String[] args) {

        int contador;
        double media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?");
        int n = scan.nextInt();

        Alunos[] alunos = new Alunos[n];

        contador = 1;
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + contador + "° aluno(a):");
            scan.nextLine();
            String nome = scan.nextLine();
            double nota1 = scan.nextDouble();
            double nota2 = scan.nextDouble();
            alunos[i] = new Alunos(nome, nota1, nota2);
            contador++;
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++) {
            media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2;
            if (media >= 6) {
                System.out.println(alunos[i].getNome());
            }
        }

        scan.close();
    }
}
