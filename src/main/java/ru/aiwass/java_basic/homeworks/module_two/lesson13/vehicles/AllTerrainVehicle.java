package ru.aiwass.java_basic.homeworks.module_two.lesson13.vehicles;

import ru.aiwass.java_basic.homeworks.module_two.lesson13.transport.TerrainType;
import ru.aiwass.java_basic.homeworks.module_two.lesson13.transport.Transport;

public class AllTerrainVehicle implements Transport {
    private float fuel;

    private final float energyConsumptionCoefficientPerMeter;

    public AllTerrainVehicle(float fuel) {
        this.fuel = fuel;
        this.energyConsumptionCoefficientPerMeter = 0.0001f;
    }

    @Override
    public boolean move(TerrainType terrainType, int distance) {

        if (fuel >= distance * energyConsumptionCoefficientPerMeter) {
            fuel -= distance * energyConsumptionCoefficientPerMeter;
            System.out.println("Вездеход переместился на " + distance + " м. Топлива осталось: " + fuel);
            return true;
        }
        System.out.println("Недостаточно топлива. Расход топлива: "
                + distance * energyConsumptionCoefficientPerMeter +
                "\nОсталось топлива: " + fuel);
        return false;
    }
}
