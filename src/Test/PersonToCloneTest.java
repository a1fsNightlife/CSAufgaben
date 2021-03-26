package Test;

import Aufgabe13.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonToCloneTest {

    @Test
    public void shouldCompareAge() {
        Integer age1 = 15;
        Integer age2 = 14;
        Boolean expected = false;
        Boolean result = Person.compareAge(age1, age2);

        assertEquals(expected, result);
    }

    @Test
    public void shouldCompareFirstName() {
        String firstName1 = "Jakob";
        String firstName2 = "Not Jakob";
        Boolean expected = false;
        Boolean result = Person.compareFirstName(firstName1, firstName2);

        assertEquals(expected, result);
    }

    @Test
    public void shouldCompareLastName() {
        String lastName1 = "Nopens";
        String lastName2 = "Nopens";
        Boolean expected = true;
        Boolean result = Person.compareLastName(lastName1, lastName2);

        assertEquals(expected, result);
    }

    @Test
    public void shouldCompareHeight() {
        Integer height1 = 128;
        Integer height2 = 128;
        Boolean expected = true;
        Boolean result = Person.compareHeight(height1, height2);
        assertEquals(expected, result);
    }

    @Test
    public void shouldCompareWeight() {
        Integer weight1 = 127;
        Integer weight2 = 127;
        Boolean expected = true;
        Boolean result = Person.compareWeight(weight1, weight2);

        assertEquals(expected, result);
    }

    @Test
    public void shouldComparePerson() {
        Person person1 = new Person(20, "Jakob", "Nopens", 175, 62);
        Person person2 = new Person(20, "Jakob", "Nopens", 175, 62);
        Boolean expected = true;
        Boolean result = Person.comparePerson(person1, person2);

        assertEquals(expected, result);
    }
}
