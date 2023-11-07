package ru.aiwass.javaBasic.homeworks.moduletwo.lesson11.animals;

public class Dog extends Animal {

    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance, 2);
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
