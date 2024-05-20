package lesson_4.list;

public class MyArrayList<T> implements MyList<T>{
    private static final int INITIAL_SIZE = 10;
    public static final int GROWTH_FACTOR = 2;
    private T[] elements;
    private int size;

    public MyArrayList() {
        elements = (T[]) new Object[INITIAL_SIZE]; // new T[10]
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T element) {
        ensureEnoughSpace();
        // size = 0
        // elements[0] = element; AND size increases to 1 AFTERWARDS
        elements[size++] = element;
    }

    private void ensureEnoughSpace() {
        if (size == elements.length) {
            T[] newArray =  (T[]) new Object[elements.length * GROWTH_FACTOR];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
    }

    @Override
    public void add(T element, int index) {

    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public int lastIndexOf(T element) {
        return 0;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public void removeAt(int index) {

    }
}
