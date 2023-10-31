package ru.aiwass.javaBasic.homeworks.moduleOne.HomeworkLesson10.partTwo;

public class Box {
// Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку можно открывать и закрывать.
    private String colorBox;
    private final int length;
    private final int width;
    private final int height;
    private boolean isOpenBox;
    private boolean isAnItemInTheBox;

    //  Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
    public void setColorBox(String colorBox) {
        this.colorBox = colorBox;
        System.out.println("Цвет коробки изменен");
    }
    public Box(String colorBox, int length, int width, int height) {
        this.colorBox = colorBox;
        this.length = length;
        this.width = width;
        this.height = height;
        this.isOpenBox = true;
        this.isAnItemInTheBox = true;
    }

//    У коробки должен быть метод, печатающий информацию о ней в консоль.
    public void printInfoBox() {
        System.out.println("Цвет: " + colorBox);
        System.out.println("Высота: " + height);
        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);

        if (isOpenBox) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }

        if (isAnItemInTheBox) {
            System.out.println("В коробке есть предмет");
        } else {
            System.out.println("В коробке нет предмета");
        }
    }

//    В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда
//    (только если предмет в ней есть), только при условии, что коробка открыта (предметом читаем просто строку).
//    Выполнение методов должно сопровождаться выводом сообщений в консоль.

    public void openBox() {
        if (isOpenBox) {
            System.out.println("Коробка уже открыта");
        } else {
            System.out.println("Коробка открыта");
            this.isOpenBox = true;
        }
    }

    public void closeBox() {
        if (isOpenBox) {
            System.out.println("Коробка закрыта");
            this.isOpenBox = false;
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }


    public void putAnItemInBox() {
        if (isOpenBox) {
            if (isAnItemInTheBox) {
                System.out.println("В коробке уже есть предмет.\n " +
                        " Для того чтобы положить новый предмет в коробку, уберите старый");

            } else {
                System.out.println("Вы положили предмет в коробку");
                isAnItemInTheBox = false;
            }
        } else {
            System.out.println("Коробка закрыта. Нельзя положить предмет в закрытую коробку \n" +
                    "Откройте коробку и после положите в него предмет");
        }
    }

    public void removeItemFromBox() {
        if (isOpenBox) {
            if (isAnItemInTheBox) {
                System.out.println("Вы убрали предмет из коробки");
                isAnItemInTheBox = false;
            } else {
                System.out.println("В коробке и так нет предмета");

            }
        } else {
            System.out.println("Коробка закрыта. Вы не видите, есть ли предмет в коробке \n" +
                    "Откройте коробку и посмотрите");
        }
    }
}
