package be.intecbrussel.chapter7;

import java.util.Scanner;

public class Scrabble2D {
    public static void main(String[] args) {
        //properties
        Scanner kbd = new Scanner(System.in);
        String input;
        int score = 0;
        //scrabble has a 0 points, 1 - 5 and 8 and 10 points
        char[][] scrabbleScore = new char[11][];
        scrabbleScore[0] = new char[]{' '};
        scrabbleScore[1] = new char[]{'e', 'a', 'i', 'o', 'n', 'r', 't', 'l', 's', 'u'};
        scrabbleScore[2] = new char[]{'d','g'};
        scrabbleScore[3] = new char[]{'b','c','m','p'};
        scrabbleScore[4] = new char[]{'f','h','v','w','y'};
        scrabbleScore[5] = new char[]{'k'};
        scrabbleScore[8] = new char[]{'j','x'};
        scrabbleScore[10] = new char[]{'q','z'};

        //asking input
        System.out.println("Please input the string you wish calculated");
        input = kbd.nextLine().toLowerCase();
        kbd.close();

        //for every character in the input
        for (char toScore: input.toCharArray()) {
            //grab the point value aray, i will be the points granted for the content
            for (int i = 0; i < scrabbleScore.length; i++) {
                //if the array is empty no need to check the content (6-7 & 9 are empty)
                if (scrabbleScore[i] != null) {
                    //go through all the chars in the list for that score
                    for (char toCompare : scrabbleScore[i]) {
                        if (toCompare == toScore) {
                            score += i;
                            break;
                        }
                    }
                }
            }
        }

        //giving back result
        System.out.println(input + " is worth: " + score);

    }
}
