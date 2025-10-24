package atividades. classe.entities;

public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public Produtos(){

    }

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    };

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidade = 0;
    };
    public double totalValorEstoque() {
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return  "\nDados do produto:\n"
                + nome
                + "\n$ "
                + String.format("%.2f", preco)
                + "\n"
                + quantidade
                + " unidades\nTotal: $ "
                + String.format("%.2f", totalValorEstoque());
    }

}
