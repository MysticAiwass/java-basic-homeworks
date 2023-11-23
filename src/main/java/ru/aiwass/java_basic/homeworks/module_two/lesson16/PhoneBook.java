package ru.aiwass.java_basic.homeworks.module_two.lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;
    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> find(String query) {
        List<String> result = new ArrayList<>();

        for (var entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            if (name.contains(query)) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }

    public boolean containsPhoneNumber(String phoneNumber){
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
