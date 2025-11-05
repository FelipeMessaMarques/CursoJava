package composicao.entities;

import composicao.entities.enums.NivelTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalho nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador() {}

    public Trabalhador(String nome, Double salarioBase, NivelTrabalho nivel, Departamento departamento) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    //Métodos
    public void addContrato(ContratoHora contrato) {
        this.contratos.add(contrato);
    }

    public void removeContrato(ContratoHora contrato) {
        this.contratos.remove(contrato);
    }

    public double recebidos(int ano, int mes) {
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (ContratoHora c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                sum += c.valorTotal();
            }
        }
        return sum;
    }
}
