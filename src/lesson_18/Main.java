package lesson_18;


import lesson_16.Person;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "320d", 2005, 500);
        Car car2 = new Car("Audi", "A5", 2012, 30000);

        System.out.println(LimitProcessor.checkLimits(car1));
        System.out.println(LimitProcessor.checkLimits(car2));
    }

    private static void stringify(Car car1, Car car2) {
        System.out.println(ToStringProcessor.stringify(car1));
        System.out.println(ToStringProcessor.stringify(car2));
        System.out.println(ToStringProcessor.stringify(new Person("Milan", 30, 199)));
    }

    @Deprecated
    public static void something() {

    }
}
