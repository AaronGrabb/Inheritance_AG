package TwoDArrays;
import java.util.*;
public class As1_Bingo {


    public static void run(){
        char[] bingo = {'B','I','N','G','O'};
        int[][] bingoSheet = new int[5][5];
        for (int i = 0; i < 5; i++) {
            System.out.print(bingo[i]+ ":  | ");
            bingoSheet[i] = generateArray(5,1+i*15,15+i*15);
            for (int j = 0; j < 5; j++) {
                System.out.print(bingoSheet[i][j] + " | ");
            }
            System.out.println();
        }
while(true){
    int random = -1;

    String generate = MyStuff.Library.input.nextLine();
    if(generate.equals("")){
        random = myRandom(1,75);
        System.out.println("New Roll: "+random);
boolean around = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(random == bingoSheet[i][j]){
                    bingoSheet[i][j] = 0;
                    System.out.println("Number found is " + random);
                    around = true;
                }
            }
        }//Check match
        if(around == false){
            System.out.println("Number not found.");
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(bingo[i]+ ":  | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(bingoSheet[i][j] + " | ");
            }
            System.out.println();
        }//Draw new grid

    }

    for (int i = 0; i < 5; i++) {
        if(    checkRow(bingoSheet[i]) || checkCol(bingoSheet)){
            System.out.println("You Won!");
            break;
        }
    }

}



    }








    public static int[] generateArray(int arrayLength, int min, int max){
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = myRandom(min, max);
        }
return array;
    }






    public static int myRandom (int min, int max){
        int num =  (int) (Math.random() * (max - min + 1)   + min);
        return num;
    }//and random

    public static boolean checkRow(int[] row){
        int numZero = 0;
        for (int i = 0; i < row.length; i++) {
            if(row[i] == 0){
                numZero++;
            }
        }
        if(numZero == 5){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkCol(int[][] col){
        for (int i = 0; i < col.length; i++) {
            int numZero = 0;
            for (int j = 0; j < col.length; j++) {
                if(col[j][i] == 0){
                    numZero++;
                }
            }
            if(numZero == 5){
                return true;
            }

        }
return false;
    }


}
