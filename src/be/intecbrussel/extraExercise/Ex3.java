package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex3 {
    //Schrijf een programma dat de gebruiker voor twee nummers vraagt
    // en daarna de som toont, na het tonen van de som vraag je
    // de gebruiker of hij deze operatie opnieuw wil uitvoeren,
    // indien ja begint de uitvoering opnieuw indien nee eindigd het programma.

    public static void main(String[] args) {
        //properties
        Scanner kbd = new Scanner(System.in);
        boolean restart = false;
        int number1;
        int number2;

        //process needs to be done at least once, so a do while loop is ideal
        do {
            //asking input
            System.out.println("We will be doing an addition: \nPlease input your first number");
            number1 = kbd.nextInt();
            System.out.println("Please input your second number");
            number2 = kbd.nextInt();

            //give result
            System.out.println("Your sum is: " + (number1+number2));

            //ask if repeat is wanted?
            System.out.println("Would you like to do an other addition? yes/no");
            //if user inputs yes the loop will repeat
            restart = kbd.next().equals("yes");

        } while (restart);

        //don't forget to close your scanner!
        kbd.close();


    }

}
