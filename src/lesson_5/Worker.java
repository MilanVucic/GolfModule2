package lesson_5;

public class Worker extends Person implements Comparable<Worker>{
    public Worker(String name, int age) {
        super(name, age);
    }

    public void workerMethod() {
        System.out.println("Worker method!");
    }

    @Override
    public int compareTo(Worker o) {
        return Integer.compare(getAge(), o.getAge());
    }
}
