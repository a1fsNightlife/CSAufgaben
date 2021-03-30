package Aufgabe13;

import java.util.Objects;

public class Person {

    public Integer age;
    public String fristName;
    public String lastName;
    public Integer heightInCm;
    public Integer weightInKg;

    public Person(Integer age, String fristName, String lastName, Integer heightInCm, Integer weightInKg) {
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

    public static Boolean comparePerson(Person person1, Person person2) {
        return person1.equals(person2);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age.equals(person.age) && fristName.equals(person.fristName) && lastName.equals(person.lastName) && heightInCm.equals(person.heightInCm) && weightInKg.equals(person.weightInKg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, fristName, lastName, heightInCm, weightInKg);
    }
}
