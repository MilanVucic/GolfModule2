package lesson_4.weight;

public class Person implements HasWeight{
    private String name;
    private double weight;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
