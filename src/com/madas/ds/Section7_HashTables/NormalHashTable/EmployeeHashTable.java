package com.madas.ds.Section7_HashTables.NormalHashTable;

import com.madas.ds.Section7_HashTables.Employee;

public class EmployeeHashTable {
    Employee[] employee;

    public EmployeeHashTable() {
        employee = new Employee[10];
    }


    public void put(String key, Employee employee) {
        if (this.employee[hash(key)] != null) {
            System.out.println("Element already exists at index: " + hash(key));
            return;
        }
        this.employee[hash(key)] = employee;
    }

    public Employee get(String key) {
        return employee[hash(key)];
    }


    public Employee remove(String key) {
        Employee emp = employee[hash(key)];
        employee[hash(key)] = null;
        return emp;
    }

    public int hash(String key) {
        return key.length() % employee.length;
    }

    public void print() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
}
