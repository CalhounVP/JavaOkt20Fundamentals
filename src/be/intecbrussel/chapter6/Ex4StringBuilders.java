package be.intecbrussel.chapter6;

import java.util.Scanner;

public class Ex4StringBuilders {
    public static void main(String[] args) {
        //local properties
        StringBuilder text1, text2;
        Scanner kbd = new Scanner(System.in);

        //asking for basic input
        System.out.println("Give in your first text");
        text1 = new StringBuilder(kbd.nextLine());
        System.out.println("Give in your second text");
        text2 = new StringBuilder(kbd.nextLine());

        //printing originals
        System.out.println("First text: "+ text1);
        System.out.println("Second text: " + text2);

        //asking to append
        System.out.println("Give in what you'd like to add to your first text");
        //this appending will change the saved text1 so any follow up action needs to deal with this change
        text1.append(kbd.nextLine());
        System.out.println("Appended first text: " +text1);

        //reverse text2 also in the saved variable
        System.out.println("Reversed second text: " + text2.reverse());

        //remove spaces easiest way
        System.out.println("First text no spaces: " + text1.toString().replaceAll(" ", ""));

        //double all t
        System.out.println("Doubled T in second text: " + doublingT(text2));

    }

    public static StringBuilder doublingT (StringBuilder text) {
        //-1 length dropped cuz the length adjusts based on the double t
        for (int i = 0; i<text.length(); i++) {
            if (text.charAt(i) == 't' || text.charAt(i) == 'T') {
                text.insert(i++,'t');
            }
        }
            return text;
    }
}
