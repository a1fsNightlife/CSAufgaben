package Aufgabe15;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy <T extends PersonToClone> {
    public T person;

    public ShallowCopy(T person) {
        this.person = person;
    }

    public PersonToClone copyPerson() {
        PersonToClone clonedPerson = null;
        try {
            clonedPerson = (PersonToClone) getPerson().clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonedPerson;
    }

    public List<PersonToClone> copyPersonMultipleTimes(Integer numberOfCopies) {
        List<PersonToClone> result = new ArrayList<>();
        for(int i = 0; i < numberOfCopies; i++) {
            result.add(copyPerson());
        }

        return result;
    }

    public T getPerson() {
        return person;
    }

    public void setPerson(T person) {
        this.person = person;
    }



}
