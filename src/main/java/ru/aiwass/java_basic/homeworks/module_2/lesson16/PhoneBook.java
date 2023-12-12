package ru.aiwass.java_basic.homeworks.module_2.lesson16;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }


    public Map<String, Set<String>> find(String query) {
        Map<String, Set<String>> phoneNumbers = new HashMap<>();

        for (var entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            if (name.contains(query)) {
                phoneNumbers.put(name, phoneBook.get(name));
            }
        }

        return phoneNumbers.isEmpty() ? Collections.emptyMap() : phoneNumbers;
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
