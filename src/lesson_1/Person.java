package lesson_1;

public class Person {
    private String name;
    private int age;
    protected double height;
    double example;

    public Person(int age) {
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void presentYourself() {
        System.out.println("Hello from person class");
    }
}
