package be.intecbrussel.chapter7;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //properties
        Scanner kbd = new Scanner(System.in);
        String input;

        //asking input
        System.out.println("Please input a string:");
        input = kbd.nextLine();

        //printing out result
        for (String s: input.split(" ")) {
            System.out.println(s);
        }
    }
}
