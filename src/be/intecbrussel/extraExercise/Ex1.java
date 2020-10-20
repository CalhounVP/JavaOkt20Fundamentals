package be.intecbrussel.extraExercise;

public class Ex1 {
    //Schrijf een programma dat de getallen tussen 1 en 100 afdrukt die
    // men kan delen door 3, 5, en door beide.
    // Dus 3 aparte prints.
    // (Tip: Gebruik 3 Strings die waar je de deelbare getallen aan meegeeft en op het einde print)

    public static void main(String[] args) {
        divisibleByThree();
        System.out.println("");
        divisibleByFive();
        System.out.println("");
        divisibleByBoth();
    }

    public static void divisibleByThree(){
        for (int i = 3; i < 100; i+=3) {
            System.out.print(i + " ");
        }
    }
    public static void divisibleByFive(){
        for (int i = 5; i < 100; i+=5) {
            System.out.print(i + " ");
        }
    }
    public static void divisibleByBoth(){
        for (int i = 3; i < 100; i++) {
            if(i %3 == 0 && i %5 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void divivisbleBy (int divider) {
        String dividable = "These number is dividable by " + divider + ": //n";
        for (int i = 1; i <= 100; i++ ) {
            if (i%divider == 0) {
                dividable += i + " ";
            }
        }
    }
}
