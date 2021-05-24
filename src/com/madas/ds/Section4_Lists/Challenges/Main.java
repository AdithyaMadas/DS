package com.madas.ds.Section4_Lists.Challenges;

public class Main {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();

        list.insertSorted(4);
        list.insertSorted(5);
        list.insertSorted(2);
        list.insertSorted(3);

        list.printList();
    }
}
