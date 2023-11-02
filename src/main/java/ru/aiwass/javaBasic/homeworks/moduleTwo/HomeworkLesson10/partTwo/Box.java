package ru.aiwass.javaBasic.homeworks.moduleTwo.HomeworkLesson10.partTwo;

public class Box {
    // Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку можно открывать и закрывать.
    private String color;
    private final int length;
    private final int width;
    private final int height;
    private boolean isOpen;
    private Item item;

    //  Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет коробки изменен");
    }

    public Box(String color, int length, int width, int height) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.isOpen = true;
        this.item = null;
    }

    //    У коробки должен быть метод, печатающий информацию о ней в консоль.
    public void printInfo() {
        System.out.printf("Цвет: %s \n" +
                        "Высота: %s \n" +
                        "Ширина: %s \n" +
                        "Длина: %s \n",
                color, height, width, length);

        System.out.println(isOpen
                ? "Коробка открыта"
                : "Коробка закрыта");

        System.out.println(item != null
                ? "В коробке есть предмет: " + item.getName()
                : "В коробке нет предмета");
    }

//    В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда
//    (только если предмет в ней есть), только при условии, что коробка открыта (предметом читаем просто строку).
//    Выполнение методов должно сопровождаться выводом сообщений в консоль.

    public void open() {

        if (isOpen) {
            System.out.println("Коробка уже открыта");
        } else {
            System.out.println("Коробка открыта");
            this.isOpen = true;
        }
    }

    public void close() {
        if (isOpen) {
            System.out.println("Коробка закрыта");
            this.isOpen = false;
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }


    public void putItem(Item item) {
        if (isOpen) {
            if (this.item == null) {
                this.item = item;
                System.out.println("Вы положили предмет в коробку: " + item.getName());
            } else {
                System.out.println("В коробке уже есть предмет: " + this.item.getName() + "\n" +
                        " Для того чтобы положить новый предмет: " + item.getName() +
                        ". Уберите предмет: " + this.item.getName());
            }
        } else {
            System.out.println("Коробка закрыта. Нельзя положить предмет в закрытую коробку \n" +
                    "Откройте коробку и после положите в него предмет");
        }
    }

    public void removeItem() {
        if (isOpen) {
            if (this.item != null) {
                System.out.println("Вы убрали предмет из коробки: " + item.getName());
                this.item = null;
            } else {
                System.out.println("В коробке и так нет предмета");

            }
        } else {
            System.out.println("Коробка закрыта. Вы не видите, есть ли предмет в коробке \n" +
                    "Откройте коробку и посмотрите");
        }
    }
}
