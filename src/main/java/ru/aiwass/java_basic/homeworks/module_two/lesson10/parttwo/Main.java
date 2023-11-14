package ru.aiwass.java_basic.homeworks.module_two.lesson10.parttwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box box = new Box("Белая", 10, 10, 10);
        System.out.println("На столе стоит коробка. Давай посмотрим, что мы можем с ней делать");

        callOperations();

        boolean startProgram = true;
        while (startProgram) {
            try {
                System.out.println("Введите номер операции:");

                int userAnswer = scanner.nextInt();

                scanner.nextLine();

                switch (userAnswer) {
                    case 1:
                        box.printInfo();
                        break;
                    case 2:
                        box.open();
                        break;
                    case 3:
                        box.close();
                        break;
                    case 4:
                        System.out.println("Введите новый цвет коробки");
                        box.setColor(scanner.nextLine());
                        break;
                    case 5:
                        box.removeItem();
                        break;
                    case 6:
                        System.out.println("Какой предмет вы хотите положить?");
                        box.putItem(new Item(scanner.nextLine()));
                        break;
                    case 7:
                        callOperations();
                        break;
                    case 8:
                        System.out.println("Программа закрыта");
                        startProgram = false;
                        break;
                    default:
                        System.out.println("Нет такой операции");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ой-ой. Ты вводишь не то что нужно");
                callOperations();
                scanner.next();
            }
        }
    }

    public static void callOperations() {
        System.out.println("Доступные операции с коробкой: \n" +
                "1 - Узнать характеристики коробки \n" +
                "2 - Открыть коробку \n" +
                "3 - Закрыть коробку\n" +
                "4 - Поменять цвет коробки \n" +
                "5 - Убрать предмет из коробки\n" +
                "6 - Положить предмет в коробку\n" +
                "7 - Показать доступыне операции\n" +
                "8 - Закрыть программу \n");
    }
}

