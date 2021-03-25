package Test;

import Aufgabe11.Circle;
import Aufgabe11.GeometricForm;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    public static final Double DELTA = 0.001;

    @Test
    public void shouldCalcPerimeter() {
        Double radius = 5.0;
        Double expected = 31.415926535;
        //Double result = Circle.calcPerimeter();

        //assertEquals(expected, result, DELTA);
    }

    @Test
    public void shouldCalcArea() {
        Double radius = 5.0;
        Double expected = 78.5398163375;
        //Double result = Circle.calcArea();

        //assertEquals(expected, result, DELTA);
    }
}
