package ru.aiwass.javaBasic.homeworks.moduletwo.lesson12;

public class Plate {
    private final int maximumAmountOfFood;
    private int currentAmountOfFood;

    public Plate(int maximumAmountOfFood) {
        this.maximumAmountOfFood = maximumAmountOfFood;
        this.currentAmountOfFood = maximumAmountOfFood;
    }

    public boolean addFood(int food) {
        if (food > maximumAmountOfFood || food + currentAmountOfFood > maximumAmountOfFood) {
            return false;
        }
        currentAmountOfFood += food;
        return true;
    }

    public boolean decreaseFood(int amount) {
        if (currentAmountOfFood >= amount) {
            currentAmountOfFood -= amount;
            return true;
        }
        return false;
    }
}
