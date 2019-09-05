package com.rakesh.hashtable;

import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 124);
        Employee marySmith = new Employee("Mary", "Smith", 125);
        Employee mikeWilson = new Employee("Mike", "Wilson", 126);
        Employee billEnd = new Employee("Bill", "End", 127);

        HashMap<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        hashMap.put("Wilson", mikeWilson);

        /*Employee employee = hashMap.put("Doe", billEnd);
        System.out.println("Duplicated removed value: " +  employee);*/

        /*Employee employee = hashMap.putIfAbsent("Doe", billEnd);
        System.out.println("Duplicate value not replaced: " + employee);*/

        /*System.out.println(hashMap.get("Doe"));
        System.out.println(hashMap.get("Kumar"));
        System.out.println(hashMap.getOrDefault("Kumar", mikeWilson));*/

//        System.out.println(hashMap.remove("Doe"));

        System.out.println(hashMap.replace("Doe", new Employee("Rakesh", "Kumar", 127)));
        hashMap.forEach((K,V) -> System.out.println("Key: " + K + ", Value: " + V));

        /*Iterator<Employee> iterator = hashMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        /*System.out.println(hashMap.containsKey("John"));
        System.out.println(hashMap.containsValue(marySmith));*/

        //hashMap.forEach((K,V) -> System.out.println("Key: " + K + ", Value: " + V));
    }
}
