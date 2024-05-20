package lesson_4.list;

public class MyLinkedList<T> implements MyList<T>{
    private Node<T> head;
    private Node<T> tail;

    @Override
    public int size() {
        Node<T> temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // head == null, tail == null
    // head = NEW, tail = NEW

    // head -> 1 -> 2 -> 5 -> 10... -> 100 <- TAIL
    @Override
    public void add(T element) {
        Node<T> elem = new Node<>(element);
        if (tail == null) {
            head = elem;
        } else {
            tail.next = elem;
        }
        tail = elem;
    }

    @Override
    public void add(T element, int index) {

    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index " + index);
        }
        Node<T> temp = head;
        int currentIndex = 0;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.value;
            }
            currentIndex++;
            temp = temp.next;
        }
        return null;
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
