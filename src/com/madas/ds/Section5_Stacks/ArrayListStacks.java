package com.madas.ds.Section5_Stacks;

import com.madas.ds.Section4_Lists.model.Employee;

public class ArrayListStacks {
    Employee[] list;
    int top;

    public ArrayListStacks(int capacity) {
        list = new Employee[capacity];
    }

    // Time complexity is O(n) because in worst case, we might have to resize the array
    public void push(Employee employee) {
        if (top == list.length) {
            Employee[] newArray = new Employee[list.length * 2];
            System.arraycopy(list, 0, newArray, 0, list.length);
            list = newArray;
        }
        list[top++] = employee;
    }

    //If we handle logic of resizing the array to smaller size, then it'll be O(n)
    public Employee pop() {
        return list[--top];
    }

    //Always O(1)
    public Employee peek() {
        return new Employee(list[top - 1]);
    }

    public void print() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }

}
