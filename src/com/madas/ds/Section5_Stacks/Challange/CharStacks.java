package com.madas.ds.Section5_Stacks.Challange;

import com.madas.ds.Section4_Lists.model.Employee;

import java.util.LinkedList;

public class CharStacks {

    LinkedList<Character> list;

    public CharStacks() {
        this.list = new LinkedList<>();
    }

    public void push(Character employee) {
        list.addFirst(employee);
    }

    public Character pop() {
        return list.removeFirst();
    }

    public Character peek() {
        return new Character(list.peekFirst());
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void print() {
        list.forEach(employee -> {
            System.out.println(employee);
        });
    }

}
