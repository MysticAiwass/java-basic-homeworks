package ru.aiwass.java_basic.homeworks.module_two.lesson17;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(6);

        System.out.println("ЛИСТ");
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());

        System.out.println("--------------------------------");
        System.out.println("ОЧЕРЕДЬ");

        // первым пришел - первый вышел
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.offer(1); //первая вошла
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(5);

        System.out.println(myQueue);
        System.out.println(myQueue.poll()); // вывод 1
        System.out.println(myQueue.poll()); //вывод 2
        System.out.println(myQueue);

        System.out.println("--------------------------------");
        System.out.println("СТЕК");

        //последним пришел — первым вышел
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Маша");
        myStack.push("Катя");
        myStack.push("Оля");
        myStack.push("Мася");// последняя

        System.out.println(myStack);
        System.out.println(myStack.pop()); // вывод Мася
        System.out.println(myStack.pop());// вывод Оля
        System.out.println(myStack);
    }


}
