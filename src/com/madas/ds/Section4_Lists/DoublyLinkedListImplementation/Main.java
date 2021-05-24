package com.madas.ds.Section4_Lists.DoublyLinkedListImplementation;

import com.madas.ds.Section4_Lists.model.Employee;

public class Main {
    public static void main(String[] args) {

        EmployeeLinkedList list = new EmployeeLinkedList();

        Employee johnDoe = new Employee(1, "John", "Doe");
        Employee markZuck = new Employee(2, "Mark", "Zuck");
        Employee jennyWho = new Employee(3, "Jenny", "Who");
        Employee markCuban = new Employee(4, "Mark", "Cuban");

        list.addToBeginning(johnDoe);
        list.addToBeginning(markZuck);
        list.addToBeginning(jennyWho);
        list.addToBeginning(markCuban);

        list.addBefore(johnDoe, new Employee(0, "Steph", "Curry"));

        list.printList();


        /*

        while (list.size() != 0) {
            Employee res = list.removeFromEnd();
            System.out.println(res);
        }

        list.printList();


        list.addToEnd(johnDoe);
        list.addToEnd(markZuck);
        list.addToEnd(jennyWho);
        list.addToEnd(markCuban);


        list.printList();


        while (list.size() != 0) {
            Employee res = list.removeFromBeginning();
            System.out.println(res);
        }

        list.printList();
*/
    }
}
