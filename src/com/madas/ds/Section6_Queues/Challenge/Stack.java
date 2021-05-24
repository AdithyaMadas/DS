package com.madas.ds.Section6_Queues.Challenge;

import java.util.LinkedList;

public class Stack<E> {
    LinkedList<E> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void add(E element) {
        list.addFirst(element);
    }

    public E remove() {
        return list.removeFirst();
    }

    public E peek() {
        return list.peekFirst();
    }
}
