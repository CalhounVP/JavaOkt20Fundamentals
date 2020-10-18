package be.intecbrussel.chapter6;

import java.util.Scanner;

public class Ex3Strings {
    public static void main(String[] args) {
        //properties
        String input = "";
        String compareInput1 = "";
        String compareInput2 = "";
        Scanner kbd = new Scanner(System.in);

        //get first string input
        System.out.println("Please put in a single string:");
        input = kbd.nextLine();

        //print string length
        printStringLength(input);

        //adjust casing
        printCasing(input);

        //replace a letter
        printReplacedA(input);

        //counting the e's
        printCountOfE(input);

        //get secondary string inputs:
        System.out.println("Please put in the first string to compare");
        compareInput1 = kbd.nextLine();
        System.out.println("Please put in the second string to compare");
        compareInput2 = kbd.nextLine();

        //check if they are equal
        printEqual(compareInput1, compareInput2);

        //alphabetical
        printAlphabetical(compareInput1, compareInput2);

        //ask a new input
        System.out.println("Please give in a String with a bunch of spaces in the front and back:");
        input = kbd.nextLine();
        //when scanner done, close it to avoid memory leaks
        kbd.close();

        //print without extra spaces
        printWithoutSpaces(input);
    }

    public static void printStringLength (String input) {
        System.out.println(input);
        System.out.println("Has a length of: " + input.length()); //get the length of the string
    }

    public static void printCasing (String input) {
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());
    }

    public static void printReplacedA (String input) {
        System.out.println(input.replace('a', 'o'));
    }

    public static void printCountOfE (String input) {
        //method exclusive property
        int eCount =0;

        //string starts at 0 so to go through the entire string length -1 since location length doesn't exist
        for (int i=0; i < input.length()-1; i++) {
            //put the string to lowercase that way it will count capitalized ones as well
            if (input.toLowerCase().charAt(i) == 'e') {
                eCount++;
            }
        }
        //formatted printer to make for less messy string
        System.out.printf("This string has %d E's %n", eCount);
    }

    public static void printEqual (String input1, String input2) {
        //equals checks the content and if the exact same will return true
        System.out.println("The strings are equal? " + input1.equals(input2));
    }

    public static void printAlphabetical (String input1, String input2) {
        // result bigger than 0 string 2 comes first in the alphabet
        if (input1.compareTo(input2) > 0){
            System.out.println(input2);
            System.out.println(input1);
        }
        // result smaller than 0 string 1 comes first in the alphabet
        //result 0 the strings are the same
        else {
            System.out.println("else result");
            System.out.println(input1);
            System.out.println(input2);
        }
    }

    public static void printWithoutSpaces (String input) {
        System.out.println(input);
        System.out.println("Cleaned up string: " +input.trim());
    }

}
