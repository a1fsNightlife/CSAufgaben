package Aufgabe9;

import java.awt.*;

public class Punkt {

    private Integer pointX;
    private Integer pointY;

    public Punkt(Integer pointX, Integer pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public static Punkt addPoint(Integer pointX, Integer pointY) {
        return new Punkt(pointX, pointY);
    }

    public Integer getPointX() {
        return pointX;
    }

    public void setPointX(Integer pointX) {
        this.pointX = pointX;
    }

    public Integer getPointY() {
        return pointY;
    }

    public void setPointY(Integer pointY) {
        this.pointY = pointY;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}
