package ru.aiwass.java_basic.homeworks.module_2.lesson12;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
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

        System.out.println(cats[0].eat(plate));
        System.out.println(cats[0].eat(plate));
    }
}
