package ru.aiwass.java_basic.homeworks.module_2.lesson17;

public class MyQueue<T> {

    MyLinkedList<T> myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public void offer(T data) {
        myLinkedList.addLast(data);
    }

    public T poll() {
        if (size() == 0) {
            return null;
        }

        T deletedElement = myLinkedList.getFirst();
        myLinkedList.remove(0);
        return deletedElement;
    }

    public int size() {
        return myLinkedList.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('[');
        for (int i = 0; i < size(); i++) {
            sb.append(myLinkedList.get(i));
            if (i != size() - 1) {
                sb.append(", ");
            }
        }
        return sb.append(']').toString();
    }
}
