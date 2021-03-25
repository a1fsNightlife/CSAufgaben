package Aufgabe11;

public abstract class GeometricForm {

    private Double perimeter;
    private Double area;
    public abstract Double calcPerimeter();
    public abstract Double calcArea();

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
