package lesson_4.example;

public interface Int1 {
    void method1();
    void method2();
    void method3();
    default void method505() {
        System.out.println("Default implementation");
    }
}
