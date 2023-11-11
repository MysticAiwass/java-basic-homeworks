package ru.aiwass.java_basic.homeworks.module_two.lesson10.partone;

import java.time.LocalDate;

public class User {

//    Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
    private String firstName;
    private String lastName;
    private String fatherName;
    private LocalDate dateOfBirth;
    private String email;

    public int getUserAge() {
        LocalDate now = LocalDate.now();
        return  now.getYear() - dateOfBirth.getYear();
    }

//    Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
    public User(String firstName, String lastName, String fatherName, String email, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }
//    В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
//    ФИО: фамилия имя отчество
//    Год рождения: год рождения
//    e-mail: email
    public void displayInformationAboutTheUser () {
        System.out.println("ФИО: " + firstName + " " + lastName + " " + fatherName);
        System.out.println("Год рождения: " + dateOfBirth);
        System.out.println("Email: " + email);
    }


}
