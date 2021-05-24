package com.madas.ds.Section4_Lists.SingleListImplmentation;

import com.madas.ds.Section4_Lists.model.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToBeginning(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        size++;
        employeeNode.setNext(head);
        head = employeeNode;
    }

    public int size() {
        return size;
    }

    public boolean inEmpty() {
        return head == null;
    }

    public Employee removeFromBeginning() {
        EmployeeNode employeeNode = head;
        size--;
        head = employeeNode.getNext();
        return employeeNode.getEmployee();
    }


    public void printList() {
        EmployeeNode curr = head;
        while (curr != null) {
            System.out.print(curr);
            System.out.print(" -> ");
            curr = curr.getNext();
        }
        System.out.println("NULL");
    }
}
