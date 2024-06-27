package lesson_15;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
    }

}
