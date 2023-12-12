package ru.aiwass.java_basic.homeworks.module_2.lesson11.animals;

public class Horse extends Animal {
    public Horse(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance, 4);
    }

    @Override
    public int swim(final int distance) {
        int enduranceRequired = distance * getSwimPowerConsumption();

        if (endurance < enduranceRequired) {
            System.out.println(name + " устал(а) и не может проплыть такое расстояние");
            return -1;
        }

        if (swimmingSpeed > 0) {
            int time = distance / swimmingSpeed;
            System.out.println(name + " проплывает " + distance + " м за " + time + " сек");
            endurance -= enduranceRequired;
            return time;
        }

        System.out.println("Скорость не может быть меньше нуля");
        return -1;
    }
}
