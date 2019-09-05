package com.rakesh.hashtable;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 124);
        Employee marySmith = new Employee("Mary", "Smith", 125);
        Employee mikeWilson = new Employee("Mike", "Wilson", 126);
        Employee billEnd = new Employee("Bill", "End", 127);

        ChainedHashTable ht = new ChainedHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

       // System.out.println(ht.get("Smith"));
        ht.printHashTable();

        /*System.out.println("Removed: " + ht.remove("Jones"));
        ht.printHashTable();

        System.out.println("Retrieved: " + ht.get("Wilson"));*/
    }
}
