package kz.kaznu.nurali.HW13;

public class Single {
    public static void main(String[] args) {
        int size = 100_000_000;
        double[] array = new double[size];

        long startTime = System.currentTimeMillis(); // Засекаем время

        for (int i = 0; i < size; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }

        long endTime = System.currentTimeMillis(); // Конец времени
        System.out.println("Время выполнения в одном потоке: " + (endTime - startTime) + " мс");
    }
}