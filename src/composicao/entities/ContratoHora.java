package composicao.entities;

import java.util.Date;

public class ContratoHora {

    private Date data;
    private Double valorHora;
    private Integer horas;

    public ContratoHora() {}

    public ContratoHora(Date data, Double valorHora, Integer horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    //Getters e Setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    //Métodos
    public double valorTotal() {
        return valorHora * horas;
    }
}
