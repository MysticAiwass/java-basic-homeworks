package ru.aiwass.java_basic.homeworks.module_2.lesson17;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 1; i < 7; i++) {
            myLinkedList.addLast(i);
        }
        System.out.println("ЛИСТ");
        System.out.println("Добавили элементы в лист: " + myLinkedList);

        for (int i = myLinkedList.size() - 1; i >= 0; i--) {
            myLinkedList.remove(i);
        }
        System.out.println("Удалили элементы из листа: " + myLinkedList);

        System.out.println("--------------------------------");
        System.out.println("ОЧЕРЕДЬ");

        // первым пришел - первый вышел
        MyQueue<Integer> myQueue = new MyQueue<>();

        for (int i = 1; i < 5; i++) {
            myQueue.offer(i);
        }

        System.out.println("Добавили элементы в очередь: " + myQueue);

        for (int i = myQueue.size() - 1; i >= 0; i--) {
            System.out.println(myQueue.poll());
        }

        System.out.println("Забрали элементы из очереди: " + myQueue);


        System.out.println("--------------------------------");
        System.out.println("СТЕК");

        //последним пришел — первым вышел
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Маша");
        myStack.push("Катя");
        myStack.push("Оля");
        myStack.push("Мася");//

        System.out.println("Добавили элементы в стек: " + myStack);

        while (myStack.size() > 0) {
            System.out.println(myStack.pop());
        }

        System.out.println("Забрали элементы из стека: " + myStack);
    }
}
