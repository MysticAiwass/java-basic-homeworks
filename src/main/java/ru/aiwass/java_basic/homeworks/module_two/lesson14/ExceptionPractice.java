package ru.aiwass.java_basic.homeworks.module_two.lesson14;

public class ExceptionPractice {
    public static void main(String[] args) {
        String[][] arrayNumber = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        String[][] arrayNumber1 = {
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] arrayString = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "Ошибка"}
        };


        try {
            sumElementsArray(arrayString);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

    }

    public static void sumElementsArray(String[][] array) throws AppArrayDataException, AppArraySizeException {

        if (array.length != 4) {
            throw new AppArraySizeException("Размер массива должен быть 4x4");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("Размер массива должен быть 4x4");
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    int element = Integer.parseInt(array[i][j]);
                    sum += element;
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println("Cумма элементов массива: " + sum);
    }
}

