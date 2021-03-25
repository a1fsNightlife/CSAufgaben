package Test;

import Aufgabe11.Triangle;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    public static final Double DELTA = 0.001;

    @Test
    public void shouldCalcHeight() {

    }

    @Test
    public void shouldCalcPerimeter() {
        Double a = 10.0;
        Double b = 7.0;
        Double c = 4.0;
        Double expected = 21.0;
        Double result = Triangle.calcPerimeter(a, b, c);

        assertEquals(expected, result, DELTA);
    }

    @Test
    public void shouldCalcArea() {
        Double height = 7.0;
        Double flat = 5.0;
        Double expected = 17.5;
        Double result = Triangle.calcArea(height, flat);

        assertEquals(expected, result);
    }
}
