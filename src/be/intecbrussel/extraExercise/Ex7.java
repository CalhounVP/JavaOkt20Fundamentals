package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex7{
    //Schrijf een programma dat het aantal spaties telt in de opgegeven String.
    public static void main(String[] args) {
        //properties
        Scanner kbd = new Scanner(System.in);
        String input;

        //ask for input
        System.out.println("Please enter a String");
        input = kbd.nextLine();
        //again don't forget to close
        kbd.close();

        //print out result
        System.out.println("The amount of spaces was: " +
                (input.length() - input.replaceAll(" ","")
                                        .length()));
        //you can check the length difference without needing extra variables
        // because we won't reuse the value
    }
}
