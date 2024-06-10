package lesson_10;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        printAllFiles(new File("C:\\Users\\vucic\\IdeaProjects\\GolfModule2"));
    }

    public static void printAllFiles(File dir) {
        // Give me all the files in this directory
        for (File file : dir.listFiles()) {
            // If this
            if (file.isDirectory()) {
                printAllFiles(file);
            }
            else {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    private static void methodA() {
        System.out.println("...");
        methodA();
    }

    private static void methodB() {
        methodC();
    }

    private static void methodC() {
        System.out.println();
    }

    public static void recursionExample(int count) {
        if (count == 0) {
            return;
        }
        System.out.println("Hello from recursion!" + count);
        recursionExample(count - 1);
    }
}
