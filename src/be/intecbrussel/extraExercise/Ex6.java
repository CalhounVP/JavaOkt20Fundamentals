package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex6 {
    //check voor palindroom

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text){
        String basicText =  text.replaceAll(" ","").toLowerCase();
        StringBuilder reverseText = new StringBuilder(basicText);
        reverseText.reverse();
        if (basicText.equals(reverseText.toString())){
            return true;
        }
        return false;

    }
}
