package ru.aiwass.javaBasic.homeworks.moduletwo.lesson11.animals;

public abstract class Animal {
    //У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int endurance;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }

    public void info() {
        System.out.println(name + " имеет выносливость " + endurance + " условных единиц");
    }

    public int run(int distance) {

        if (endurance < distance){
            System.out.println(name + " устал(а) и не может пробежать такое расстояние");
            return -1;
        }

        if (runningSpeed > 0) {
            System.out.println(name + " пробегает " + distance + "м за " +  distance / runningSpeed + " сек");
            endurance = endurance - distance;
            return distance/runningSpeed;
        }

        System.out.println("Скорость не может быть меньше нуля");
        return -1;
    }

    public int swim(int distance) {
        int enduranceRequired = (this instanceof Dog) ? 2 * distance : (this instanceof Horse) ? 4 * distance : 0;

        if (this instanceof Cat) {
            System.out.println(name + " не умеет плавать.");
            return -1;
        }

        if (endurance < enduranceRequired) {
            System.out.println(name + " устал(а) и не может проплыть такое расстояние");
            return -1;
        }

        if (swimmingSpeed > 0) {
            int time = distance / swimmingSpeed;
            System.out.println(name + " проплывает " + distance + " м за " + time + " сек");
            decreaseEndurance(enduranceRequired);
            return time;
        }
        System.out.println("Скорость не может быть меньше нуля");
        return -1;
    }

    protected void decreaseEndurance(int value) {
        endurance -= value;
    }
}