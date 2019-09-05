package academy.learnprogramming.stackschallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome2("abccba"));
        // should return true
        System.out.println(checkForPalindrome2("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome2("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome2("hello"));
        // should return true
        System.out.println(checkForPalindrome2("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        string = string.replaceAll("[^a-z,A-Z]", "").toLowerCase();

        LinkedListStack list = new LinkedListStack();
        for (int i=0; i<string.length() ;i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                list.push(string.charAt(i));
            }
        }
        for (int i=0; i<string.length()/2 ;i++){
            if(string.charAt(i) != list.pop()){
                return false;
            }
        }

        return true;
    }

    public static boolean checkForPalindrome2(String string){

        LinkedList<Character> list = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i=0; i<string.length() ;i++){
            if(lowerCase.charAt(i) >='a' && lowerCase.charAt(i) <= 'z'){
                list.push(lowerCase.charAt(i));
                stringNoPunctuation.append(lowerCase.charAt(i));
            }
        }

        StringBuilder reverseString = new StringBuilder(list.size());
        while (!list.isEmpty())
            reverseString.append(list.pop());

        System.out.println(stringNoPunctuation + "---" + reverseString);

        if(stringNoPunctuation.toString().equals(reverseString.toString()))
            return true;
        return false;

    }
}


