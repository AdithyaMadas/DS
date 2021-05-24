package com.madas.ds.Section7_HashTables.ChainedHashtable;

import com.madas.ds.Section7_HashTables.HashTableWithProbing.StoredEmployee;
import com.madas.ds.Section7_HashTables.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    LinkedList<StoredEmployee>[] employee;

    public ChainedHashTable() {
        employee = new LinkedList[10];
        for (int i = 0; i < employee.length; i++) {
            employee[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        this.employee[hash(key)].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        LinkedList<StoredEmployee> employees = this.employee[hash(key)];
        ListIterator<StoredEmployee> iterator = employees.listIterator();
        while (iterator.hasNext()) {
            StoredEmployee next = iterator.next();
            if (next.key == key) {
                return next.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        LinkedList<StoredEmployee> employees = this.employee[hash(key)];
        ListIterator<StoredEmployee> iterator = employees.listIterator();
        while (iterator.hasNext()) {
            StoredEmployee next = iterator.next();
            if (next.key == key) {
                Employee emp = next.employee;
                iterator.remove();
                return emp;
            }
        }
        return null;
    }

    public int hash(String key) {
        return key.length() % employee.length;
    }

    public void print() {
        for (int i = 0; i < employee.length; i++) {
            System.out.printf(i + " -> ");
            ListIterator<StoredEmployee> iterator = employee[i].listIterator();
            while (iterator.hasNext()) {
                System.out.printf(iterator.next().employee + " -> ");
            }
            System.out.println();
        }
    }
}
