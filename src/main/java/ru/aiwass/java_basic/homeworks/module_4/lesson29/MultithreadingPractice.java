package ru.aiwass.java_basic.homeworks.module_4.lesson29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingPractice {
    private final Object mon = new Object();
    private volatile char currentLetter = 'A';

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        MultithreadingPractice multithreadingPractice = new MultithreadingPractice();
        for (int i = 1; i <= 3; i++) {
            final int index = i;
            service.execute(() -> {
                if (index == 1) {
                    multithreadingPractice.printA();
                } else if (index == 2) {
                    multithreadingPractice.printB();
                } else {
                    multithreadingPractice.printC();
                }
            });
        }
        service.shutdown();
    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A') {
                        mon.wait();
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B') {
                        mon.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C') {
                        mon.wait();
                    }
                    System.out.print("C");
                    currentLetter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
