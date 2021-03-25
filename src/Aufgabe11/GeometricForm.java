package Aufgabe11;

public abstract class GeometricForm {

    public Double perimeter;
    public Double area;
    public abstract Double calcPerimeter();
    public abstract Double calcArea();

    public GeometricForm(Double perimeter, Double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
