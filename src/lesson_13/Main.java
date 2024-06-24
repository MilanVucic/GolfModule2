package lesson_13;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Callable<Integer> callable = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Almost done...");
            return sum;
        };

        System.out.println("Hello");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(callable);

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private static void priorityExample() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T1 " + i);
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T2 " + i);
            }
        });
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T3 " + i);
            }
        });
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
        t1.start();
        t2.start();
    }
}
