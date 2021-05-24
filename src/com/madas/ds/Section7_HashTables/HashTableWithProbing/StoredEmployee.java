package com.madas.ds.Section7_HashTables.HashTableWithProbing;

import com.madas.ds.Section7_HashTables.Employee;

public class StoredEmployee {

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    public String key;
    public Employee employee;
}
