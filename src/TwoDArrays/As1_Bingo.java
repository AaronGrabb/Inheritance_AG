package TwoDArrays;

public class As1_Bingo {
    char[] bingo = {'B','I','N','G','O'};

    public static void run(){
        int[][] bingoSheet = new int[5][5];

        for (int i = 0; i < 5; i++) {

                bingoSheet[i] = generateArray(5,1+i*15,15+i*15);


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

}
