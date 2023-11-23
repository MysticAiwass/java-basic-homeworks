package ru.aiwass.java_basic.homeworks.module_two.lesson13;

import ru.aiwass.java_basic.homeworks.module_two.lesson13.people.Human;
import ru.aiwass.java_basic.homeworks.module_two.lesson13.transport.TerrainType;
import ru.aiwass.java_basic.homeworks.module_two.lesson13.vehicles.AllTerrainVehicle;
import ru.aiwass.java_basic.homeworks.module_two.lesson13.vehicles.Bike;
import ru.aiwass.java_basic.homeworks.module_two.lesson13.vehicles.Car;
import ru.aiwass.java_basic.homeworks.module_two.lesson13.vehicles.Horse;

public class Main {
    public static void main(String[] args) {
        Human humanOne = new Human("Наталья", 1000);
        Bike bike = new Bike(humanOne);
        Car car = new Car(1);
        Horse horse = new Horse(4000);
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle(1);



        //Может ли Наталья перемещаться пешком
        humanOne.move(100, TerrainType.PLAIN);
        System.out.println("Осталось выносливости: " + humanOne.getEndurance());
//        humanOne.move(100, TerrainType.SWAMP);
//        System.out.println("Осталось выносливости: " + humanOne.getEndurance());
//        humanOne.move(20, TerrainType.DENSE_FOREST);
//        System.out.println("Осталось выносливости: " + humanOne.getEndurance());
//        //Можем ли потратить выносливости больше, чем у нас есть
//        humanOne.move(100, TerrainType.DENSE_FOREST);
//        System.out.println("Осталось выносливости: " + humanOne.getEndurance());
//        //Проверка на отрицательное значение
//        humanOne.move(-100, TerrainType.DENSE_FOREST);
//        System.out.println("Осталось выносливости: " + humanOne.getEndurance());



        System.out.println("------------------------------");
        System.out.println();


        //ВЕЛОСИПЕД

        //Можем ли сесть на велосипед
        humanOne.sitOnTransport(bike);
        //Можем ли перемещаться на велосипеде
        humanOne.move(100, TerrainType.PLAIN);
        System.out.println("Осталось выносливости: " + humanOne.getEndurance());
        humanOne.move(50, TerrainType.DENSE_FOREST);
        humanOne.move(50, TerrainType.SWAMP);
        //Можем ли потратить выносливости больше, чем у нас есть
        humanOne.move(100000, TerrainType.PLAIN);
        //Проверка на отрицательное значение
        humanOne.move(-100000, TerrainType.PLAIN);

        System.out.println("------------------------------");
        System.out.println();

        //МАШИНА

        //Может ли Наталья встать с транспорта
        humanOne.standFromTransport();
        //Можем ли сесть в машину
        humanOne.sitOnTransport(car);

        //Можем ли перемещаться на машине
        humanOne.move(100, TerrainType.PLAIN);
        humanOne.move(200, TerrainType.DENSE_FOREST);
        humanOne.move(100, TerrainType.SWAMP);

        //Проверка, можем ли потратить бензина больше, чем у нас есть
        humanOne.move(100000, TerrainType.PLAIN);
        //Проверка на отрицательное значение
        humanOne.move(-100000, TerrainType.PLAIN);

        System.out.println("------------------------------");
        System.out.println();

        //ЛОШАДЬ

        //Может ли Наталья встать с транспорта
        humanOne.standFromTransport();
        //Можем ли сесть на лошадь
        humanOne.sitOnTransport(horse);
        //Можем ли перемещаться на лошади
        humanOne.move(100, TerrainType.PLAIN);
        humanOne.move(200, TerrainType.DENSE_FOREST);
        humanOne.move(100, TerrainType.SWAMP);

        //Можем ли потратить выносливости больше, чем у нас есть
        humanOne.move(100000, TerrainType.PLAIN);
        //Проверка на отрицательное значение
        humanOne.move(-100000, TerrainType.PLAIN);

        System.out.println("------------------------------");
        System.out.println();

        //ВЕЗДЕХОД

        //Может ли Наталья встать с транспорта
        humanOne.standFromTransport();
        //Можем ли сесть на вездеход
        humanOne.sitOnTransport(allTerrainVehicle);
        //Можем ли перемещаться на вездеходе
        humanOne.move(100, TerrainType.PLAIN);
        humanOne.move(200, TerrainType.DENSE_FOREST);
        humanOne.move(100, TerrainType.SWAMP);
        //Можем ли потратить бензина больше, чем у нас есть
        humanOne.move(100000, TerrainType.PLAIN);
        //Проверка на отрицательное значение
        humanOne.move(-100000, TerrainType.PLAIN);
    }
}
