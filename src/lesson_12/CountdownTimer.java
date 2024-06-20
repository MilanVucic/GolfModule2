package lesson_12;

public class CountdownTimer extends Thread {
    public static final int DEFAULT_TICK_INTERVAL = 200;
    private int milliseconds;
    private int tickInterval;
    private CountdownProgress countdownProgress;

    public CountdownTimer(int milliseconds, CountdownProgress countdownProgress) {
        this.milliseconds = milliseconds;
        this.countdownProgress = countdownProgress;
        this.tickInterval = DEFAULT_TICK_INTERVAL;
    }

    public CountdownTimer(int milliseconds, int tickInterval, CountdownProgress countdownProgress) {
        this.milliseconds = milliseconds;
        this.tickInterval = tickInterval;
        this.countdownProgress = countdownProgress;
    }

    @Override
    public void run() {
        while (milliseconds > 0) {
            countdownProgress.onTick(milliseconds);
            milliseconds -= tickInterval;
            try {
                Thread.sleep(tickInterval);
            } catch (InterruptedException e) {
                System.out.println("I've been interrupted...");
            }
        }
        countdownProgress.onFinish();
    }
}
