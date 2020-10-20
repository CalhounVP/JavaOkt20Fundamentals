package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex3 {
    //Schrijf een programma dat de gebruiker voor twee nummers vraagt
    // en daarna de som toont, na het tonen van de som vraag je
    // de gebruiker of hij deze operatie opnieuw wil uitvoeren,
    // indien ja begint de uitvoering opnieuw indien nee eindigd het programma.

    public static void main(String[] args) {

        boolean restart = true;

        while (restart) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("New addition");

            System.out.println("First number :");
            int a = scanner.nextInt();

            System.out.println("Second number :");
            int b = scanner.nextInt();

            System.out.println("Sum :");
            System.out.println(a + b);

            System.out.println("Press '1' to restart");
            int input = scanner.nextInt();

            if (input != 1) restart = false;
        }


    }

}
