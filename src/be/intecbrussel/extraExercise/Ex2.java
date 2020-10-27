package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex2 {
    //Schrijf een programma dat bij een opgegeven String
    // de klinkers gaat tellen en het aantal uitprint.

    public static void main(String[] args) {
        //properties
        Scanner userInput = new Scanner(System.in);
        String givenString;
        int count = 0;

        //asking input
        System.out.println("Please give a string:");
        givenString = userInput.nextLine().toLowerCase();
        //by inputting the string to lowercase after receiving you make sure it counts every vowel

        //checking vowel count
        for (int i = 0; i < givenString.length(); i++) {
            if (isVowel(givenString.charAt(i))) {
                count++;
            }
        }

        //printing result
        System.out.println("The amount of vowels is:" + count);
    }

    private static boolean isVowel(char a) {
        //you can check things directly in the return statement for a boolean
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }
}
