package com.rakesh.stacks;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Rakesh", "Kumar", 123));
        stack.push(new Employee("Manish", "Anand", 124));
        stack.push(new Employee("Sudesh", "Deshpande", 125));
        stack.push(new Employee("Naveen", "Biradar", 126));

        System.out.println(stack.peek());

        stack.printStack();

    }
}
