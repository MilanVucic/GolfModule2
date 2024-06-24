package lesson_13;

public class ArraySumThread extends Thread {
    private int elements[];
    private int start;
    private int end;
    private long total = 0;

    public ArraySumThread(int[] elements, int start, int end) {
        this.elements = elements;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            total += elements[i];
        }
    }

    public long getTotal() {
        return total;
    }
}
