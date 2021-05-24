package com.madas.ds.Section7_HashTables.Challanges._1;

import com.madas.ds.Section7_HashTables.Challanges._2.Employee;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees = removeDuplicates(employees);

        employees.forEach(e -> System.out.println(e));
    }

    public static LinkedList<Employee> removeDuplicates(List<Employee> list) {
        Map<Integer, Employee> map = new HashMap<>();
        LinkedList<Employee> newList = new LinkedList<>();
        for (Employee emp : list) {
            if (map.put(emp.getId(), emp) == null) {
                newList.add(emp);
            }
        }
        return newList;
    }

}

