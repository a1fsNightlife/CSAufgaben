package Test;

import Aufgabe15.PersonToClone;
import Aufgabe15.ShallowCopy;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShallowCopyTest {

    @Test
    public void shouldCopyPerson() {
        PersonToClone person = new PersonToClone(5, "Tommy", "Müller", 100, 30);
        ShallowCopy sw = new ShallowCopy(person);
        PersonToClone expected = new PersonToClone(5,"Tommy", "Müller", 100, 30);
        PersonToClone result = sw.copyPerson();

        assertEquals(expected, result);
    }

    @Test
    public void shouldCopyPersonMultipleTimes() {
        PersonToClone person = new PersonToClone(5, "Tommy", "Müller", 100, 30);
        ShallowCopy sw = new ShallowCopy(person);
        Integer numberOfCopies = 3;
        List<PersonToClone> expected = new ArrayList<>();
        expected.add(new PersonToClone(5, "Tommy", "Müller", 100, 30));
        expected.add(new PersonToClone(5, "Tommy", "Müller", 100, 30));
        expected.add(new PersonToClone(5, "Tommy", "Müller", 100, 30));
        List<PersonToClone> result =  sw.copyPersonMultipleTimes(numberOfCopies);

        assertEquals(expected, result);
    }
}
