package lesson_1;

public class Teacher extends Person {
    public Teacher(int age) {
        super(age);
    }

    @Override
    public void presentYourself() {
        System.out.println("Hello from teacher class");
    }
}
