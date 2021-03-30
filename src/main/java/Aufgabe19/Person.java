package Aufgabe19;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private Integer age;



    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public boolean isGreater(Person p) {
        return this.name.length() > p.name.length();
    }

    public boolean isSmaller(Person p) {
        return this.name.length() < p.name.length();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(Person p) {
        if(this.isGreater(p)) {
            return 1;
        } else if(this.isSmaller(p)) {
            return -1;
        } else {
            return 0;
        }
    }
}
