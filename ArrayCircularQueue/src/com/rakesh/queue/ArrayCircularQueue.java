package com.rakesh.queue;

import java.util.NoSuchElementException;

public class ArrayCircularQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayCircularQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void enqueue(Employee employee){

        if(getSize() == queue.length-1){
            int numItems = getSize();
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue, front, newArray,0, queue.length-front);
            System.arraycopy(queue, 0, newArray, queue.length-front, back);

            front = 0;
            back = numItems;
            queue = newArray;
        }

        queue[back] = employee;
        if(back<queue.length)
            back++;
        else
            back = 0;
    }

    public Employee dequeue(){
        if(front==back)
            throw new NoSuchElementException();
        Employee emp = queue[front];
        if(front==queue.length)
            front = 0;
        else
            front++;
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
        if(back - front < 0)
            return  queue.length-front+back;
        return back-front;
    }

    public boolean isEmpty(){
        if(back-front == 0)
            return true;
        return false;
    }

}
