package com.rakesh.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void enqueue(Employee employee){
        if(back==queue.length){
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue, front, newArray, 0, back-front);
            back = back-front;
            front = 0;
            queue = newArray;
        }
        queue[back++] = employee;
    }

    public Employee dequeue(){
        if(front==back)
            throw new NoSuchElementException();
        Employee emp = queue[front++];
        return emp;
    }

    public Employee peek(){
        Employee emp = queue[front];
        return emp;
    }

    public void printQueue(){
        System.out.println("FRONT -->");
        for(int i=front; i<back; i++){
            System.out.println(queue[i]);
        }
    }

    public int getSize(){
        return back-front;
    }

    public boolean isEmpty(){
        if(back-front == 0)
            return true;
        return false;
    }

}
