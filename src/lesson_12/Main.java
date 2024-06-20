package lesson_12;

public class Main {
    volatile int a;

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 1 locked lock1");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread 1 going for lock2");
                    synchronized (lock2) {
                        System.out.println("...");
                    }
                    System.out.println("Thread 1 done...");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("Thread 2 locked lock2");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread 2 going for lock1");
                    synchronized (lock1) {
                        System.out.println("...");
                    }
                    System.out.println("Thread 2 done...");
                }
            }
        });
        t1.start();
        t2.start();
    }

    private static void syncExample() {
        Object lock1 = new Object();
        Object lock2 = new Object();
        synchronized (lock1) {
            System.out.println("I'm doing some dangerous work...");
        }
    }

    private synchronized void methodExample() {
        synchronized (this) {

        }
    }

    private synchronized static void staticMethodExample() {
        synchronized (Main.class) {

        }
    }

    private static void cdTimerExample() {
        CountdownTimer countdownTimer = new CountdownTimer(12000, 2000, new CountdownProgress() {
            @Override
            public void onTick(int millisRemaining) {
                System.out.println(String.format(
                        "Left: %.1f", 1.0 * millisRemaining / 1000));
            }

            @Override
            public void onFinish() {
                System.out.println("Game over");
            }
        });
        countdownTimer.start();
        countdownTimer.interrupt();
    }

    private static void threadsExample() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 2: " + i);
            }
        });
        thread2.start();
    }
}
