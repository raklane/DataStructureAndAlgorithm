package com.rakesh.hashtable;

import java.util.Iterator;
import java.util.LinkedList;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] employees;

    public ChainedHashTable(){
        employees = new LinkedList[10];
        for(int i=0; i<employees.length; i++)
            employees[i] = new LinkedList<StoredEmployee>();
    }

    private int hashKey(String key){
        //return key.length() % employees.length;
        return  Math.abs(key.hashCode() % employees.length);
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        employees[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        StoredEmployee employee = null;
        Iterator<StoredEmployee> iterator = employees[hashedKey].listIterator();
        while (iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        StoredEmployee employee = null;
        int index = -1;
        Iterator<StoredEmployee> iterator = employees[hashedKey].listIterator();
        while(iterator.hasNext()){
            index++;
            employee = iterator.next();
            if(employee.key.equals(key)){
                employees[hashedKey].remove(index);
                return employee.employee;
            }
        }
        return null;
    }

    public void printHashTable(){
        for(int i=0; i<employees.length; i++){
            if(employees[i].isEmpty())
                System.out.println("Position_" + i + ": empty");
            else{
                StoredEmployee employee = null;
                Iterator<StoredEmployee> iterator = employees[i].listIterator();
                System.out.print("Position_" + i + ": ");
                while(iterator.hasNext()){
                    employee= iterator.next();
                    System.out.print(employee.employee + "->");
                }
                System.out.println("null");
            }
        }
    }

}
