package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex2 {
    //Schrijf een programma dat bij een opgegeven String
    // de klinkers gaat tellen en het aantal uitprint.

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String givenString = userInput.nextLine();

        int count = 0;
        for (int i = 0; i < givenString.length(); i++) {
            char a = givenString.charAt(i);
            if (isVowel(a)) {
                count++;
            }

        } System.out.println(count);
    }

    private static boolean isVowel(char a) {
        boolean isVowel;

        if (a == 'a'|| a == 'e'|| a == 'i'|| a == 'o'|| a == 'u') {
            isVowel = true;
        } else {
            isVowel = false;
        } return isVowel;

    }
}
