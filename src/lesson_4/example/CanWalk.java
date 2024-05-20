package lesson_4.example;

public interface CanWalk {
    void walk(double speed);
    default void run(double speed) {
        walk(2 * speed);
    }
}
