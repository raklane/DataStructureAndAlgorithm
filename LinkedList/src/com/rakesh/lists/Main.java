package com.rakesh.lists;

public class Main {

    public static void main(String[] args) {

        Employee rakeshKumar = new Employee("Rakesh", "Kumar", 123);
        Employee manishKumar = new Employee("Manish", "Anand", 124);
        Employee sudeshDeshpande = new Employee("Sudesh", "Deshpande", 125);
        Employee naveenBiradar = new Employee("Naveen", "Biradar", 126);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(rakeshKumar);
        list.addToFront(manishKumar);
        list.addToFront(sudeshDeshpande);
        list.addToFront(naveenBiradar);

        list.printList();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
