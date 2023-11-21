package ru.aiwass.java_basic.homeworks.module_two.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    //    Создайте класс Сотрудник с полями: имя, возраст;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;

    public static List<String> getNames(List<Employee> employees) {
        List<String> names = new ArrayList<>(employees.size());
        for (Employee employee : employees) {
            names.add(employee.name);
        }
        return names;
    }
//    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
//    и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;

    public static List<Employee> getEmployeesAboveAge(List<Employee> employees, int minAge) {
        List<Employee> employeesUnderTheMinAge = new ArrayList<>(employees.size());
        for (Employee employee : employees) {
            if (employee.age >= minAge) {
                employeesUnderTheMinAge.add(employee);
            }
        }
        return employeesUnderTheMinAge;
    }

//    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний
//    возраст, и проверяющий что средний возраст сотрудников превышает указанный аргумент;

    public static boolean checkAverageAgeAbove(List<Employee> employees, int minAvgAge) {
        int sumAge = 0;
        for (Employee employee : employees) {
            sumAge += employee.age;
        }
        int avgAge = sumAge / employees.size();
        return avgAge > minAvgAge;
    }

//    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку
//    на самого молодого сотрудника.

    public static Employee getYoungestEmployee(List<Employee> employees) {
        int minimumAge = employees.get(0).age;
        Employee youngEmployee = null;

        for (Employee employee : employees) {
            if (employee.age < minimumAge) {
                minimumAge = employee.age;
                youngEmployee = employee;
            }
        }
        return youngEmployee;
    }

    @Override
    public String toString() {
        return name + ". Возраст: " + age;
    }
}

