package com.madas.ds.Section6_Queues.CircularQueueImplmentation;

import com.madas.ds.Section6_Queues.QueueImplementation.Employee;

public class Main {


    public static void main(String[] args) {
        EmployeeCircularQueue queue = new EmployeeCircularQueue(3);
        queue.add(new Employee(1, "Adithya", "Madas"));
//        queue.remove();
        queue.add(new Employee(3, "Devika", "Madas"));
        queue.remove();
        queue.add(new Employee(4, "Bhaskar", "Madas"));
//        queue.remove();
        queue.add(new Employee(5, "QERT", "Madas"));
//        queue.remove();
        queue.add(new Employee(6, "Smaple", "Madas"));
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        queue.print();
    }
}
