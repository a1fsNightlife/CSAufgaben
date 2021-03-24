package Test;

import Aufgabe9.Punkt;
import org.junit.Test;

import java.awt.*;
import java.util.Random;

import static org.junit.Assert.*;

public class PunkTest {

    @Test
    public void shouldAddPointCorrectly() {
        Integer pointX = 5;
        Integer pointY = 10;
        Punkt expectedPoint = Punkt.addPoint(pointX, pointY);
        Point actualPoint = new Point(pointX, pointY);
        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void shouldSubtractCorrectly() {

    }

    @Test
    public void shouldMultiplyCorrectly() {

    }

    @Test
    public void shouldDivideCorrectly() {

    }
}
