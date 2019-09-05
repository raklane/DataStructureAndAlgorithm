package academy.learnprogramming.queueschallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();

        for(int i=0; i<string.length(); i++){
            Character currentChar = string.toLowerCase().charAt(i);
            if(currentChar>='a' && currentChar<='z'){
                stack.push(currentChar);
                queue.addLast(currentChar);
            }
        }

        int size = stack.size();
        for(int i=0; i<size/2; i++){
            if(stack.pop() != queue.removeFirst()){
                return false;
            }
        }

        return true;
    }
}
