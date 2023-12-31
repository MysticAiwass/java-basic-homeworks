package ru.aiwass.java_basic.homeworks.module_1.lesson5;

import ru.aiwass.java_basic.homeworks.module_1.MethodsForWorkingOnHomework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPartOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {20, 2, 5, 89, 12, 7, 1, 4, 2, 3, 6, 4, 8, 32, 0};
        int[] array2 = {20, 2, 5, 89, 12, 7, 1, 4, 2, 3, 6, 4, 8, 32, 5, 6, 23};

        System.out.println("Введите строку для печати: ");
        printString(MethodsForWorkingOnHomework.generateNumber(1, 9), scanner.nextLine());
        printSum(array);
        fillingTheArray(MethodsForWorkingOnHomework.generateNumber(1, 9), array);
        System.out.println("Массив заполнен " + Arrays.toString(array));
        increaseArrayElementsByNumber(MethodsForWorkingOnHomework.generateNumber(1, 9), array);
        System.out.println("Элементы массива увеличины " + Arrays.toString(array));
        compareArraySums(array2);
    }

//    Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в
//    консоль строку указанное количество раз;

    private static void printString(int number, String string) {
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }
//    Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
//    элементы, значение которых больше 5, и печатающий полученную сумму в консоль;

    private static void printSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
//    массив, метод должен заполнить каждую ячейку массива указанным числом;

    private static void fillingTheArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
//    массив, увеличивающий каждый элемент массива на указанное число;


    private static void increaseArrayElementsByNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + number;
        }
    }

//    Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в
//    консоль информацию о том, сумма элементов какой из половин массива больше;


    public static void compareArraySums(int[] array) {

        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < array.length; i++) {

            if (i < array.length / 2) {
                sumOne = sumOne + array[i];
            } else {
                sumTwo = sumTwo + array[i];
            }
        }

         if (sumOne > sumTwo){
             System.out.println("Сумма первой половины больше: " + sumOne);
         } else if (sumOne < sumTwo){
             System.out.println("Сумма второй половины больше: " + sumTwo);
         } else {
             System.out.println("Cумма половин массива равны " + sumOne);
         }
    }
}
