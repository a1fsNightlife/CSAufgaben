package Test;

import Aufgabe11.Circle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    public static final Double DELTA = 0.001;
    private Circle circle;

    @Before
    public void setUp() {

    }

    @Test
    public void shouldCalcPerimeter() {
        Double expected = 31.415926535;
        Double result = circle.calcPerimeter();

        assertEquals(expected, result, DELTA);
    }

    @Test
    public void shouldCalcArea() {
        Double expected = 78.5398163375;
        Double result = circle.calcArea();

        assertEquals(expected, result, DELTA);
    }
}
