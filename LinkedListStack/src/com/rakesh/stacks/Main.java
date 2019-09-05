package com.rakesh.stacks;

public class Main {

    public static void main(String[] args) {

        LinkedListStack linkedListStack = new LinkedListStack();

        linkedListStack.push(new Employee("Rakesh", "Kumar", 123));
        linkedListStack.push(new Employee("Manish", "Anand", 124));
        linkedListStack.push(new Employee("Sudesh", "Deshpande", 125));
        linkedListStack.push(new Employee("Naveen", "Biradar", 126));

        //linkedListStack.printStack();

        //System.out.println(linkedListStack.peek());

        linkedListStack.pop();
        linkedListStack.printStack();

    }
}
