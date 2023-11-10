package ru.aiwass.javaBasic.homeworks.moduleone;

public class MethodsForWorkingOnHomework {
    public static void printTwoDimensionalArray(int[][] array) {
        for (int[] subArray : array) {
            for (int i : subArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    public static int generateNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
