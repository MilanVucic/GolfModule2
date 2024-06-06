package lesson_8;

public class Example {
    private int a = 50;
    private double b = a + 1;
    private String c = a + " " + b;
    static int staticA = 500;
    static double staticB = 500.5;
    static String staticC;

    static {
        staticC = "Value: " + staticA;
        System.out.println("Static init block called");
    }

    {
        c = "Default";
        System.out.println("Static init block called");
    }
}
