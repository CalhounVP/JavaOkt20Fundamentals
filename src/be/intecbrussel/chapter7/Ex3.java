package be.intecbrussel.chapter7;

public class Ex3 {
    public static void main(String[] args) {
        //properties
        int[] [] rowsAndColumns = new int[4][6];

        //filling the arrays
        //we will one by one go through the rows
        for (int row = 0; row < rowsAndColumns.length; row++) {
            //for each row we will go one by one through the columns
            for (int column = 0; column < rowsAndColumns[row].length; column++) {

                rowsAndColumns[row] [column] = row*column;

            }
        }

        //printing the arrays
        //going through the rows
        for (int [] row: rowsAndColumns) {
            //going through the columns
            for (int value: row) {
                System.out.print(" "+ value + " ");
            }
            System.out.println();
        }

    }
}
