package ru.aiwass.java_basic.homeworks.module_two.lesson15;

import java.util.ArrayList;
import java.util.List;
public class CollectionsPractice {

    public static void main(String[] args) {
        System.out.println(generateSequentialValuesInRange(4, 16));
        System.out.println(sumElementsArrayList(generateSequentialValuesInRange(1, 7)));
        System.out.println(rewriteCellsWithValue(generateSequentialValuesInRange(1, 4), 5));
        System.out.println(increaseElementsBy(1, generateSequentialValuesInRange(1, 3)));
    }
//    Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с
//    набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);

    public static List<Integer> generateSequentialValuesInRange(int min, int max) {
        List<Integer> list = new ArrayList<>(max - min + 1);
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

//    Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
//    значение которых больше 5, и возвращающий сумму;

    public static int sumElementsArrayList(List<Integer> list) {
        int sum = 0;
        for (Integer value : list) {
            if (value > 5) {
                sum += value;
            }
        }
        return sum;
    }

//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
//    метод должен переписать каждую заполненную ячейку списка указанным числом;

    public static List<Integer> rewriteCellsWithValue(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        return list;
    }
//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
//    увеличивающий каждый элемент списка на указанное число;

    public static List<Integer> increaseElementsBy(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
        return list;
    }

}
