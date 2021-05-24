package com.madas.ds.Section7_HashTables.HashTableWithProbing;

import com.madas.ds.Section7_HashTables.Employee;

public class EmployeeHashTable {
    StoredEmployee[] employee;

    public EmployeeHashTable() {
        employee = new StoredEmployee[10];
    }


    public void put(String key, Employee employee) {
        if (this.employee[hash(key)] == null) {
            this.employee[hash(key)] = new StoredEmployee(key, employee);
            return;
        }
        int stopIndex = hash(key);
        int position = stopIndex + 1;
        while (position != stopIndex && this.employee[position] != null) {
            position = (position + 1) % this.employee.length;
        }
        if (position == stopIndex) {
            System.out.println("No positions for the Employee, all positions full");
            return;
        }
        this.employee[position] = new StoredEmployee(key, employee);
    }

    public Employee get(String key) {
        if (employee[hash(key)] != null && employee[hash(key)].key == key) {
            return employee[hash(key)].employee;
        }
        int stopIndex = hash(key);
        int position = stopIndex + 1;
        while (position != stopIndex) {
            if (employee[position] == null) {
                position = (position + 1) % this.employee.length;
            } else if (this.employee[position].key == key) {
                break;
            } else {
                position = (position + 1) % this.employee.length;
            }
        }
        if (position == stopIndex) {
            System.out.println("Employee not found!");
            return null;
        }
        return this.employee[position].employee;
    }

    public Employee remove(String key) {
        if (employee[hash(key)].key == key) {
            Employee emp = employee[hash(key)].employee;
            employee[hash(key)] = null;
            return emp;
        }
        int stopIndex = hash(key);
        int position = stopIndex + 1;
        while (position != stopIndex) {
            if (employee[position] == null) {
                position = (position + 1) % this.employee.length;
            } else if (this.employee[position].key == key) {
                break;
            } else {
                position = (position + 1) % this.employee.length;
            }
        }
        if (position == stopIndex) {
            System.out.println("Employee not found!");
            return null;
        }
        Employee emp = this.employee[position].employee;
        this.employee[position] = null;
        return emp;
    }

    public int hash(String key) {
        return key.length() % employee.length;
    }

    public void print() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                System.out.println(i + " -> " + employee[i]);
                continue;
            }
            System.out.println(i + " -> " + employee[i].employee);
        }
    }
}
