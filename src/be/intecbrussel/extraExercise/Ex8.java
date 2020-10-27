package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex8 {
    //Schrijf een programma dat bij een opgegeven string de laatste 3 symbolen in caps zet.

    public static void main(String[] args) {
        //properties
        Scanner kbd = new Scanner(System.in);
        String input;

        //asking for input
        System.out.println("Please give me a string");
        input = kbd.nextLine();
        kbd.close();

        //printing out result
        System.out.println(input.substring(0,input.length()-3)
                            + input.substring(input.length()-3)
                                    .toUpperCase());
        //methods can easily be chained like that,
        // you just need to keep an eye on what your result of the previous method is
    }
}


