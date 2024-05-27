package lesson_6;

public class PrintHelper {
    private String prefix;

    public PrintHelper(String prefix) {
        this.prefix = prefix;
    }

    public void print(String param) {
        System.out.println(prefix + param);
    }
}
