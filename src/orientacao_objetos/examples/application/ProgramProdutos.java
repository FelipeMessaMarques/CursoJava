package orientacao_objetos.examples.application;

import orientacao_objetos.examples.entities.Produtos;
import java.util.Scanner;

public class ProgramProdutos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Info iniciais do produto
        System.out.println("Informe os dados do produto");

        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Preco: ");
        double preco = scan.nextDouble();

        // Declarando objeto
        Produtos produto = new Produtos(nome, preco);

        // Info de entrada e saída de estoque
        System.out.println(produto);
        System.out.print("\nInforme a quantidade que deseja adicionar ao estoque: ");
        int quantidade = scan.nextInt();
        produto.addProdutos(quantidade);

        System.out.println(produto);
        System.out.print("\nInforme a quantidade que deseja retirar do estoque: ");
        quantidade = scan.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println(produto);

        scan.close();
    }
}
