package com.madas.ds.Section4_Lists.DoublyLinkedListImplementation;

import com.madas.ds.Section4_Lists.model.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToBeginning(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        size++;
        if (head == null && tail == null) {
            head = employeeNode;
            tail = employeeNode;
            return;
        }
        employeeNode.setNext(head);
        employeeNode.getNext().setPrevious(employeeNode);
        head = employeeNode;
    }

    //addBefore
    public boolean addBefore(Employee before, Employee toAdd) {
        EmployeeNode curr = head;
        while (curr != null) {
            if (curr.getEmployee().equals(before)) {
                EmployeeNode toInsert = new EmployeeNode(toAdd);
                curr.getPrevious().setNext(toInsert);
                toInsert.setPrevious(curr.getPrevious());
                toInsert.setNext(curr);
                curr.setPrevious(toInsert);
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        size++;
        if (head == null && tail == null) {
            head = employeeNode;
            tail = employeeNode;
            return;
        }
        employeeNode.setPrevious(tail);
        employeeNode.getPrevious().setNext(employeeNode);
        tail = employeeNode;
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
        if (employeeNode.getNext() == null) {
            tail = null;
        }
        head = employeeNode.getNext();
        return employeeNode.getEmployee();
    }

    public Employee removeFromEnd() {
        EmployeeNode employeeNode = tail;
        size--;
        if (employeeNode.getPrevious() == null) {
            head = null;
        }
        tail = employeeNode.getPrevious();
        return employeeNode.getEmployee();
    }

    public void printList() {
        EmployeeNode curr = head;
        while (curr != null) {
            System.out.print(curr);
            System.out.print(" <=> ");
            curr = curr.getNext();
        }
        System.out.println("NULL");
    }
}
