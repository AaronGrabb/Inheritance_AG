package TwoDArrays;

public class As5_Vigenere {

    public static void run(){

        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere =createVSquare(alphabet);
        printSquare(vigenere);
//        System.out.println(getChar(vigenere,0,0));
//        System.out.println(getChar(vigenere,25,1));
//        System.out.println(getChar(vigenere,1,25));

        while(true){
            System.out.println("What message do you need to decode?");
            String messageE = MyStuff.Library.input.nextLine();
            System.out.println("What is the key?");
            String key = MyStuff.Library.input.nextLine();
            System.out.println(decrypt(vigenere,key,messageE));



        }
    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];
//code to be written

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                int num = i+j;
                if(num < alphabet.length){
                    square[i][j] = alphabet[num];
                }
                else{

                    square[i][j] = alphabet[num%26];

                }

//                square[j][i] = alphabet[j];

            }

        }
        return square;

    }//createVSquare

    public static void printSquare(char[][] square) {
        System.out.print("   ");
        for (int i = 0; i < square.length; i++) {
            System.out.print(square[i][0]+" ");

        }
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < square.length; i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 0; i < square.length; i++) {

            System.out.print(square[0][i]+" |");
            for (int j = 0; j < square.length; j++) {

                System.out.print(square[i][j]+" ");
            }
            System.out.println();
        }

    }//end printSquare

    public static char getChar(char[][] square, int row, int col ) {
        return square[row][col];


    }

    private static char[] decrypt (char[][] square, String key, String message){
        char[] decrypted = new char[message.length()];
        int location = 0;
        int keySpot = 0;
//        System.out.println(key.length());
        while(location < message.length()){
            if(keySpot >= key.length()){
                keySpot = 0;
            }

            for (int i = 0; i < square.length; i++) {
                char point = square[0][i];
//                System.out.println(key.charAt(keySpot));
                if (point ==key.charAt(keySpot)){
//                    System.out.println("rin");


                    for (int j = 0; j < square.length; j++) {
                        if(message.charAt(location) == square[i][j]){
//                            System.out.println("run");
                            decrypted[location] = square[0][j];
                            keySpot++;
//LJOGCGWDEIWKGBNWJOADKQARFWNZBW
                        }
                    }
                    break;
                }
            }
            location++;
        }

        return decrypted;
    }

    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }


}
