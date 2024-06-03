package lesson_7;

import lesson_7.stacks.ArrayStack;
import lesson_7.stacks.ListStack;
import lesson_7.stacks.MyStack;

public class Main {
    public static void main(String[] args) {
        RandomClass.Builder builder = new RandomClass.Builder();
        builder.setA(10)
                .setB(50)
                .setC("Something")
                .setD(5.13);
        // builder.setTitle("WARNING")
        // .setMessage("...")
        // .setDuration(5)
        // .setColor(BLUE).build()
        RandomClass instance = builder.build();
    }

    private static void stackExample() {
        MyStack<Integer> myStack = new ListStack<>();
        myStack.push(5);
        myStack.push(10);
        myStack.push(11);
        myStack.push(50);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

    private static void switchExample() {
        int input = 5;
        int result = switch (input) {
            case 0 -> 10;
            case 1 -> 20;
            default -> 500;
        };
        MessageStatus status = MessageStatus.SENT;
        String message = switch (status) {
            case DELIVERED, SENT -> {
                System.out.println("....");
                yield "Message is gone";
            }
            case READ -> "Message is read";
        };
    }

    private static void instanceOfAndCasting() {
        Parent p = new Child();

        if (p instanceof Child) {
            Child c = (Child) p;
        }

        if (p instanceof Child child) {

        }
    }

    private static void primitivesCasting() {
        double b = 5.4;
        int a = (int) b;
        long aLong = (long) a; // 10
        int int1 = (int) aLong;
    }

    private static void instanceOfExample() {
        Parent p = new Child();
        Parent p1 = new Parent();
        System.out.println(p instanceof Child);
        System.out.println(p instanceof Parent);
        System.out.println(p1 instanceof Parent);
        System.out.println(p1 instanceof Child);
        System.out.println(p instanceof ExampleInt);
        System.out.println(p1 instanceof ExampleInt);
        // Student extends Person, and Person can walk
        // can a student walk, can a person walk
    }
}
