package lesson_7.stacks;

public interface MyStack<T> {
    // LIFO data structure meaning Last In First Out (opposite of FIFO)
    void push(T elem); // Add item on stack
    T pop(); // returns an element from the top
    int size();
    T peek(); // returns an element from the top WITHOUT removing it from stack
}
