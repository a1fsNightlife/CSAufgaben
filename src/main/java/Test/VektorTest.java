package Test;

import Aufgabe10.Vektor;
import org.junit.Test;
import static org.junit.Assert.*;

public class VektorTest {

    private static final double DELTA = 0.001;

    @Test
    public void shouldAdditionCorrectly() {
        Vektor vektor1 = new Vektor(10.0, 20.0, 25.0);
        Vektor vektor2 = new Vektor(5.0, 30.0, 45.0);
        Vektor expected = new Vektor(15.0, 50.0, 70.0);
        Vektor result = Vektor.additionVektor(vektor1, vektor2);

        assertEquals(expected.getX(), result.getX(), DELTA);
        assertEquals(expected.getY(), result.getY(), DELTA);
        assertEquals(expected.getZ(), result.getZ(), DELTA);
    }

    @Test
    public void shouldSubtractCorrectly() {
        Vektor vektor1 = new Vektor(25.0, 50.0, 2.0);
        Vektor vektor2 = new Vektor(4.0, 5.0, 1.0);
        Vektor expected = new Vektor(21.0, 45.0, 1.0);
        Vektor result = Vektor.subtractVektor(vektor1, vektor2);

        assertEquals(expected.getX(), result.getX(), DELTA);
        assertEquals(expected.getY(), result.getY(), DELTA);
        assertEquals(expected.getZ(), result.getZ(), DELTA);
    }

    @Test
    public void shouldCalcCrossProductCorrectly() {
        Vektor vektor1 = new Vektor(25.0, 50.0, 2.0);
        Vektor vektor2 = new Vektor(4.0, 5.0, 1.0);
        Vektor expected = new Vektor(40.0, -17.0, -75.0);
        Vektor result = Vektor.crossProductOfVektors(vektor1, vektor2);

        assertEquals(expected.getX(), result.getX(), DELTA);
        assertEquals(expected.getY(), result.getY(), DELTA);
        assertEquals(expected.getZ(), result.getZ(), DELTA);
    }

    @Test
    public void shouldMultiplyWithScalar() {
        Vektor vektor = new Vektor(25.0, 50.0, 34.0);
        Double scalar = 17.0;
        Vektor expected = new Vektor(425.0, 850.0, 578.0);
        Vektor result = Vektor.multiplyVektorWithScalar(vektor, scalar);

        assertEquals(expected.getX(), result.getX(), DELTA);
        assertEquals(expected.getY(), result.getY(), DELTA);
        assertEquals(expected.getZ(), result.getZ(), DELTA);
    }

    @Test
    public void shouldDivideWithScalar() {
        Vektor vektor = new Vektor(25.0, 50.0, 34.0);
        Double scalar = 5.0;
        Vektor expected = new Vektor(5.0, 10.0, 6.8);
        Vektor result = Vektor.divideVektorWithScalar(vektor, scalar);

        assertEquals(expected.getX(), result.getX(), DELTA);
        assertEquals(expected.getY(), result.getY(), DELTA);
        assertEquals(expected.getZ(), result.getZ(), DELTA);
    }
}
