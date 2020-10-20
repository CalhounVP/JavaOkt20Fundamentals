package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex8 {
    //Schrijf een programma dat bij een

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a word");
        String inputStr = kb.nextLine();
        int length = inputStr.length();

        String last3;
//        StringBuilder text = new StringBuilder(kb.next());
//        System.out.println("String contains = " + text);
//
//        int count = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) != ' ')
//                count++;
//        }
//        System.out.println("Last 3 symbols in caps are = "
//                + text.substring(count - 3).toUpperCase());


        if (inputStr == null || inputStr.length() < 3){
            last3 = inputStr;
        }else {
            last3 = inputStr.substring(inputStr.length() - 3);
        }

        System.out.println("the transformed word is: " + inputStr.substring(0,length-3) + last3.toUpperCase());


    }
}


