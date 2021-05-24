package com.madas.ds.Section6_Queues.Challenge;

import java.util.LinkedList;

public class Queue<E> {
    LinkedList<E> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void add(E element) {
        list.addLast(element);
    }

    public E remove() {
        return list.removeFirst();
    }

    public E peek() {
        return list.peekFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}