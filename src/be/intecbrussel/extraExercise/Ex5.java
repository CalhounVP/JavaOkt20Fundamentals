package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex5 {
    //Schrijf een programma dat een
    // String opvraagt en deze dan omgekeerd teruggeeft
    // (Tip: Gebruik de StringBuilder)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        System.out.println(text.reverse());
    }
}
