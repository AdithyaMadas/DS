package com.madas.ds.Section7_HashTables.ChainedHashtable;

import com.madas.ds.Section7_HashTables.Employee;
import com.madas.ds.Section7_HashTables.HashTableWithProbing.EmployeeHashTable;

public class Main {
    /*
     *
     * Chaining is another way to handle collisions in hashTable, collisions means when element already exists at that key, but we need to insert another element.
     *
     * Chaining is a way where, we store elements as an array of linked lists. So when we get a collision, we just add element to the Linked List at that position.
     *
     * */
    public static void main(String[] args) {
        ChainedHashTable table = new ChainedHashTable();

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
        System.out.println(table.get("Jones"));
        System.out.println(table.get("Wilson"));
        System.out.println(table.get("Smith"));

        table.print();
    }
}
