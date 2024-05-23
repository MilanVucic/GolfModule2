package lesson_5;

import lesson_5.priority_queue.*;

public class Main {
    public static void main(String[] args) {
        MyPriorityQueue<Task> queue = new MapPriorityQueue<>();
        queue.enqueue(new Task("Read the newspaper", "", 1));
        queue.enqueue(new Task("Wash the dishes", "", 3));
        queue.enqueue(new Task("Create a to-do list", "", 5));
        queue.enqueue(new Task("Get the dry cleaning", "", 3));
        queue.enqueue(new Task("Check fire alarm", "", 5));

        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
    }

    private static void genericsExamples() {
        Worker worker = new Worker("Milan", 30);
        Worker worker2 = new Worker("Milan", 33);
        PersonPrinter<Worker> personPrinter = new PersonPrinter<>(
                worker);
        personPrinter.print();
        System.out.println(compare(worker, worker2));

        SavingType<Person> savingType = new SavingType<>(Person.class);
        Person p = savingType.createNew();
    }

    public static <T extends Comparable<T>> int compare(T a, T b) {
        return a.compareTo(b);
    }

    public static <T, M> T example(T a, M b) {
        return a;
    }
}
