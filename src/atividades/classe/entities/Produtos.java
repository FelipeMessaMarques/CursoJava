package atividades. classe.entities;

public class Produtos {

    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(){}

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

    // Set e Get
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
     this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Métodos
    public double totalValorEstoque() {
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) { this.quantidade += quantidade; }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return  "\nDados do produto:\n"
                + getNome()
                + "\n$ "
                + String.format("%.2f", getPreco())
                + "\n"
                + getQuantidade()
                + " unidades\nTotal: $ "
                + String.format("%.2f", totalValorEstoque());
    }

}
