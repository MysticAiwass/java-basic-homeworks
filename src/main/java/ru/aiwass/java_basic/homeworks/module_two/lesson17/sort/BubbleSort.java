package ru.aiwass.java_basic.homeworks.module_two.lesson17.sort;

import java.util.Arrays;

public class BubbleSort {
//Входные данные: массив целых чисел.
//Выходные данные: упорядоченные по возрастанию массив
//Алгоритм сортировки:Использовать алгоритм сортировки пузырьком

//Описание алгоритма:

//    Проходить по массиву и сравнивать каждую пару соседних элементов.
//    Если элементы стоят в неправильном порядке, менять их местами.
//    Повторять проходы по массиву, пока массив не будет упорядочен.

//Условия выполнения: Реализовать сортировку пузырьком без использования встроенных функций сортировки.

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 1, 4, 1};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        boolean swapped  = true;
        int length = array.length;
        while (swapped ) {
            swapped  = false;
            for (int i = 1; i < length; i++) {
                int curr = array[i - 1];
                if (curr > array[i]) {
                    array[i - 1] = array[i];
                    array[i] = curr;
                    swapped  = true;
                }
            }
            length--;
        }

        return array;
    }
}
