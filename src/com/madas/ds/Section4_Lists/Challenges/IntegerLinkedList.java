package com.madas.ds.Section4_Lists.Challenges;

import com.madas.ds.Section4_Lists.SingleListImplmentation.EmployeeNode;
import com.madas.ds.Section4_Lists.model.Employee;

import java.util.Iterator;

public class IntegerLinkedList {

    private IntegerNode head;

    public void insertSorted(int number) {
        if (head == null || head.getValue() > number) {
            addToBeginning(number);
            return;
        }
        IntegerNode curr = head.getNext();
        IntegerNode previous = head;
        while (curr!=null && curr.getValue() < number) {
            previous = curr;
            curr = curr.getNext();
        }
        IntegerNode toInsert = new IntegerNode(number);
        toInsert.setNext(curr);
        previous.setNext(toInsert);
    }

    public void printList() {
        IntegerNode curr = head;
        while (curr != null) {
            System.out.printf(curr.getValue() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public void addToBeginning(Integer number) {
        IntegerNode employeeNode = new IntegerNode(number);
        employeeNode.setNext(head);
        head = employeeNode;
    }
}
