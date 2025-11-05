package orientacao_objetos.examples.entities;

public class Grades {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public String passed;
    public double missing;

    public double finalGrade() {
       return grade1 + grade2 + grade3;
    }

    public String passed() {
        if (finalGrade() > 60) {
            passed = "Passed";
        }
        return "Final grade: " + finalGrade() + "\n" + passed;
    }

    public String failed() {
        if (finalGrade() < 60) {
            missing = 60 - finalGrade();
        }
        return "Final grade: " + finalGrade() + "\nFailed\nMissing " + missing + " points";
    }

}
