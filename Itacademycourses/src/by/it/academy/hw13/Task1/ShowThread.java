package by.it.academy.hw13.Task1;

public class ShowThread implements Runnable {
    public static Object getObject() {
        return object;
    }

    private static final Object object = new Object();

    @Override
    public void run() {
        try {

            synchronized (object) {
                object.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}