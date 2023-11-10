package ru.aiwass.javaBasic.homeworks.moduletwo.lesson11.animals;

public abstract class Animal {
    //У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int endurance;
    protected int swimPowerConsumption;
    public int getSwimPowerConsumption() {
        return swimPowerConsumption;
    }
    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance, int swimPowerConsumption) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
        this.swimPowerConsumption = swimPowerConsumption;
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
            endurance -=distance;
            return distance/runningSpeed;
        }

        System.out.println("Скорость не может быть меньше нуля");
        return -1;
    }

    public abstract int swim(int distance);

}
