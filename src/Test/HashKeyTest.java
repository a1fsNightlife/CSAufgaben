package Test;

import Aufgabe13.Person;
import Aufgabe18.PersonHash;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class HashKeyTest {

    @Test
    public void hashcode() {
        PersonHash max = new PersonHash("Max");
        PersonHash max2 = new PersonHash("Max2");

        HashMap<PersonHash, Integer> hashMap = new HashMap<>();

        hashMap.put(max, 1234);
        hashMap.put(max2, 4321);

        assertEquals(1234, hashMap.get(max).hashCode());
        assertEquals(4321, hashMap.get(max2).hashCode());
    }
}
