package ru.aiwass.java_basic.homeworks.module_1.lesson7;


import ru.aiwass.java_basic.homeworks.module_1.MethodsForWorkingOnHomework;

public class DimensionalArray {

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        // - это вот объявление двуменого массива с уже заданное длиной.

        // А еще его можно написать вот так:

        int[][] array1 = new int[][]
                {
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}
                };

// дальше перейдем в paint -
    }

//    Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
//    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;

    public static int sumOfPositiveElements(int[][] array) {
        int sumElements = 0;
        for (int[] subArray : array) {
            for (int element : subArray) {
                if (element > 0) {
                    sumElements += element;
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
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                if (y == x) {
                    array[y][x] = 0;
                }
            }
        }
        MethodsForWorkingOnHomework.printTwoDimensionalArray(array);
    }

//Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;

    public static int findMax(int[][] array) {
        int maxElement = array[0][0];
        for (int[] subArray : array) {
            for (int value : subArray) {
                if (value > maxElement) {
                    maxElement = value;
                }
            }
        }
        return maxElement;
    }

//Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
// если второй строки не существует, то в качестве результата необходимо вернуть -1

    public static int calculateTheSumOfTheSecondRowOfTheArray(int[][] array) {
        int sumElements = 0; // - это переменная, которая записывает сумму второй строки
        if (array.length <= 1) { //создаешь условие, где говоришь, что если длина массива меньше или равна 0,
            // то мы записываем в сумму -1 и
            sumElements = -1;
        } else { // но если длина массива больше 1, то мы берем второю строку и суммируем ее элементы
            for (int i = 0; i < array[1].length; i++) { // вот здесь проходимся по второй строке, помни нумерация с 0
                sumElements += array[1][i]; // собственно прибавляем
            }
        }
        return sumElements; // возвращаем сумму
    }
}

