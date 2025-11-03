package colecoes.listas.atividade1.application;

import colecoes.listas.atividade1.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionario {
    public static void main(String[] args) {

        int contador;

        Scanner scan = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionários serão cadastrados?");
        int cadastros = scan.nextInt();

        contador = 0;
        for (int i = 0; i < cadastros; i++) {
            scan.nextLine();
            contador++;

            System.out.println("Funcionário " + contador + ": ");
            System.out.print("ID: ");
            int id = scan.nextInt();

            while(existeId(funcionarios,id)) {
                System.out.println("Este id já existe. Digite outro id:");
                id = scan.nextInt();
            }

            scan.nextLine();
            System.out.print("Name: ");
            String nome = scan.nextLine();

            System.out.print("Salário: ");
            double salario = scan.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));
        }

        scan.nextLine();
        System.out.println("Informe o ID do funcionário vai ter aumento?");
        int id = scan.nextInt();

        Funcionario funcSalario = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (funcSalario == null) {
            System.out.println("Este funcionário não está cadastrado!");
        } else {
            System.out.println("Qual é a porcentagem de aumento no salário?");
            funcSalario.aumentoSalario(scan.nextDouble());
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario x : funcionarios) {
            System.out.println(x.toString());
        }

        scan.close();
    }

    private static boolean existeId(List<Funcionario> funcionarios, int id) {
        Funcionario funcionario = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }
}
