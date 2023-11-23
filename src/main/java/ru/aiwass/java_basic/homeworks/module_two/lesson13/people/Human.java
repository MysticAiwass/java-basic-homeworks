package ru.aiwass.java_basic.homeworks.module_two.lesson13.people;

import ru.aiwass.java_basic.homeworks.module_two.lesson13.transport.TerrainType;
import ru.aiwass.java_basic.homeworks.module_two.lesson13.transport.Transport;

public class Human {
    private final String name;
    private Transport currentTransport;
    private int endurance;
    private final int energyConsumptionCoefficientPerMeter;
    private boolean isSitingOnTransport;


    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public Human(String name, int endurance) {
        this.name = name;
        this.endurance = endurance;
        this.currentTransport = null;
        this.energyConsumptionCoefficientPerMeter = 4;
        this.isSitingOnTransport = false;
    }

    public void sitOnTransport(Transport transport) {
        if (!isSitingOnTransport) {
            currentTransport = transport;
            isSitingOnTransport = true;
            System.out.println(name + " сел(a) на транспорт: " + transport.getClass().getSimpleName());

        } else {
            System.out.println(name + " уже сидит на транспорте: " + transport.getClass().getSimpleName());
        }
    }

    public void standFromTransport() {
        if (isSitingOnTransport) {
            currentTransport = null;
            isSitingOnTransport = false;
            System.out.println(name + " встал(а) с транспорта");
        } else {
            System.out.println(name + " и так не сидит на транспорте");
        }
    }

    public boolean move(int distance, TerrainType terrainType) {

        if (distance < 0) {
            System.out.println("Расстояние не может быть меньше либо равно 0");
            return false;
        }
        if (currentTransport != null) {
            return currentTransport.move(terrainType, distance);
        }

        if (endurance > distance * energyConsumptionCoefficientPerMeter) {
            endurance -= distance * energyConsumptionCoefficientPerMeter;
            System.out.println(name + " переместился(лась) пешком: " + distance + " м.");
            return true;
        } else {
            System.out.println("Не хватает выносливости для перемещения пешком");
            return false;
        }
    }
}
