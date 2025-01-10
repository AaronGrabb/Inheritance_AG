package TwoDArrays;

public class Ex1_GolfCard {


    public static void run(){

        String[] names = { "Bob", "Serena", "Gill", "Steve" };
        int[][] scorecard = new int[4][18];

        System.out.println( scorecard.length );
        scorecard[0][0] = 4;
        scorecard[1][0] = 5;
        scorecard[2][0] = 1;
        scorecard[3][0] = 3;
        scorecard[0][1] = 8;
        scorecard[1][1] = 7;
        scorecard[2][1] = 4;
        scorecard[3][1] = 6;

        System.out.println("Name      Scores" );

        for( int row = 0; row < scorecard.length; row++ ){
            int scoreTotal[] = new int[4];
            System.out.println(names[row]+":");
            for( int col = 0; col < scorecard[row].length; col++){
                System.out.print("       "+scorecard[row][col]);
                scoreTotal[row] += scorecard[row][col];
            }
            System.out.print("  Total:  " + scoreTotal[row]);
            System.out.println();



        }

        for (int i = 0; i < scorecard.length; i++) {
            double holeAvg[] = new double[18];
            int holeTotal[] = new int[18];
            for (int j = 0; j < names.length; j++) {
                holeTotal[i] += scorecard[j][i];
            }
            holeAvg[i] = holeTotal[i]/ (names.length);
            System.out.println("Average score for Hole " + i +": " + holeAvg[i]);


        }

    }

}
