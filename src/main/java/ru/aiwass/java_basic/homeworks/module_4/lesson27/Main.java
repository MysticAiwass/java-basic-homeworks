package ru.aiwass.java_basic.homeworks.module_4.lesson27;

public class Main {
    public static void main(String[] args) {

        Box<Fruit> fruitBox = new Box<>();
        //Добавление фруктов
        fruitBox.add(
                new Apple(1.2),
                new Apple(1.2),
                new Apple(1.2),
                new Apple(1.2),
                new Orange(4.8),
                new Orange(4.8),
                new Orange(4.8),
                new Orange(4.8));
        System.out.println(fruitBox.calculateWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.add(
                new Apple(9),
                new Apple(4),
                new Apple(4),
                new Apple(4),
                new Apple(4));
        System.out.println(appleBox.calculateWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(
                new Orange(6),
                new Orange(6),
                new Orange(6),
                new Orange(6),
                new Orange(6));
        System.out.println(orangeBox.calculateWeight());

        //Сравнение
        System.out.println(orangeBox.compare(appleBox));

        //Переместить фрукты
        appleBox.transferFruits(fruitBox);
        System.out.println(appleBox.calculateWeight());

        orangeBox.transferFruits(fruitBox);
        System.out.println(orangeBox.calculateWeight());

//        Передача аргумента this
//        orangeBox.transferFruits(orangeBox);

//        Передача аргумента null
        orangeBox.transferFruits(null);
    }
}
