package ru.aiwass.java_basic.homeworks.module_two.lesson17;

public class MyLinkedList<T> {

    private Item<T> first;
    private Item<T> last;
    private int count = 0;

    public void addFirst(T data) {
        Item<T> item = new Item<T>(null, data, first);
        if (first == null) {
            first = last = item;
        } else {
            first.prev = item;
            first = item;
        }
        count++;
    }

    public void addLast(T data) {
        Item<T> item = new Item<T>(last, data, null);
        if (last == null) {
            last = first = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }

    public void add(int position, T data) {
        if (position < 0 || position > count) {
            throw new IllegalArgumentException("Invalid position");
        }

        if (position == count) {
            addLast(data);
        } else if (position == 0) {
            addFirst(data);
        } else {
            Item<T> curr = getItemAtPosition(position - 1);
            Item<T> newNode = new Item<>(curr, data, curr.next);
            curr.next.prev = newNode;
            curr.next = newNode;
            count++;
        }
    }

    private Item<T> getItemAtPosition(int position) {
        Item<T> curr = first;
        for (int i = 0; i < position; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public T get(int position) {
        Item<T> item = getItemAtPosition(position);
        return item.value;
    }

    public int size() {
        return count;
    }

    public T getFirst() {
        if (first == null){
            return null;
        }
        return first.value;
    }

    public T getLast() {
        if (last == null){
            return null;
        }
        return last.value;
    }

    public void remove(int position) {
        if (position < 0 || position > count) {
            return;
        }
        first = (position == 0) ? first.next : first;

        Item<T> prev = getItemAtPosition(position - 1);
        Item<T> current = prev.next;
        Item<T> next = current.next;

        prev.next = next;
        last = (next == null) ? prev : last;

        count--;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder().append('[');
        Item current = first;
        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }
        return builder.append(']').toString();
    }

    private static class Item<A> {
        Item<A> prev;
        A value;
        Item<A> next;

        private Item(Item<A> prev, A value, Item<A> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
}
