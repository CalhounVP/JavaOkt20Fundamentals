package be.intecbrussel.extraExercise;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    //Schrijf een klein spel dat een random nummer genereert
    // dat de gebruiker dan kan raden, het nummer blijft hetzelfde
    // tot de gebruiker het correct heeft, dan eindigd het spel,
    // met een felicitatie en het totaal aantal pogingen.
    // (Tip: maak het jezelf makkelijk en zet de limiet
    // van het getal ergens tussen 1-10 bijvoorbeeld)



    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int rand = random.nextInt(10)+1;

        System.out.println("Guess a number between 1-10");
        int guess = scanner.nextInt();
        int counter=0;
        while (rand != guess){
            counter++;
            System.out.println("Guess again please");
            guess=scanner.nextInt();
        }
        System.out.println("You guessed " + counter + "steps");
    }
}
