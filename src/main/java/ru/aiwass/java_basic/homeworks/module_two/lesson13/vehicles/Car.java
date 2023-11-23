package ru.aiwass.java_basic.homeworks.module_two.lesson13.vehicles;

import ru.aiwass.java_basic.homeworks.module_two.lesson13.transport.TerrainType;
import ru.aiwass.java_basic.homeworks.module_two.lesson13.transport.Transport;

public class Car implements Transport {
    private float fuel;

    private final float energyConsumptionCoefficientPerMeter;


    public Car(float fuel) {
        this.fuel = fuel;
        this.energyConsumptionCoefficientPerMeter = 0.00015f;
    }

    @Override
    public boolean move(TerrainType terrainType, int distance) {
        if (terrainType == TerrainType.DENSE_FOREST || terrainType== TerrainType.SWAMP){
            System.out.println("Машина не приспособлена к такой местности: " +
                    terrainType.getClass().getSimpleName());
            return false;
        }
        if (fuel >= distance * energyConsumptionCoefficientPerMeter) {
            fuel -= distance * energyConsumptionCoefficientPerMeter;
            System.out.println("Машина переместилась на " + distance + " м. Количество бензина в баке: " + fuel);
            return true;
        }
        System.out.println("Недостаточно топлива. Расход топлива: " +
                distance * energyConsumptionCoefficientPerMeter +
                "\nОсталось топлива: " + fuel);
        return false;
    }
}

