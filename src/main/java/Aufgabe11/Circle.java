package Aufgabe11;

import Aufgabe9.Punkt;

public class Circle extends GeometricForm {
    private final Double radius;
    //private final Double middlePoint;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calcPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

    @Override
    public Double calcArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public Double getRadius() {
        return radius;
    }


}
