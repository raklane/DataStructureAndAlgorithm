package com.rakesh.arrays;

public class Main {

    public static void main(String[] args) {

        int num = 5;
        System.out.println("Factorial of " + num + " is: " + recursiveFactorial(num));

    }

    public static int recursiveFactorial(int i){
        if(i==0)
            return 1;

        return i * recursiveFactorial(i - 1);
    }
}
