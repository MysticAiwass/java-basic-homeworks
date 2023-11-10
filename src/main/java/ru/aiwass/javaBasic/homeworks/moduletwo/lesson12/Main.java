package ru.aiwass.javaBasic.homeworks.moduletwo.lesson12;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(150);
        Cat[] cats = new Cat[]{
                new Cat("Обжорка", 100),
                new Cat("Лолик", 15),
                new Cat("Игорь", 10),
                new Cat("Вася", 10),
                new Cat("Петрушка", 50)
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate.addFood(100));
        System.out.println(plate.addFood(100));
    }
}
