package lesson_4.weight;

public class Fruit implements HasWeight{
    private String type;
    private double weight;

    public Fruit(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
