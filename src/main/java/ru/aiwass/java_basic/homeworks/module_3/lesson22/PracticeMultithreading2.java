package ru.aiwass.java_basic.homeworks.module_3.lesson22;

public class PracticeMultithreading2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        calculateArrayElementMultithreaded();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Время выполнения: " + executionTime + " миллисекунд");
    }

    public static void calculateArrayElementMultithreaded() {
        double[] array = new double[100_000_000];
        Thread[] threads = new Thread[4];
        int chunkSize = 100_000_000 / 4;

        for (int i = 0; i < 4; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i + 1) * chunkSize;
            threads[i] = new Thread(() -> calculateChunk(array, startIndex, endIndex));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void calculateChunk(double[] array, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
