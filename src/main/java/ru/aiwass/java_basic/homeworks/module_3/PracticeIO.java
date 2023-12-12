package ru.aiwass.java_basic.homeworks.module_3;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
public class PracticeIO {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\evawh\\IdeaProjects\\java-basic-homeworks");

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path, "*.txt")) {
            for (Path filePath : directoryStream) {
                System.out.println(filePath.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла для работы:");
        String fileName = scanner.nextLine();

        Path filePath = Paths.get(fileName);

        if (Files.exists(filePath) && Files.isRegularFile(filePath)) {

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Введите строку для записи в указанный файл:");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile(), true))) {
                writer.write(scanner.nextLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файл не существует или не является обычным файлом.");
        }
        scanner.close();
    }
}

