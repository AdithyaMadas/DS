package com.madas.ds.Section6_Queues.QueueImplementation;

public class Main {
    //Queue is a FIFO data structure
    public static void main(String[] args) {

        EmployeeQueue queue = new EmployeeQueue(5);

        //In the below scenario, at once we only keep 2 elements at once at most. But still, the front and back elements keep increasing, so the array gets resized to length 10.
        // this is very bad because, even though we are only storing 2 elements, the array got resized to size 10. To resolve this we can use circular queues.
        // In circular queues when back reaches the array length, it checks if front is still pointing to 0, if not then it writes elements to the front of the queue, hence resizing it.

        queue.add(new Employee(1, "Adithya", "Madas"));
        queue.remove();
        queue.add(new Employee(3, "Devika", "Madas"));
        queue.remove();
        queue.add(new Employee(4, "Bhaskar", "Madas"));
        queue.remove();
        queue.add(new Employee(5, "QERT", "Madas"));
        queue.remove();
        queue.add(new Employee(6, "Smaple", "Madas"));


        queue.print();
    }
}
