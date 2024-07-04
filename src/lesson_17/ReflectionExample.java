package lesson_17;

public class ReflectionExample {
    public static String c;
    private int a;
    public final String b = "asd";

    public ReflectionExample(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    private void method1(String param) {
        System.out.println("String only version of method 1." + a + param);
    }

    private void method1(String param, int asd) {
        System.out.println("another version of method 1." + a + param);
    }

    protected <T> String method2(int a, T b) {
        return null;
    }

    private static void method3() {

    }
}
