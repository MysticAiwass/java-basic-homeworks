package ru.aiwass.java_basic.homeworks.module_two.lesson17;

public class MyStack <T> extends MyLinkedList{
    public void push(T data){
        addLast(data);
    }

    public T pop (){
        T deleteElement = (T) getLast();
        remove(size() - 1);
        return deleteElement;
    }
}
