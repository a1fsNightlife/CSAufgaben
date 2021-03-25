package Aufgabe11;

import java.awt.*;

public abstract class GeometricForm {

    public Double perimeter;
    public Double area;
    public abstract Double calcArea();
    public abstract Double calcPerimeter();

    public GeometricForm(Double perimeter, Double area) {
        this.perimeter = perimeter;
        this.area = area;
    }
}
