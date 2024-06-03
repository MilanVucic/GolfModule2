package lesson_7.stacks;

import java.util.EmptyStackException;

public class ListStack<T> implements MyStack<T> {
    // top -> 5
    // add 10, top -> 10 -> 5
    // add 3, top 3 -> 10 -> 5
    private Node<T> top;

    @Override
    public void push(T elem) {
        Node<T> newNode = new Node<>(elem);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T elem = top.value;
        top = top.next;
        return elem;
    }

    @Override
    public int size() {
        int size = 0;
        Node<T> temp = top;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    @Override
    public T peek() {
        T elem = top.value;
        if (elem == null) {
            throw new EmptyStackException();
        }
        return elem;
    }

    public static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}