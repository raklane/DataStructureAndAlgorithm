package com.rakesh.queue;

public class Main {

    public static void main(String[] args) {

        ArrayCircularQueue queue = new ArrayCircularQueue(2);
        queue.enqueue(new Employee("Rakesh", "Kumar", 123));
        queue.enqueue(new Employee("Sudesh", "Deshpande", 124));

        queue.enqueue(new Employee("Manish", "Anand", 125));

        //System.out.println(queue.getSize());
        //queue.dequeue();
        queue.printQueue();

        //System.out.println(queue.peek());

    }
}
