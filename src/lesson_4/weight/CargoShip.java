package lesson_4.weight;

import java.util.ArrayList;
import java.util.List;

public class CargoShip {
    private String name;
    private double carryingCapacity;
    private List<HasWeight> items;

    public CargoShip(String name, double carryingCapacity) {
        this.name = name;
        this.carryingCapacity = carryingCapacity;
        this.items = new ArrayList<>();
    }

    public void add(HasWeight item) {
        if (item.getWeight() + getWeight() > carryingCapacity) {
            throw new LoadTooMuchException();
        }
        items.add(item);
    }

    public double getWeight() {
        double weight = 0;
        for (HasWeight item : items) {
            weight += item.getWeight();
        }
        return weight;
    }
}
