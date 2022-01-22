package board;

import java.util.Arrays;

public class ChessPosition {

    private String[][] array = new String[8][8];
    private boolean flipped;

    public ChessPosition(boolean flipped) {

        this.flipped = flipped;

        String topPrefix = flipped ? "w_" : "b_";
        String botPrefix = flipped ? "b_" : "w_";

        for(int i = 0; i < 8; i++){
            Arrays.fill(array[i], "");
        }

        // Rooks
        array[0][0] = topPrefix + "r";
        array[0][7] = topPrefix + "r";
        array[7][0] = botPrefix + "r";
        array[7][7] = botPrefix + "r";
        // Knights
        array[0][1] = topPrefix + "n";
        array[0][6] = topPrefix + "n";
        array[7][1] = botPrefix + "n";
        array[7][6] = botPrefix + "n";
        //Bishops
        array[0][2] = topPrefix + "b";
        array[0][5] = topPrefix + "b";
        array[7][2] = botPrefix + "b";
        array[7][5] = botPrefix + "b";
        //Queens
        array[0][3] = topPrefix + "q";
        array[7][3] = botPrefix + "q";
        //Kings
        array[0][4] = topPrefix + "k";
        array[7][4] = botPrefix + "k";
        //Pawns
        for (int i = 0; i < 8; i++) {
            array[1][i] = topPrefix + "p";
            array[6][i] = botPrefix + "p";
        }
    }

    public void setArray(String[][] array){
        this.array = array;
    }
    public String[][] getArray(){
        return array;
    }

    public void setFlipped(boolean flipped){
        this.flipped = flipped;
    }
    public boolean isFlipped(){
        return flipped;
    }

    public void move(String from, String to){

    }

    public void print(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
