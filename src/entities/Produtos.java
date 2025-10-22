package entities;

public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

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
