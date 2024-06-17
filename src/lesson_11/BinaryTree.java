package lesson_11;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public void add(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            add(value, root);
        }
    }

    // TODO Implement finding the biggest (+smallest element)
    public T getMax() {
        return null;
    }
    // TODO Implement finding the tree height
    public int getHeight() {
        return -1;
    }

    // TODO Print all the elements in ascending (or descending) order
    public void printElementsInOrder() {

    }

    public boolean contains(T value) {
        return contains(value, root);
    }

    private boolean contains(T value, Node<T> current) {
        if (current == null) {
            return false;
        }
        if (current.value.compareTo(value) == 0) {
            return true;
        }
        if (current.value.compareTo(value) > 0) {
            return contains(value, current.left);
        } else {
            return contains(value, current.right);
        }
    }

    private void add(T value, Node<T> current) {
        Node<T> newNode = new Node<>(value);
        if (current.value.compareTo(value) > 0) {
            if (current.left == null) {
                current.left = newNode;
            } else {
                add(value, current.left);
            }
        } else {
            if (current.right == null) {
                current.right = newNode;
            } else {
                add(value, current.right);
            }
        }
    }

    private static class Node<T extends Comparable<T>> {
        private T value;
        private Node<T> left;
        private Node<T> right;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
