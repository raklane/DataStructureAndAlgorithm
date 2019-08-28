package com.rakesh.lists;

public class EmployeeLinkedList {

    EmployeeNode head;
    EmployeeNode tail;
    int size;


    public void addToFront(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);

        if(head == null){
            tail = employeeNode;
        }else {
            head.setPrevious(employeeNode);
        }
        head = employeeNode;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setPrevious(tail);

        if(tail == null){
            head = employeeNode;
        }else{
            tail.setNext(employeeNode);
        }
        tail = employeeNode;
        size++;
    }

    public EmployeeNode removeFromFront(){
        EmployeeNode removedNode = head;
        if(head == tail){
            head = null;
            tail = null;
            return removedNode;
        }
        head = removedNode.getNext();
        head.setPrevious(removedNode.getPrevious());
        removedNode.setPrevious(null);
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        EmployeeNode removedNode = tail;
        if(head == tail){
            head = null;
            tail = null;
            return removedNode;
        }
        tail = tail.getPrevious();
        tail.setNext(removedNode.getNext());
        removedNode.setPrevious(null);
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if(head == null && tail == null)
            return true;
        return false;
    }

    public void printList(){
        System.out.println("HEAD ->");
        EmployeeNode current = head;
        while (current!=null){
            System.out.println(current.getEmployee());
            current = current.getNext();
        }
    }

}
