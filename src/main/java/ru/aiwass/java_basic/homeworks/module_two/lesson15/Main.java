package ru.aiwass.java_basic.homeworks.module_two.lesson15;

import java.util.ArrayList;

import static ru.aiwass.java_basic.homeworks.module_two.lesson15.Employee.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Михаил", 34));
        employees.add(new Employee("Наталья", 20));
        employees.add(new Employee("Фатима", 21));
        employees.add(new Employee("Илья", 25));
        employees.add(new Employee("Кирилл", 56));

        System.out.println(getNames(employees));
        System.out.println(checkAverageAgeAbove(employees, 20));
        System.out.println(getYoungestEmployee(employees));
        System.out.println(getEmployeesAboveAge(employees, 21));

    }
}
