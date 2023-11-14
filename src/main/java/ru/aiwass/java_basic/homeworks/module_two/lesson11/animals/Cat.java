package ru.aiwass.java_basic.homeworks.module_two.lesson11.animals;

public class Cat extends Animal {

    public Cat(String name, int runningSpeed, int endurance) {
        super(name, runningSpeed,0, endurance, 0);
    }

    @Override
    public int swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        return -1;
    }
}
