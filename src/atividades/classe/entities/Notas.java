package entities;

public class Notas {

    public String nome;
    public double n1;
    public double n2;
    public double n3;
    public String passou;
    public double reprovou;

    public double notaFinal() {
       return n1 + n2 + n3;
    }

    public String passou() {
        if (notaFinal() > 60) {
            passou = "Passou";
        }
        return "Nota final " + notaFinal() + "\n" + passou;
    }

    public String reprovou() {
        if (notaFinal() < 60) {
            reprovou = 60 - notaFinal();
        }
        return "Nota final: " + notaFinal() + "\nReprovou\nFaltou " + reprovou + " pontos";
    }

}
