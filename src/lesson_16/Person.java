package lesson_16;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private String name;
    private int age;
    private boolean isUnderage = false;
    private double height = 188.5;
    private Address address = new Address();
    private List<Integer> grades;
    private List<PhoneNumber> phoneNumbers;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + height;
    }
}
