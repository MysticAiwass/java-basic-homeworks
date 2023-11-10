package ru.aiwass.javaBasic.homeworks.moduletwo.lesson10.partone;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//    В методе main() Main класса создайте массив из 10 пользователей и заполните его
//    объектами и с помощью цикла выведите информацию только о пользователях старше 40 лет.

        User[] users = new User[10];

        users[0] = new User("Иванов", "Иван", "Иванович", "ivan.ivanov@example.com", LocalDate.of(1986, 3, 15));
        users[1] = new User("Иванова", "Анна", "Сергеевна", "anna.ivanova@example.com", LocalDate.of(1990, 7, 22));
        users[2] = new User("Дмитриев", "Дмитрий", "Дмитриевич", "dmitriy.dmitriev@example.com", LocalDate.of(1982, 11, 5));
        users[3] = new User("Морозова", "Екатерина", "Игоревна", "ekaterina.morozova@example.com", LocalDate.of(1995, 9, 12));
        users[4] = new User("Волков", "Алексей", "Николаевич", "alexey.volkov@example.com", LocalDate.of(1988, 4, 30));
        users[5] = new User("Кузнецов", "Олег", "Владимирович", "oleg.kuznetsov@example.com", LocalDate.of(1992, 6, 2));
        users[6] = new User("Смирнова", "Мария", "Александровна", "maria.smirnova@example.com", LocalDate.of(1987, 8, 14));
        users[7] = new User("Попов", "Артем", "Сергеевич", "artem.popov@example.com", LocalDate.of(1993, 9, 27));
        users[8] = new User("Николаева", "Елена", "Анатольевна", "elena.nikolaeva@example.com", LocalDate.of(1984, 5, 10));
        users[9] = new User("Захарова", "Наталья", "Дмитриевна", "natalia.zaharova@example.com", LocalDate.of(1980, 12, 18));

        showInfoOnPeopleOlderThanGivenAge(users, 40);

    }

    public static void showInfoOnPeopleOlderThanGivenAge(User[] users, int age) {
        for (User user : users) {
            if (user.getUserAge() > age) {
                user.displayInformationAboutTheUser();
            }
        }
    }
}
