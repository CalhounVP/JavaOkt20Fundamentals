package be.intecbrussel.chapter7;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(average(5, 5, 5));
        System.out.println(min(12, 8, 0));
        System.out.println(max(12,8,0));
    }

    public static int average (int... values) {
        int sum = 0;
        for (int i: values) {
            sum += i;
        }
        //to get the average we need to divide by the amount of elements we addeed up
        return sum/values.length;
    }

    public static int min (int... values) {
        //checking for lowest value by sorting it from low to high
        Arrays.sort(values);

        return values[0];
    }

    public static int max (int... values) {
        Arrays.sort(values);
        //getting the last value since it will be sorted from low to high
        return values[values.length-1];
    }
}
