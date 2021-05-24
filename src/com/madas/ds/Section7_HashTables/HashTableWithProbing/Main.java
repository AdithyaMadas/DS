package com.madas.ds.Section7_HashTables.HashTableWithProbing;

import com.madas.ds.Section7_HashTables.Employee;

public class Main {
    /*
    *
    * In linear probing, if an element already exists at an index, then we increment the index and check if the next position is available, we keep doing it until we find a free position
    *   and then insert the element into the array in that position.
    *
    * */
    public static void main(String[] args) {
        EmployeeHashTable table = new EmployeeHashTable();

        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(4567, "John", "Doe");
        Employee marySmith = new Employee(22, "Mary", "Smith");
        Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
        Employee billEnd = new Employee(78, "Bill", "End");

        table.put("Jones", janeJones);
        table.put("Doe", johnDoe);
        table.put("Smith", marySmith);
        table.put("Wilson", mikeWilson);
        table.put("End", billEnd);

        System.out.println();

        System.out.println("Removed Jones -> " + table.remove("Jones"));
        table.get("Jones");
        System.out.println(table.get("Wilson"));
        System.out.println(table.get("Smith"));

        table.print();
    }
}
