package ru.aiwass.java_basic.homeworks.module_two.lesson17;

public class MyStack<T> {
    MyLinkedList<T> linkedList;

    public MyStack() {
        this.linkedList = new MyLinkedList<>();
    }

    public int size() {
        return linkedList.size();
    }

    public void push(T data) {
        linkedList.addLast(data);
    }

    public T pop() {
        if (size() == 0) {
            return null;
        }

        T deletedElement = linkedList.getLast();
        linkedList.remove(size() -1);
        return deletedElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('[');
        for (int i = size() - 1; i >= 0; i--) {
            sb.append(linkedList.get(i));
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.append(']').toString();
    }
}
