package com.madas.ds.Section5_Stacks;

import com.madas.ds.Section4_Lists.model.Employee;

import java.util.LinkedList;

public class LinkedListStacks {

    LinkedList<Employee> list;

    public LinkedListStacks() {
        this.list = new LinkedList<>();
    }

    public void push(Employee employee) {
        list.addFirst(employee);
    }

    public Employee pop() {
        return list.removeFirst();
    }

    public Employee peek() {
        return new Employee(list.peekFirst());
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
