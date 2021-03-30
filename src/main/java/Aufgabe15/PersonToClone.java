package Aufgabe15;

import java.util.Objects;

public class PersonToClone implements Cloneable {

    public Integer age;
    public String fristName;
    public String lastName;
    public Integer heightInCm;
    public Integer weightInKg;

    public PersonToClone(Integer age, String fristName, String lastName, Integer heightInCm, Integer weightInKg) {
        this.age = age;
        this.fristName = fristName;
        this.lastName = lastName;
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
    }

    public static Boolean compareAge(Integer age1, Integer age2) {
        return age1 == age2;
    }

    public static Boolean compareFirstName(String firstName1, String firstName2) {
        return firstName1.equals(firstName2);
    }

    public static Boolean compareLastName(String lastName1, String lastName2) {
        return lastName1.equals(lastName2);
    }

    public static Boolean compareHeight(Integer height1, Integer height2) {
        return height1.equals(height2);
    }

    public static Boolean compareWeight(Integer weight1, Integer weight2) {
        return weight1.equals(weight2);
    }

    public static Boolean comparePerson(PersonToClone personToClone1, PersonToClone personToClone2) {
        return personToClone1.equals(personToClone2);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonToClone personToClone = (PersonToClone) o;
        return age.equals(personToClone.age) && fristName.equals(personToClone.fristName) && lastName.equals(personToClone.lastName) && heightInCm.equals(personToClone.heightInCm) && weightInKg.equals(personToClone.weightInKg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, fristName, lastName, heightInCm, weightInKg);
    }
}
