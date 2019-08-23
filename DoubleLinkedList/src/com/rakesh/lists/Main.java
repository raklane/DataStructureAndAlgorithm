package com.rakesh.lists;

public class Main {

    public static void main(String[] args) {

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());
        list.addToFront(new Employee("Rakesh", "Kumar", 123));
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();
    }
}
