package ru.aiwass.java_basic.homeworks.module_2.lesson13.vehicles;

import ru.aiwass.java_basic.homeworks.module_2.lesson13.people.Human;
import ru.aiwass.java_basic.homeworks.module_2.lesson13.transport.TerrainType;
import ru.aiwass.java_basic.homeworks.module_2.lesson13.transport.Transport;

public class Bike implements Transport {
    private final Human enduranceHuman;
    private final int energyConsumptionCoefficientPerMeter;

    public Bike(Human enduranceHuman) {
        this.enduranceHuman = enduranceHuman;
        this.energyConsumptionCoefficientPerMeter = 3;
    }

    @Override
    public boolean move(TerrainType terrainType, int distance) {
        if (terrainType == TerrainType.SWAMP) {
            System.out.println("Велосипед не может проехать по болоту");
            return false;
        }
        if (enduranceHuman.getEndurance() >= distance * energyConsumptionCoefficientPerMeter) {
            int residualEndurance = enduranceHuman.getEndurance() - distance * energyConsumptionCoefficientPerMeter;
            enduranceHuman.setEndurance(residualEndurance);
            System.out.println("Велосипед переместился на " + distance + " м.");
            return true;
        }
        System.out.println("Недостаточно выносливости. Расход выносливости: " +
                distance * energyConsumptionCoefficientPerMeter +
                "\nОсталось выносливости: " + enduranceHuman.getEndurance());
        return false;
    }
}

