package ru.aiwass.java_basic.homeworks.module_two.lesson17;

public class MyQueue<T> extends MyLinkedList {
    public void offer(T data) {
        addFirst(data);
    }

    public T poll() {
        T deleteElement = (T) getLast();
        remove(size() - 1);
        return deleteElement;
    }
}
