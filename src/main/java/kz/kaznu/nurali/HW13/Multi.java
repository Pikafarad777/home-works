package kz.kaznu.nurali.HW13;

public class Multi {
    public static void main(String[] args) throws InterruptedException {
        int size = 100_000_000;
        double[] array = new double[size];
        int threadCount = 4;
        Thread[] threads = new Thread[threadCount];

        long startTime = System.currentTimeMillis();

        for (int t = 0; t < threadCount; t++) {
            int start = t * (size / threadCount);
            int end = (t + 1) * (size / threadCount);

            threads[t] = new Thread(() -> {
                for (int i = start; i < end; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            threads[t].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения в 4 потоках: " + (endTime - startTime) + " мс");
    }
}