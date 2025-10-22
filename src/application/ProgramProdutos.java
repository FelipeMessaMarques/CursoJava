package application;

import entities.Produtos;
import java.util.Scanner;

public class ProgramProdutos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Produtos produto = new Produtos();

        System.out.println("Informe os dados do produto");

        System.out.print("Nome: ");
        produto.nome = scan.nextLine();

        System.out.print("Preco: ");
        produto.preco = scan.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = scan.nextInt();

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
