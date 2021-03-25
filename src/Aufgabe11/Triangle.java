package Aufgabe11;

public class Triangle {

    public Triangle() {
        super();
    }

    public static Double calcPerimeter(Double a, Double b, Double c) {
        return a + b + c;
    }

    public static Double calcArea(Double height, Double flat) {
        return (height * flat) / 2;
    }
}
