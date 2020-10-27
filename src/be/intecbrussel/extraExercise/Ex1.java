package be.intecbrussel.extraExercise;

public class Ex1 {
    //Schrijf een programma dat de getallen tussen 1 en 100 afdrukt die
    // men kan delen door 3, 5, en door beide.
    // Dus 3 aparte prints.
    // (Tip: Gebruik 3 Strings die waar je de deelbare getallen aan meegeeft en op het einde print)

    public static void main(String[] args) {
        //properties
        //stringBuilders and append were also an option but I wanted to build up to that
        String dividableBy3 = "Dividable by 3: ";
        String dividableBy5 = "Dividable by 5: ";
        String dividableBy3And5 = "Dividable by 3 & 5: ";

        //checking
        for (int i = 1; i <= 100; i++) {
            if (dividableByNum(i, 3) && dividableByNum(i, 5)) {
                //anything you add to a string is typecasted to a string
                dividableBy3And5 += i + " ";
            } else if (dividableByNum(i,3)) {
                dividableBy3 += i + " ";
            } else if (dividableByNum(i,5)) {
                dividableBy5 += i + " ";
            }
        }

        //printing out result
        System.out.println(dividableBy3);
        System.out.println(dividableBy5);
        System.out.println(dividableBy3And5);

    }

    public static boolean dividableByNum (int number, int divider) {
        //check if you can divide by the given divider without a rest
        if (number%divider == 0) {
            return true;
        }
        return false;
    }


}
