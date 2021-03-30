package Test;

import Aufgabe14.ArrayWrapper;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayWrapperTest {

    @Test
    public void shouldAddElementToArray() {
        Integer[] intArray = new Integer[] {1, 2, 3};
        Integer integerToAdd = 5;
        ArrayWrapper arrayWrapper = new ArrayWrapper(intArray);
        Integer[] expected = new Integer[] {1, 2, 3, 5, null, null};
        Integer[] result = arrayWrapper.addElementToArray(integerToAdd);

        assertEquals(expected, result);
    }

    @Test
    public void shouldAddEmlementsToArray() {
        Integer[] intArray = new Integer[] {1, 2, 3};
        Integer[] integersToAdd = new Integer[] {5, 6, 7};
        ArrayWrapper aw = new ArrayWrapper(intArray);
        Integer[] expected = new Integer[] {1, 2, 3, 5, 6, 7};
        Integer[] result = aw.addElementsToArray(integersToAdd);

        assertEquals(expected, result);
    }
}
