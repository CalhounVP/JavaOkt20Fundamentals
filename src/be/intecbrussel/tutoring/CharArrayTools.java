package be.intecbrussel.tutoring;

public class CharArrayTools {
    public static char[] filterAlphabet(char[] characters) {
        char[] lettersOnly;
        String temp = "";
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char toCheck: characters) { //go through every letter in characters
            for (char c: alphabet) { //compare with the alphabet
                if (c == toCheck) { //is the letter of the alphabet == to our character
                    temp += toCheck;
                }
            }
        }

        lettersOnly = temp.toCharArray();

        return lettersOnly;
    }

    public static char[] sort(char[] chars) {
        char temp;

        //compare every letter
        for (int i = 0; i < chars.length-1; i++) {
            //with every letter that hasn't been sorted for sure
            for (int j = 0; j < chars.length-i-1; j++) {
                if (chars[j] > chars[j+1]) { //chars have int value options so you can compare with size
                    temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }

        return chars;
    }
}
