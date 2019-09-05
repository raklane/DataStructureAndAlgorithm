package academy.learnprogramming.stackschallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {

    private LinkedList<Character> charLinkedList;

    public LinkedListStack(){
        charLinkedList = new LinkedList<Character>();
    }

    public void push(Character character){
        charLinkedList.push(character);
    }

    public Character peek(){
        return charLinkedList.peek();
    }

    public Character pop(){
        return charLinkedList.pop();
    }

    public boolean isEmpty(){
        return charLinkedList.isEmpty();
    }

    public void printStack(){
        ListIterator<Character> iterator= charLinkedList.listIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next());
        System.out.println("");
    }



}
