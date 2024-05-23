package lesson_5.priority_queue;

public interface MyPriorityQueue<T extends HasPriority> {
    void enqueue(T item);
    T deque();
    int size();
}
