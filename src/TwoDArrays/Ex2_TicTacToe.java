package TwoDArrays;

public class Ex2_TicTacToe {

    public static void run() {

        String[][] tictactoe = new String[3][3];

        setupBoard(tictactoe);
        // complete setupBoard function after printBoard
        // discuss Pass by Reference

        print2DString(tictactoe);
        System.out.println();

        tictactoe[0][1] = "X";
        tictactoe[0][0] = "X";
        tictactoe[1][1] = "X";
        tictactoe[2][1] = "O";
        tictactoe[2][0] = "X";
        tictactoe[0][2] = "O";
        tictactoe[1][2] = "O";
        tictactoe[1][0] = "O";
        tictactoe[2][2] = "O";


        print2DString(tictactoe);
        System.out.println();
        System.out.println("The winner is " + checkWinner(tictactoe));
        System.out.println();

    }// run

    public static String checkWinner(String[][] tictactoe) {
        //*** Only works for rows

        // use a for loop to check if a row is a winner
        for (int r = 0; r < tictactoe.length; r++) {

                if(!tictactoe[0][0].equals(" ") && tictactoe[0][0].equals(tictactoe[1][1]) && tictactoe[0][0].equals(tictactoe[2][2])) {
                    return tictactoe[0][0];
                }

            if (!tictactoe[r][0].equals(" ") && tictactoe[r][0].equals(tictactoe[r][1]) && tictactoe[r][0].equals(tictactoe[r][2])) {
                return tictactoe[r][0];
            }
            if (!tictactoe[0][r].equals(" ") && tictactoe[0][r].equals(tictactoe[1][r]) && tictactoe[0][r].equals(tictactoe[2][r])) {
                return tictactoe[0][r];
            }

        }
        return "no one yet!";
    }




    public static void print2DString(String[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print("|" + arr[r][c] );
            }
            System.out.println("|");
        }

    }// print2dString

    public static void setupBoard(String[][] tictactoe) {
        for (int r = 0; r < tictactoe.length; r++) {
            for (int c = 0; c < tictactoe[r].length; c++) {
                tictactoe[r][c] = " ";
            }
        }
    }// end





}
