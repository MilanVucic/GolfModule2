package lesson_4;

import lesson_4.list.MyArrayList;
import lesson_4.list.MyLinkedList;
import lesson_4.list.MyList;
import lesson_4.weight.CargoShip;
import lesson_4.weight.Fruit;
import lesson_4.weight.FruitCart;
import lesson_4.weight.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Milan", 85);
        Fruit fruit1 = new Fruit("Apple", 0.3);
        Fruit fruit2 = new Fruit("Orange", 0.5);
        Fruit fruit3 = new Fruit("Apple", 0.4);
        FruitCart fruitCart = new FruitCart();
        fruitCart.addFruit(fruit1);
        fruitCart.addFruit(fruit2);
        fruitCart.addFruit(fruit3);
        CargoShip ship = new CargoShip("SS Fruity", 5000000);
        ship.add(fruitCart);
        ship.add(p);
        ship.add(new Fruit("Watermelon", 2));
    }

    private static void listExample() {
        MyList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
