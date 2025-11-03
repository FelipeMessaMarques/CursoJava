package colecoes.listas.atividade1.entities;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(int id, String name, double salario) {
        this.id = id;
        this.nome = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public double aumentoSalario(double aumento) {
        return salario += (aumento / 100) * salario;
    }

    public String toString() {
        return getId() + ": " + getNome() + ", " + String.format("%.2f", getSalario());
    }
}
