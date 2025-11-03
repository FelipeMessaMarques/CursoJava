package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Notas;
import java.util.Scanner;

public class ProgramNotas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Notas aluno = new Notas();

        System.out.println("Informa a nota final de cada trimestre: ");
        aluno.nome = scan.nextLine();
        aluno.n1 = scan.nextInt();
        aluno.n2 = scan.nextInt();
        aluno.n3 = scan.nextInt();

        if (aluno.notaFinal() > 60) {
            System.out.println(aluno.passou());
        } else {
            System.out.println(aluno.reprovou());
        }
    }
}
