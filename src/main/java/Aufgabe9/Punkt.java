package Aufgabe9;

import java.awt.*;

public class Punkt {

    private Double pointX;
    private Double pointY;

    public Punkt(Double pointX, Double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public static Punkt addPunkt(Punkt punkt1, Punkt punkt2) {
        Double resultX = punkt1.getPointX() + punkt2.getPointX();
        Double resultY = punkt1.getPointY() + punkt2.getPointY();
        return new Punkt(resultX, resultY);
    }

    public static Punkt subtractPunkt(Punkt punkt1, Punkt punkt2) {
        Double resultX = punkt1.getPointX() - punkt2.getPointX();
        Double resultY = punkt1.getPointY() - punkt2.getPointY();
        return new Punkt(resultX, resultY);
    }

    public static Punkt multiplyPunkt(Punkt punkt1, Punkt punkt2) {
        Double resultX = punkt1.getPointX() * punkt2.getPointX();
        Double resultY = punkt1.getPointY() * punkt2.getPointY();
        return new Punkt(resultX, resultY);
    }

    public static Punkt dividePunkt(Punkt punkt1, Punkt punkt2) {
        Double resultX = punkt1.getPointX() / punkt2.getPointX();
        Double resultY = punkt1.getPointY() / punkt2.getPointY();
        return new Punkt(resultX, resultY);
    }

    public Double getPointX() {
        return pointX;
    }

    public Double getPointY() {
        return pointY;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}
