package entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - (imposto / 100) * salarioBruto;
    }

    public void aumento(double porcentagem) {
        salarioBruto += (porcentagem / 100) * salarioBruto;
    }
}
