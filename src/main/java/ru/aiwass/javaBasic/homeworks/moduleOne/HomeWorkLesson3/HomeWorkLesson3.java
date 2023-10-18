package ru.aiwass.javaBasic.homeworks.moduleOne.HomeWorkLesson3;

import java.util.Scanner;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 5 включительно. Методы:\n" +
                "1 - greetings()\n" +
                "2 - checkSign(..)\n" +
                "3 - selectColor()\n" +
                "4 - compareNumbers()\n" +
                "5 - addOrSubtractAndPrint (..)");
        int answerUser = scanner.nextInt();
        if (answerUser == 1) {
            greetings();
        } else if (answerUser == 2) {
            checkSign((int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101));
        } else if (answerUser == 3) {
            selectColor();
        } else if (answerUser == 4) {
            compareNumbers();
        } else if (answerUser == 5) {
            addOrSubtractAndPrint((int) (Math.random() * 101), (int) (Math.random() * 101), Math.random() > 0.5);
        } else {
            System.out.println("Введите цифру в диапазоне от 1 до 5");
        }
    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    private static void compareNumbers() {
        int a = (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void selectColor() {
        int date = (int) (Math.random() * 101);
        if (date <= 10) {
            System.out.println("Красный");
        } else if (date <= 20) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
}
