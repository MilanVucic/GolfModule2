package lesson_5.priority_queue;

public class Task implements HasPriority{
    private String name;
    private String description;
    private int priority;

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return name;
    }
}
