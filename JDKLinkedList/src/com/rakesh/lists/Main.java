package com.rakesh.lists;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList();

        Employee rakeshKumar = new Employee("Rakesh", "Kumar", 123);
        Employee manishAnand = new Employee("Manish", "Anand", 124);
        Employee sudeshDeshpande = new Employee("Sudesh", "Deshpande", 125);
        Employee naveenBiradar = new Employee("Naveen", "Biradar", 126);

        list.addFirst(rakeshKumar);
        list.addFirst(manishAnand);
        list.addLast(sudeshDeshpande);
        list.add(naveenBiradar);

//        for(Employee employee : list){
//            System.out.println(employee);
//        }
        list.remove();
        list.removeLast();
        list.removeFirst();

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
