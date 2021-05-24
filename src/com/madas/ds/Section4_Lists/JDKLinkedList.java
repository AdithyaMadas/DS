package com.madas.ds.Section4_Lists;

import com.madas.ds.Section4_Lists.model.Employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JDKLinkedList {

    /*
    * JDK implements Doubly linked list, while keeping reference to the head and tail.
    * */

    public static void main(String[] args) {

        // Note not using List<Employee>, because LinkedList has a few more useful methods.
        LinkedList<Employee> list = new LinkedList<>();


        Employee johnDoe = new Employee(1, "John", "Doe");
        Employee markZuck = new Employee(2, "Mark", "Zuck");
        Employee jennyWho = new Employee(3, "Jenny", "Who");
        Employee markCuban = new Employee(4, "Mark", "Cuban");


        list.add(markCuban); // adds to the end of the list
        list.addFirst(jennyWho);
        list.add(johnDoe);


        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" <=> ");
        }
        System.out.println();

        list.remove(); // removes first element
        list.removeLast(); // removes last element

        iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" <=> ");
        }
        System.out.println();

        System.out.println(list.contains(markCuban));
        System.out.println(list.indexOf(markCuban));
        list.add(markCuban); // adds to the end of the list
        System.out.println(list.lastIndexOf(markCuban));
        System.out.println(list.get(0));
        list.removeLast();
        list.removeFirst();

        iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" <=> ");
        }
        System.out.println();
    }

}
