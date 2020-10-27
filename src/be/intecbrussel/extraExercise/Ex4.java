package be.intecbrussel.extraExercise;

import java.util.Properties;
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
        //Properties
        Random random = new Random();
        Scanner kbd = new Scanner(System.in);
        int guess;
        //with this code set up we have to start from 1 cuz one guess will always be made
        int counter = 1;
        //random will go up till the bound number
        // so make sure to add +1 if you don't want a 0-9 in this case
        int rand = random.nextInt(10)+1;

        //since the prompt to the user differs after the first guess a while is a good option
        //first guess
        System.out.println("Guess a number between 1-10");
        guess = kbd.nextInt();
        //following guesses:
        while (rand != guess){
            counter++;
            System.out.println("Guess again please");
            guess=kbd.nextInt();
        }
        System.out.println("Congrats, you guessed correctly at try #" + counter);
    }
}
