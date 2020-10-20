package be.intecbrussel.extraExercise;

import java.util.Scanner;

public class Ex7{
    //Schrijf een programma dat het aantal spaties telt in de opgegeven String.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String");
        String str1=scan.nextLine();
        String str2=str1.replaceAll(" ","");

        System.out.println(str1.length()-str2.length());


    }
}
