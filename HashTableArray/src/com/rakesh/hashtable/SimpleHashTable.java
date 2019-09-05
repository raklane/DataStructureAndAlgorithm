package com.rakesh.hashtable;

public class SimpleHashTable {

    private StoredEmployee[] employees;

    public SimpleHashTable(){
        employees = new StoredEmployee[10];
    }

    private int hashKey(String key){
        return key.length() % employees.length;
    }

    public void put(String key, Employee employee){
        int hashKey = hashKey(key);
        if(occupied(hashKey)){
            int stopIndex = hashKey;
            if(hashKey == employees.length-1){
                hashKey = 0;
            }else{
                hashKey++;
            }
            while (occupied(hashKey) && hashKey != stopIndex){
                hashKey = (hashKey+1) % employees.length;
            }
        }
        if(employees[hashKey] != null){
            System.out.println("Sorry there is already an employee at position: " + hashKey);
        }else{
            employees[hashKey] = new StoredEmployee(key, employee);
        }
    }

    public boolean occupied(int hashKey){
        return employees[hashKey] != null;
    }

    public Employee get(String key){
        int hashKey = findKey(key);
        if(hashKey == -1)
            return null;
        return employees[hashKey].employee;
    }

    public int findKey(String key){
        int hashKey = hashKey(key);
        if(employees[hashKey] != null && employees[hashKey].employee.equals(key)){
            return hashKey;
        }
        int stopIndex = hashKey;
        if(hashKey == employees.length)
            hashKey = 0;
        else
            hashKey++;
        while(hashKey!=stopIndex && !employees[hashKey].key.equals(key)){
            hashKey = (hashKey+1) % employees.length;
        }

        if(hashKey == stopIndex)
            return -1;
        return hashKey;
    }

    public void printHashTable(){
        for(int i=0; i<employees.length; i++)
            if(employees[i] == null)
                System.out.println(i + ":" + "empty");
            else
                System.out.println(i + ":" + employees[i].employee);
    }

    public Employee remove(String key){
        int hashKey = hashKey(key);
        StoredEmployee employeeRemoved = employees[hashKey];
        employees[hashKey] = null;

        StoredEmployee[] oldEmployees = employees;
        employees = new StoredEmployee[oldEmployees.length];
        for(int i=0; i<oldEmployees.length; i++){
            if(oldEmployees[i] != null)
                put(oldEmployees[i].key, oldEmployees[i].employee);
        }

        return employeeRemoved.employee;
    }

}
