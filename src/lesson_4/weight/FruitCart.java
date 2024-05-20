package lesson_4.weight;

import java.util.ArrayList;
import java.util.List;

public class FruitCart implements HasWeight{
    private List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit f) {
        fruits.add(f);
    }

    @Override
    public double getWeight() {
        double weight = 0;
        for (Fruit fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }
}
