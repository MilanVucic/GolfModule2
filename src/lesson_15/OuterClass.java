package lesson_15;

public class OuterClass {
    private static int something = 500;

    private int a;
    public void createInner() {
        InnerClass ic = new InnerClass();
    }

    private static void methodExample() {
        System.out.println("...");
    }

    public class InnerClass {
        private int a;

        public void example() {
            OuterClass.this.a = 50;
            this.a = 510;
        }
    }

    public static class NestedClass {
        void method() {
            methodExample();
            something = 500312;

        }
    }
}
