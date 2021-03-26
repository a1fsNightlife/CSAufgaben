package Test;

import Aufgabe11.GeometricForm;

public class RectangleTest extends GeometricForm {

    public Double sideA;
    public Double sideB;

    public RectangleTest(Double perimeter, Double area, Double sideA, Double sideB) {
        //super(perimeter, area);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public Double calcArea() {
        return null;
    }

    @Override
    public Double calcPerimeter() {
        return null;
    }
}
