package com.madas.ds.Section4_Lists;

import com.madas.ds.Section4_Lists.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    /*
    *
    * List is an interface which denotes a list of items, it has many methods in it such as, add(), size(), indexOf(), get() etc.
    *
    *   ArrayList implements List and is a sequential implementation of the List. i.e. memory blocks are sequential. Arrays grow automatically, we don't need to habdle
    *       all that logic. When creating a new arrayList, the starting size is 10, if not specified. ArrayLists also implement Object[] in the backend.
    *
    *   ArrayLists are not thread safe, however Vectors are.
    *
    * */


    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>(5);
        // we can specify an initial capacity, if not specified, it is set to 10.

        // Adding to a list to the end:
        list.add(new Employee(1, "Adithya", "Madas"));

        //Adding at a specific position, not the end, O(n) if we insert in the beginning, we have to move all the elements to the right by one poistion
        list.add(0, new Employee(2, "Anjali", "Madas"));

        list.forEach(employee -> System.out.println(employee));
        System.out.println(list.size()); // Returns size, not capacity of the array.


        //Getting if we know the index, is O(1).
        System.out.println(list.get(0));
        System.out.println();

        //Overriding an element at an index is also O(1)
        list.set(1, new Employee(1, "Bhaskar", "Madas"));
        list.forEach(employee -> System.out.println(employee));

        //We can get an element's index by passing the object.
        System.out.println(list.indexOf(new Employee(1, "Bhaskar", "Madas")));

        System.out.println(list.contains(new Employee(2, "Anjali", "Madas")));

        list.remove(new Employee(3, "adithya", "madas")); // Doesn't do anything.
        list.remove(2);
    }
}
