package lesson_14;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

    }

    private static void threadLocalExample() {
        ThreadLocal<Integer> data = ThreadLocal.withInitial(() -> 5);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T1 start " + data.get());
                data.set(50);
                System.out.println("T1 end " + data.get());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T2 start " + data.get());
                data.set(33);
                System.out.println("T2 end " + data.get());
            }
        });
        t1.start();
        t2.start();
    }

    private static void syncQueueExample() {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Putting...");
                    queue.put(5);
                    System.out.println("Finished with put");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("Getting...");
                    Integer a = queue.take();
                    System.out.println("Finished with getting " + a);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }

    private static void executorsExample() {
        ExecutorService service = Executors.newWorkStealingPool(5);
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//        ScheduledFuture<?> future = scheduledExecutorService.scheduleAtFixedRate(
//                () -> System.out.println("Helloooo"),
//                3,
//                2,
//                TimeUnit.SECONDS);
    }
}
