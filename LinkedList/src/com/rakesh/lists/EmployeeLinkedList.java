package com.rakesh.lists;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize(){
        return  size;
    }

    public boolean isEmpty(){
        if(head == null)
            return true;
        return false;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty())
            return null;

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.println("HEAD -> ");
        while (current!=null){
            System.out.println(current.getEmployee());
            current = current.getNext();
        }
    }

}
