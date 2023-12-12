package ru.aiwass.java_basic.homeworks.module_2.lesson13.vehicles;

import ru.aiwass.java_basic.homeworks.module_2.lesson13.transport.TerrainType;
import ru.aiwass.java_basic.homeworks.module_2.lesson13.transport.Transport;

public class Horse implements Transport {
    private int endurance;
    private final int energyConsumptionCoefficientPerMeter;

    public Horse(int endurance) {
        this.endurance = endurance;
        this.energyConsumptionCoefficientPerMeter = 2;
    }

    @Override
    public boolean move(TerrainType terrainType, int distance) {
        if (terrainType == TerrainType.SWAMP) {
            System.out.println("Лошадь не будет переходить болото");
            return false;
        }
        if (endurance >= distance * energyConsumptionCoefficientPerMeter) {
            endurance -= distance * energyConsumptionCoefficientPerMeter;
            System.out.println("Лошадь переместилась на " + distance + " м.");
            return true;
        }
        System.out.println("Недостаточно выносливости. Расход выносливости: "
                + distance * energyConsumptionCoefficientPerMeter +
                "\nОсталось выносливости: " + endurance);
        return false;
    }
}

