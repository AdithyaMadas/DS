package com.madas.ds.Section5_Stacks;

import com.madas.ds.Section4_Lists.model.Employee;

public class MainLinkedStack {
    public static void main(String[] args) {
        LinkedListStacks stack = new LinkedListStacks();
        stack.push(new Employee(1, "adi", "madas"));
        stack.push(new Employee(2, "Hello", "World"));
        stack.push(new Employee(3, "John", "Doe"));

        Employee res = stack.peek();
        stack.pop();

        stack.print();
    }
}

