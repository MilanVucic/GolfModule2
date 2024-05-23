package lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Example<T, M> {
    T parameter1;
    M parameter2;
    List<T> aListOfStuff;
    T[] array;

    public Example() {
        aListOfStuff = new ArrayList<>();
        array = (T[]) new Object[50];

    }

    public T getParameter1() {
        return parameter1;
    }

    public void calculateSomeStuff(T param1, M param2) {

    }
}
