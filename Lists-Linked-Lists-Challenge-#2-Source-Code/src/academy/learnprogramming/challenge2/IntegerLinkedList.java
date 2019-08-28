package academy.learnprogramming.challenge2;

import java.util.Iterator;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        // add your code here

        IntegerNode newNode = new IntegerNode(value);

        if (head == null){
            head= newNode;
            return;
        }

        IntegerNode node = head;
        IntegerNode prevNode = null;
        while (node != null){
            if(node.getValue() > newNode.getValue()){
                if(prevNode!=null){
                    prevNode.setNext(newNode);
                }else
                    head = newNode;
                newNode.setNext(node);
                return;
            }
            prevNode = node;
            node = node.getNext();
        }
        prevNode.setNext(newNode);

        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
