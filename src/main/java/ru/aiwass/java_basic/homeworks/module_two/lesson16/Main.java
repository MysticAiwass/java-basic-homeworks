package ru.aiwass.java_basic.homeworks.module_two.lesson16;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван Иванович", "+79111234567");
        phoneBook.add("Петрова Екатерина Сергеевна", "+79222345678");
        phoneBook.add("Смирнов Александр Павлович", "+79333456789");
        phoneBook.add("Козлова Мария Дмитриевна", "+79444567890");
        phoneBook.add("Никитин Даниил Александрович", "+79555678901");
        phoneBook.add("Иванов Генадий Викторович", "+79222256569");
        phoneBook.add("Иванов Иван Иванович", "+789635797645");

        System.out.println(phoneBook.find("Иванов Иван Иванович"));
        System.out.println(phoneBook.find("Иванов"));
        System.out.println(phoneBook.find("Мария"));
        System.out.println(phoneBook.find("Никита"));
        System.out.println(phoneBook.containsPhoneNumber("+79111234567"));
        System.out.println(phoneBook.containsPhoneNumber("+89111234567"));
    }
}
