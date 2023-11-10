package ru.aiwass.javaBasic.homeworks.moduletwo.lesson12;

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

    public void eat(Plate plate) {
        isSatiated = plate.decreaseFood(appetite);
    }
    @Override
    public String toString(){
        return String.format("Кот %s %s", name, isSatiated ? "сыт" : "голоден");
    }
}
