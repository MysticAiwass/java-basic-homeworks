package ru.aiwass.java_basic.homeworks.module_4.lesson27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public double calculateWeight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.calculateWeight() - anotherBox.calculateWeight()) < 0.0001;
    }

    public void transferFruits(Box<? super T> anotherBox) {
        if (anotherBox != null && anotherBox != this) {
            anotherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        } else {
            throw new IllegalArgumentException ("Недопустимый аргумент: Box не может быть равен null " +
                    "или совпадать с исходным ящиком.");
        }
    }
}
