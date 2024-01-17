package ru.aiwass.java_basic.homeworks.module_4.lesson28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PracticeIOPart2 {

//    Реализуйте метод, который подсчитывает сколько раз в текстовом файле (с кодировкой UTF-8)
//    встречается указанная последовательность символов с учетом регистра;
//    При запуске приложения пользователь вводит имя файла и искомую последовательность символов,
//    программа должна выполнить расчет и напечатать результат в консоль.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String nameFile = scanner.nextLine();

        System.out.println("Введите последовательность символов:");
        String characterSequence = scanner.nextLine();

        int occurrences = countOccurrences(nameFile, characterSequence);

        System.out.println("Количество вхождений: " + occurrences);
    }

    private static int countOccurrences(String fileName, String searchSequence){
        int count = 0;
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while((line = reader.readLine()) != null){
                sb.append(line);
                count += countOccurrencesInLine(sb.toString(),searchSequence);

                sb.setLength(0);

            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return count;
    }

    private static int countOccurrencesInLine(String line, String searchSequence) {
        int count = 0;
        int index = line.indexOf(searchSequence);

        while (index != -1) {
            count++;
            index = line.indexOf(searchSequence, index + 1);
        }

        return count;
    }
}
