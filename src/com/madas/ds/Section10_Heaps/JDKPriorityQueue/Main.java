package com.madas.ds.Section10_Heaps.JDKPriorityQueue;

import java.util.PriorityQueue;

public class Main {
    /*
    * Priority queue is an implementation of MinHeap. It stores the min element at index 0, and follows other heap properties.
    * */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(0);
        pq.add(123);
        pq.add(44);
        pq.add(-1);
        pq.add(-29);
        pq.add(89);

        System.out.println(pq.poll()); //Removes element with highest priority and returns it
        System.out.println(pq.remove(44));

        System.out.println(pq.peek());
    }
}
