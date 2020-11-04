package be.intecbrussel.tutoring;

public class App {
    public static void main(String[] args) {
        int[] unsortedNumbers = {8,4,2,6};
        String testSentence = "we zullen eens zien ... of dit werkt?";
        char [] toSort = {'z', 'a', 'x'};


//        for (int num : IntArrayTools.sortingArray(unsortedNumbers)) {
//            System.out.println(num);
//        }

//        for (char c: CharArrayTools.filterAlphabet(testSentence.toLowerCase().toCharArray())) {
//            System.out.print(c);
//        }

        for (char c: CharArrayTools.sort(toSort)) {
            System.out.print(c);
        }

    }
}
