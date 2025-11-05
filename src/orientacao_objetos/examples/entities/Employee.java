package orientacao_objetos.examples.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - (tax / 100) * grossSalary;
    }

    public void increaseSalary(double percentage) {
        grossSalary += (percentage / 100) * grossSalary;
    }
}
