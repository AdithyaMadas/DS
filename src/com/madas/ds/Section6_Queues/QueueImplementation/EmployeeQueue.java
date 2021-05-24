package com.madas.ds.Section6_Queues.QueueImplementation;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeQueue {
    Employee[] list;
    int front;
    int back;

    public EmployeeQueue(int capacity) {
        list = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (back == list.length) {
            Employee[] newArray = new Employee[list.length * 2];
            System.arraycopy(list, 0, newArray, 0, list.length);
            list = newArray;
        }
        list[back++] = employee;
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        } else if (size() == 1) {
            Employee employee = list[front];
            front = 0;
            back = 0;
            return employee;
        }
        Employee employee = list[front];
        list[front++] = null;
        return employee;
    }

    public Employee peek() {
        return new Employee(list[front]);
    }

    public int size() {
        return back - front;
    }

    public void print() {
        for (int i = front; i < back; i++) {
            System.out.println(list[i]);
        }
    }
}
