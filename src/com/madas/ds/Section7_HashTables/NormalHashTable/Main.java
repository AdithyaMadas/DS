package com.madas.ds.Section7_HashTables.NormalHashTable;

import com.madas.ds.Section7_HashTables.Employee;

public class Main {
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

        System.out.println(table.get("Doe"));
        System.out.println(table.remove("Doe"));
        System.out.println(table.get("Doe"));
        System.out.println();

        table.print();
    }
}
