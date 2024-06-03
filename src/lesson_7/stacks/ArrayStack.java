package lesson_7.stacks;

import java.util.EmptyStackException;

public class ArrayStack<T> implements MyStack<T>{
    public static final int INITIAL_SIZE = 10;
    public static final int GROWTH_FACTOR = 2;
    private T[] data;
    private int size;
    // size = 5
    // 1, 2, 3, 4, 5
    // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0

    public ArrayStack() {
        data = (T[]) new Object[INITIAL_SIZE];
    }

    @Override
    public void push(T elem) {
        if (size == data.length) {
            T[] temp = (T[]) new Object[data.length * GROWTH_FACTOR];
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[size] = elem;
        size++;
    }

    @Override
    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return data[--size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return data[size - 1];
    }
}
