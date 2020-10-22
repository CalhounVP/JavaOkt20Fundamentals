package be.intecbrussel.chapter7;

public class DemonVarParams {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,0));
    }

    public static int sum (int a, int b) {
        return a+b;
    }

    public static int sum (int... values) {
        int sum = 0;

        for (int value: values) {
            sum += value;
        }

        return sum;
    }

}
