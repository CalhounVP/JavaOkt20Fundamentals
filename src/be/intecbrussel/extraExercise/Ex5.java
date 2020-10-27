package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex5 {
    //Schrijf een programma dat een
    // String opvraagt en deze dan omgekeerd teruggeeft
    // (Tip: Gebruik de StringBuilder)

    public static void main(String[] args) {
        //properties
        Scanner kbd = new Scanner(System.in);
        StringBuilder text;

        //asking input
        System.out.println("Please give in a string to reverse:");
        //you can call a method in a method parameter,
        // it will always first do the parameter code before passing it along
        text = new StringBuilder(kbd.nextLine());

        //printing out result
        //print will automatically use the toString method on any object that has one
        System.out.println(text.reverse());
    }
}
