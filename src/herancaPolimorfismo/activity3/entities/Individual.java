package herancaPolimorfismo.activity3.entities;

public class Individual extends TaxPayer {

    private Double healthExpeditures;


    public Individual(String name, Double anualIncome, Double healthExpeditures) {
        super(name, anualIncome);
        this.healthExpeditures = healthExpeditures;
    }


    @Override
    public Double tax() {
        if (anualIncome < 20000) {
            return  (anualIncome * 0.15) - (healthExpeditures * 0.5);
        } else {
            return  (anualIncome * 0.25) - (healthExpeditures * 0.5);
        }
    }
}
