package be.intecbrussel.chapter7;

import java.util.Scanner;

public class Ex4Scrabble {
    public static void main(String[] args) {
        //properties
        Scanner scanner = new Scanner(System.in);
        int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        String text;
        int totalPoints = 0;

        //asking input
        System.out.println("Enter your scrabble word");
        text = scanner.nextLine();
        scanner.close();

        //processing input
        //optimized manner making use of the unicode values of letters
        for (char letter : text.toLowerCase().toCharArray()) {
            totalPoints += points[(int) letter - 97]; //could also do - 'a'
        }

        System.out.println(totalPoints);
        
        //resetting points to 0 purely to demonstrate a different less optimized approach
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        totalPoints =0;
        
        //loop through every letter of the input
        for (char letter: text.toLowerCase().toCharArray()) {
            //find the i value in the letters array for this char
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == letter) {
                    //the score will be on the same i location in the score array
                    totalPoints += points[i];
                    break;
                }
            }
        }

        System.out.println(totalPoints);

    }
}
