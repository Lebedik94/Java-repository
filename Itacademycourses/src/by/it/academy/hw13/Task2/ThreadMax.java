package by.it.academy.hw13.Task2;

public class ThreadMax extends Thread {
    private int maximum;
    private final int[] array;

    public ThreadMax(int[] array) {
        this.array = array;
    }

    public void run() {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        maximum = max;
    }

    public int getMax() {
        return maximum;
    }
}
