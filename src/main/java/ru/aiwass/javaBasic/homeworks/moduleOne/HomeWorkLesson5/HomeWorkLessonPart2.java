package ru.aiwass.javaBasic.homeworks.moduleOne.HomeWorkLesson5;

import java.util.Arrays;

public class HomeWorkLessonPart2 {
    public static void main(String[] args) {

        int[] ascendingArray = new int[]{1, 2, 3};
        int[] array1 = new int[]{2, 3, 5, 7, 8, 10};
        int[] array2 = new int[]{1, 1, 1, 1, 1, 0, 0};
        int[] descendingArray = new int[]{5, 4, 3, 2, 1, 1, 0};
        int[] emptyArray = new int[0];
        int[] array3 = new int[]{1, 1, 1, 1, 1, 1, 5};
        int[] array4 = new int[]{5, 3, 4, -2};
        int[] unsortedArray = new int[]{4, 6, 1, 9, 0, 3, -10};

        System.out.println("Сумма элементов входящих массивов " +
                Arrays.toString(sumElementsOfIncomingArrays(array1, array2, array3)));

        System.out.println("Реверсив массива " + Arrays.toString(reverseArray(array2)));


        System.out.println(checkArrayOrder(ascendingArray).message);
        System.out.println(checkArrayOrder(descendingArray).message);
        System.out.println(checkArrayOrder(unsortedArray).message);
        System.out.println(checkArrayOrder(emptyArray).message);

        System.out.println(searchDot(array3));
        System.out.println(searchDot(array4));


    }

//     Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
//     массив равный сумме входящих. Пример: { 1, 2, 3 } + { 2, 2 } + { 1, 1, 1, 1, 1}  = { 4, 5, 4, 1, 1 }

    private static int[] sumElementsOfIncomingArrays(int[]... arrays) {

        int[] sumElementAllArrays = new int[getMaxArrayLength(arrays)];

        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                sumElementAllArrays[i] = sumElementAllArrays[i] + array[i];
            }
        }
        return sumElementAllArrays;
    }


    private static int getMaxArrayLength(int[]... arrays) {
        int maxLength = 0;
        for (int[] array : arrays) {
            maxLength = Math.max(maxLength, array.length);
        }
        return maxLength;
    }

//    Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
//    равны. “Точка находится между элементами”.
//    Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }


    private static int searchDot(int[] array) {

        if (array.length == 0) {
            throw new RuntimeException("Ваш массив пуст");
        }

        int dot = -1;
        int sumLeft = 0;
        int sumArray = 0;

        for (int j : array) {
            sumArray = sumArray + j;
        }

        for (int i = 0; i < array.length; i++) {
            if (sumLeft == sumArray - sumLeft - array[i]) {
                dot = i;
                return dot;
            }
            sumLeft = sumLeft + array[i];
        }
        return dot;
    }


//    Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
//    возрастания (по выбору пользователя).

    private static ArrayAssortment checkArrayOrder(int[] array) {

        if (array.length == 0) {
            return ArrayAssortment.EMPTY;
        }

        boolean ascending = true;
        boolean descending = true;

        int start = array[0];

        for (int i = 1; i < array.length; i++) {
            if (start > array[i]) {
                start = array[i];
                ascending = false;
            } else if (start < array[i]) {
                start = array[i];
                descending = false;
            }
        }

        if (descending) {
            return ArrayAssortment.DESCENDING;
        } else if (ascending) {
            return ArrayAssortment.ASCENDING;
        } else {
            return ArrayAssortment.UNSORTED;
        }
    }

    enum ArrayAssortment {
        ASCENDING("Возрастающий массив"),
        DESCENDING("Убывающий массив"),
        UNSORTED("Несортированнный массив"),
        EMPTY("Пустой массив");

        ArrayAssortment(String massage) {
            this.message = massage;
        }

        private String message;


    }

//    Реализуйте метод, “переворачивающий” входящий массив
//    Пример: { 1 2 3 4 } => { 4 3 2 1 }

    private static int[] reverseArray(int[] array) {

        int temp;
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            j--;
        }
        return array;
    }
}
