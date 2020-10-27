package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex6 {
    //check voor palindroom

    public static void main(String[] args) {
        //properties
        Scanner kbd = new Scanner(System.in);
        String text;

        //ask user input
        System.out.println("Give a string to check on being a palindrome");
        text = kbd.nextLine();

        //checking the input and printing result
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text){
        StringBuilder palindromeChecker = new StringBuilder(text);
        //when we reverse the StringBuilder and pull a string from it
        // we can compare it with the input
        return palindromeChecker.reverse().toString().equals(text);
    }
}
