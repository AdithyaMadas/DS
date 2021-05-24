package com.madas.ds.Section7_HashTables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JDKHashTables {
    /*
    * Most common implementation of HashTables in Java are Maps.
    *
    *   Maps are key value pairs. (Map<K,V>). For a specific key, only one Value can exist. i.e. say for Key "Smith", only one value can exist.
    *
    *
    * */
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();

        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(4567, "John", "Doe");
        Employee marySmith = new Employee(22, "Mary", "Smith");
        Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
        Employee billEnd = new Employee(78, "Bill", "End");

        map.put("Jones", janeJones);
        map.put("Smith", marySmith);
        map.put("Wilson", mikeWilson);
        map.put("End", billEnd);

//        If you put an element for the same key, then it replaces the element and returns the previous element which used to exist for that key.
        System.out.println(map.put("End", johnDoe));

//      Only puts if key doesn't have any value
        System.out.println(map.putIfAbsent("End", billEnd));


//        System.out.println(map.containsKey("Jones"));
//        System.out.println(map.containsValue(johnDoe));

//        printing hashmap

/*        Iterator<Employee> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/




        map.forEach((k, v) -> System.out.println("Key " + k + " -> Value: " + v));
    }
}
