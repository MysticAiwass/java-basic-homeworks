package ru.aiwass.javaBasic.homeworks.moduleOne.HomeWorkLesson7;


import static ru.aiwass.javaBasic.homeworks.moduleOne.MethodsForWorkingOnHomework.printTwoDimensionalArray;

public class HomeWorkLesson7 {

    public static void main(String[] args) {

        int[][] array = { // максимальное значение 50
                {1, 3, -1, 4, 3, 9, 0, 2, -4, 3, -2}, // сумма 49
                {-1, 4, -1, 45, 7, -9, 5, 2, -4, 3, -5}, // сумма 46
                {6, 34, -1, 3, 50, -8, 5, 2, -4, 3, -78}  // сумма 12
        };

        int[][] array2 = {
                {1, 3, 1, 4, 3},
                {1, 4, 1, 5, 7},
                {6, 3, 1, 3, 5},
                {3, 9, 5, 2, 4},
                {9, 5, 2, 4, 3}
        };

        System.out.println(sumOfPositiveElements(array));
        printSquare(3);
        zeroArrayElementsDiagonally(array2);
        System.out.println(findMax(array));
        System.out.println(calculateTheSumOfTheSecondRowOfTheArray(array));
    }

//    Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
//    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;

    public static int sumOfPositiveElements(int[][] array) {
        int sumElements = 0;
        for (int[] subArray : array) {
            for (int element : subArray) {
                if (element > 0) {
                    sumElements = sumElements + element;
                }
            }
        }
        return sumElements;
    }


//Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль
// квадрат из символов * со сторонами соответствующей длины


    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }


//Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
// и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);

    public static void zeroArrayElementsDiagonally(int[][] array) {
        int pointer = 0;

        for (int[] subArray : array) {
            subArray[pointer] = 0;
            pointer++;
        }

        printTwoDimensionalArray (array);
    }


//Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;

    public static int findMax(int[][] array) {
        int maxElement = 0;
        for (int[] subArray : array) {
            for (int j : subArray) {
                if (j > maxElement) {
                    maxElement = j;
                }
            }
        }
        return maxElement;
    }


//Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
// если второй строки не существует, то в качестве результата необходимо вернуть -1

    public static int calculateTheSumOfTheSecondRowOfTheArray(int[][] array) {
        int sumElements = 0;
        if (array.length == 1) {
            sumElements = -1;
        } else if (array.length >= 2) {
            int[] copyArray = array[1];
            for (int i : copyArray) {
                sumElements = sumElements + i;
            }
        }
        return sumElements;
    }
}
