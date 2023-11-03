package ru.aiwass.javaBasic.homeworks.moduletwo.lesson11;

import ru.aiwass.javaBasic.homeworks.moduletwo.lesson11.animals.Cat;
import ru.aiwass.javaBasic.homeworks.moduletwo.lesson11.animals.Dog;
import ru.aiwass.javaBasic.homeworks.moduletwo.lesson11.animals.Horse;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Лолик", 15, 12, 400);
        Cat cat = new Cat("Анатолик", 10, 300);
        Horse horse = new Horse("Жорик", 50, 30, 1000);
        Dog dogBobik = new Dog("Бобик", 0, 0, 400);

        dog.info();
        dog.run(200);
        dog.swim(50);
        dog.info();
        dog.swim(100);

        System.out.println("_________________________");
        cat.info();
        cat.run(200);
        cat.swim(100);
        cat.info();

        System.out.println("_________________________");
        horse.info();
        horse.run(200);
        horse.swim(200);
        horse.info();
        horse.swim(100);

        System.out.println("_________________________");
        dogBobik.info();
        dogBobik.run(300);
        dogBobik.swim(50);
        dogBobik.info();
    }
}
