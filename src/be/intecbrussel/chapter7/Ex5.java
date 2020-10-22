package be.intecbrussel.chapter7;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(average(5, 5, 5));
        System.out.println(min(12, 8, 0));
        System.out.println(max(12,8,0));
    }

    public static int average (int... values) {
        int average = 0;

        for (int i: values) {
            average += i;
        }

        average /= values.length;

        return average;
    }


    public static int min (int... values) {
//        int min = values[0];
//        for (int number : values) {
//            if (number < min) {
//                min = number;
//            }
//        }
        
        //checking for lowest value
        Arrays.sort(values);

        return values[0];
    }


    public static int max (int... values) {
        Arrays.sort(values);
        return values[values.length-1];
    }
}
