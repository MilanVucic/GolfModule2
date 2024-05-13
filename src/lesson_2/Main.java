package lesson_2;

import lesson_2.shapes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("#ffaa13", 5));
        shapes.add(new Rectangle("#00bb1f", 5, 10));
        shapes.add(new Square("#abcd13", 5));
        shapes.add(new Triangle("#a1aa44", 10, 12, 14));

        short a = 30;
        short b = 50;

        sum(5,4);
        sum(a, b);
        long l1 = 5l;
        long l2 = 10l;
        printStrings("asdasd", "asdjasjdj");
        printStrings("asdasd", "asdjasjdj", "Milan");
    }

    private static void printStrings(String special, String a, String... arguments) {
        for (String argument : arguments) {
            System.out.println(argument);
        }
    }

    private static int sum(int a, int b) {
        System.out.println("Integer");
        return a + b;
    }

    private static double sum(double a, double b) {
        System.out.println("Double");
        return a + b;
    }
}
