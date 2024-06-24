package lesson_13;

import java.util.Arrays;
import java.util.Random;

public class MultiThreadingExample {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 500000000;
        int[] elements = new int[ARRAY_SIZE];

        fillArray(elements);
        calculateSumWithoutThreads(elements);
        calculateSumWithThreads(elements);
    }

    private static void calculateSumWithThreads(int[] elements) {
        int numOfThreads = 8;
        int length = elements.length / numOfThreads;
        ArraySumThread[] threads = new ArraySumThread[numOfThreads];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numOfThreads; i++) {
            int start = i * length;
            int end;
            if (i == numOfThreads - 1) {
                end = elements.length;
            } else {
                end = (i + 1) * length;
            }
            threads[i] = new ArraySumThread(elements, start, end);
            threads[i].start();
        }

        long sum = 0;
        for (int i = 0; i < numOfThreads; i++) {
            try {
                threads[i].join();
                sum += threads[i].getTotal();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Sum = " + sum);
        System.out.println("Time using threads = " + timeElapsed + " ms");
    }

    private static void calculateSumWithoutThreads(int[] elements) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        System.out.println("Sum = " + sum);
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time using no threads = " + timeElapsed + " ms");
    }

    private static void fillArray(int[] elements) {
        Random random = new Random();
        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(100);
        }
    }
}
