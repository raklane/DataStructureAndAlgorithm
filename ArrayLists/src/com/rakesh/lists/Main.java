package com.rakesh.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rakesh", "Kumar", 123));
        employeeList.add(new Employee("Manish", "Anand", 124));
        employeeList.add(new Employee("Sudesh", "Deshpande", 125));
        employeeList.add(new Employee("Naveen", "Biradar", 126));

        //employeeList.forEach(employee -> System.out.println(employee));
        //System.out.println(employeeList.get(1));
        //System.out.println(employeeList.isEmpty());

        /*employeeList.set(1, new Employee("Neha", "Das", 127));
        employeeList.forEach(employee -> System.out.println(employee));*/

        //System.out.println(employeeList.size());

        /*employeeList.add(2, new Employee("Pintu", "Kumar", 128));
        employeeList.forEach(employee -> System.out.println(employee));*/

        /*Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray){
            System.out.println(employee);
        }*/


        employeeList.remove(new Employee("Rakesh", "Kumar", 123));
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
