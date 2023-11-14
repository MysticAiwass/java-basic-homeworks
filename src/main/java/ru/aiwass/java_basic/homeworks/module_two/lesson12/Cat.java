package ru.aiwass.java_basic.homeworks.module_two.lesson12;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean isSatiated;

    public Cat (String name, int
            appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isSatiated = false;
    }

    /**
     * Первая реализация:
     * isSatiated = plate.decreaseFood(appetite) - Если сытый кот поест из пустой тарелки, то он
     * станет голодным.
     * Вторая реализация: если кот сытый, то он останется и так сытым, если голодный он попытается поесть из тарелки,
     * и если она пустая, то он останется голодным.
     */
    public boolean eat(Plate plate) {
        if (!isSatiated){
            boolean hadMeal = plate.decreaseFood(appetite);
            if (hadMeal) {
                isSatiated = true;
            }
        }
        return isSatiated;
    }

    @Override
    public String toString(){
        return String.format("Кот %s %s", name, isSatiated ? "сыт" : "голоден");
    }
}
