package com.rakesh.lists;

public class Main {

    public static void main(String[] args) {

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());
        list.addToEnd(new Employee("Rakesh", "Kumar", 123));
        list.addToFront(new Employee("Manish", "Anand", 124));
        list.addToEnd(new Employee("Sudesh", "Deshpande", 125));

        list.removeFromFront();
        list.removeFromEnd();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();
    }
}
