package herancaPolimorfismo.abstract1.activity2.entities;

import herancaPolimorfismo.abstract1.activity2.entities.enums.Color;

public class Circle extends Shape{

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
