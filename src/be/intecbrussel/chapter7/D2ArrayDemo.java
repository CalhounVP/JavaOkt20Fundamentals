package be.intecbrussel.chapter7;

public class D2ArrayDemo {
    public static void main(String[] args) {
        //all subarrays have same length
        int[] [] arrayOfArrays1 = new int[5] [2];

        //subarrays have different lengths
        int[] [] arrayOfArrays2 = new int[5] [];
        arrayOfArrays2[0] = new int[3];
        arrayOfArrays2[1] = new int[2];
        arrayOfArrays2[2] = new int[]{5, 2};

        //annonieme array declaratie
        int[] [] arrayOfArrays3 = {{5,2},{10,9,8}};

        //printing a specific spot
        System.out.println(arrayOfArrays2[2] [1]);
    }
}
