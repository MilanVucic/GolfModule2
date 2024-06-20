package lesson_12;

public interface CountdownProgress {
    void onTick(int millisRemaining);
    void onFinish();
}
