package lesson_4.list;

public interface MyList<T> {
    // Used to keep an indexed collection of data of the same type
    int size();
    void add(T element);
    void add(T element, int index);
    T get(int index);
    int indexOf(T element);
    int lastIndexOf(T element);
    boolean contains(T element);
    void removeAt(int index);
}
