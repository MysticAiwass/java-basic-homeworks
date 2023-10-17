package ru.aiwass.javaBasic.homeworks.moduleOne.HomeWorkLesson5;

import java.util.Arrays;

public class HomeWorkLessonPart2 {
    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{2, 3, 5, 7, 8, 10};
        int[] array3 = new int[]{1, 1, 1, 1, 1, 0, 0};
        int[] array4 = new int[]{5, 4, 3, 2, 1, 1, 0};
        int[] array5 = new int[0];
        int[] array6 = new int[]{1, 1, 1, 1, 1, 1, 5};
        int[] array7 = new int[]{5, 3, 4, -2};


        System.out.println("Сумма элементов входящих массивов " +
                Arrays.toString(sumElementsOfIncomingArrays(array1, array2, array3)));

        System.out.println("Реверсив массива " + Arrays.toString(reverseArray(array2)));

        System.out.println(checkDescOrder(array4));


        System.out.println(checkAscOrder(array1));


        System.out.println(searchDot(array6));
        System.out.println(searchDot(array7));


    }

//     Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
//     массив равный сумме входящих. Пример: { 1, 2, 3 } + { 2, 2 } + { 1, 1, 1, 1, 1}  = { 4, 5, 4, 1, 1 }

    private static int[] sumElementsOfIncomingArrays(int[]... arrays) {

        int[] sumElementAllArrays = new int[maxLengthArray(arrays)];

        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                sumElementAllArrays[i] = sumElementAllArrays[i] + array[i];
            }
        }
        return sumElementAllArrays;
    }


    private static int maxLengthArray(int[]... arrays) {
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

    private static boolean checkAscOrder(int[] array) {

        if (array.length == 0) {
            throw new RuntimeException("Ваш массив пуст");
        }

        boolean result = true;
        int start = array[0];
        for (int i = 1; i < array.length; i++) {
            if (start <= array[i]) {
                start = array[i];
            } else {
                result = false;
                break;
            }
        }
        return result;
    }


    private static boolean checkDescOrder(int[] array) {

        if (array.length == 0) {
            throw new RuntimeException("Ваш массив пуст");
        }

        boolean result = true;
        int start = array[0];
        for (int i = 1; i < array.length; i++) {
            if (start >= array[i]) {
                start = array[i];
            } else {
                result = false;
                break;
            }
        }
        return result;

    }

//    Реализуйте метод, “переворачивающий” входящий массив
//    Пример: { 1 2 3 4 } => { 4 3 2 1 }

    private static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverseArray[j] = array[i];
            j++;
        }
        return reverseArray;
    }
}
