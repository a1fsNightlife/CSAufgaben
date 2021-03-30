package Test;

import Aufgabe9.Punkt;
import org.junit.Test;
import static org.junit.Assert.*;

public class PunkTest {

    public final static Double DELTA = 0.001;

    @Test
    public void shouldAddPointCorrectly() {
        Punkt punkt1 = new Punkt(5.0, DELTA);
        Punkt punkt2 = new Punkt(4.0, DELTA);
        Punkt expected = new Punkt(9.0, DELTA);
        Punkt result = Punkt.addPunkt(punkt1, punkt2);

        assertEquals(expected.getPointX(), result.getPointX(), DELTA);
        assertEquals(expected.getPointY(), result.getPointY(), DELTA);
    }

    @Test
    public void shouldSubtractCorrectly() {
        Punkt punkt1 = new Punkt(5.0, 10.0);
        Punkt punkt2 = new Punkt(4.0, 9.0);
        Punkt expected = new Punkt(1.0, 1.0);
        Punkt result = Punkt.subtractPunkt(punkt1, punkt2);

        assertEquals(expected.getPointX(), result.getPointX(), DELTA);
        assertEquals(expected.getPointY(), result.getPointY(), DELTA);
    }

    @Test
    public void shouldMultiplyCorrectly() {
        Punkt punkt1 = new Punkt(8.0, 2.0);
        Punkt punkt2 = new Punkt(4.0, 9.0);
        Punkt expected = new Punkt(32.00, 18.00);
        Punkt result = Punkt.multiplyPunkt(punkt1, punkt2);

        assertEquals(expected.getPointX(), result.getPointX(), DELTA);
        assertEquals(expected.getPointY(), result.getPointY(), DELTA);
    }

    @Test
    public void shouldDivideCorrectly() {
        Punkt punkt1 = new Punkt(8.0, 9.0);
        Punkt punkt2 = new Punkt(4.0, 9.0);
        Punkt expected = new Punkt(2.00, 1.0);
        Punkt result = Punkt.dividePunkt(punkt1, punkt2);

        assertEquals(expected.getPointX(), result.getPointX(), DELTA);
        assertEquals(expected.getPointY(), result.getPointY(), DELTA);
    }
}
