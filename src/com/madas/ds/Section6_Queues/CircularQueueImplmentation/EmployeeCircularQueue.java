package com.madas.ds.Section6_Queues.CircularQueueImplmentation;

import com.madas.ds.Section6_Queues.QueueImplementation.Employee;
import netscape.security.UserTarget;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class EmployeeCircularQueue {
    Employee[] list;
    int front;
    int back;

    public EmployeeCircularQueue(int capacity) {
        list = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == list.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[list.length * 2];
            System.arraycopy(list, front, newArray, 0, list.length - front);
            System.arraycopy(list, 0, newArray, list.length - front, back);
            list = newArray;
            front = 0;
            back = numItems;
        }

        // 0 Element
        // 1 Element
        // 2 Element   -back
        // 3  Element  -front
        // 4  Element


        list[back] = employee;
        if (back < list.length - 1) {
            back++;
        } else {
            back = 0;
        }
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        } else if (size() == 1) {
            Employee employee = list[front];
            list[front] = null;
            front = 0;
            back = 0;
            return employee;
        }
        Employee employee = list[front];
        list[front++] = null;
        if (front == list.length) {
            front = 0;
        }
        return employee;
    }

    public Employee peek() {
        return new Employee(list[front]);
    }

    public int size() {
        if (front <= back) {
            return back - front;
        } else {
            return back - front + list.length;
        }
    }

    public void print() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(list[i]);
            }
        } else {
            for (int i = front; i < list.length; i++) {
                System.out.println(list[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(list[i]);
            }
        }
    }
}
