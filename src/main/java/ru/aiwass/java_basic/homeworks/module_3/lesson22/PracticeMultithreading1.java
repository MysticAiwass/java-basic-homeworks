package ru.aiwass.java_basic.homeworks.module_3.lesson22;

public class PracticeMultithreading1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        calculateArrayElement();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Время выполнения: " + executionTime + " миллисекунд");
    }

    public static void calculateArrayElement() {
        double[] array = new double[100_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
