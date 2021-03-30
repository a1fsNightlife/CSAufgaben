package Test;

import Aufgabe18.PersonHash;
import Aufgabe19.Person;
import Aufgabe19.PersonAgeComparator;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class HashKeyTest {

    @Test
    public void shouldHashcode() {
        PersonHash max = new PersonHash("Max");
        PersonHash max2 = new PersonHash("Max2");

        HashMap<PersonHash, Integer> hashMap = new HashMap<>();

        hashMap.put(max, 1234);
        hashMap.put(max2, 4321);

        System.out.println(hashMap.get(max).hashCode());
        System.out.println(max.hashCode());

        assertEquals(1234, hashMap.get(max).hashCode());
        assertEquals(4321, hashMap.get(max2).hashCode());
    }

    @Test
    public void shouldComparePersons() {
        Person p1 = new Person("Jimmy", 12);
        Person p2 = new Person("Tommy", 11);
        Integer expected = 0;
        Integer result = p1.compareTo(p2);

        assertEquals(expected, result);

        Person p3 = new Person("p1", 8);
        expected = 1;
        result = p1.compareTo(p3);

        assertEquals(expected, result);

        //compareAge
        PersonAgeComparator pa1 = new PersonAgeComparator();
        expected = 1;
        result = p1.compareTo(p2);

        assertEquals(expected, result);
    }
}
