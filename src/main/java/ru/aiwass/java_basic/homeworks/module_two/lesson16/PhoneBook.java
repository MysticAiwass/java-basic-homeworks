package ru.aiwass.java_basic.homeworks.module_two.lesson16;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }


//    Про get немного не поняла.Т.е. проверять точное совпадение ключа query в телефонной книге,
//    и если ввели подстроку,то он ничего не выведет?

//    public void find(String query) {
//        if (phoneBook!=null) {
//            System.out.println(query + ": " + phoneBook.get(query));
//        } else {
//            System.out.println("Номер не найден для запроса: " + query);
//        }
//    }

//    Убрала лист и сделала просто вывод на экран - фио-номер телефона
//    Во втором случае, будет искать содержит ли ключ введенное значение и выведет на экран все совпадения.
//    Добавила вывод, если номер не найден.

    public void find(String query) {
        boolean found = false;

        for (var entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            if (name.contains(query)) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Номер не найден для запроса: " + query);
        }
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (var entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    public void printPhoneBook() {
        for (var entry : phoneBook.entrySet()) {
            System.out.println("ФИО: " + entry.getKey() +
                    ", Номер телефона: " + entry.getValue());
        }
    }
}
