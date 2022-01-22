package board;

public class BoardUtil {

    public static String getSquareClicked(int x, int y, boolean flipped){
        
        String file = "";
        String rank = "";

        if(x < 128){
            file = flipped ? "h" : "a";
        }else if(x >= 128 && x < 256){
            file = flipped ? "g" : "b";
        }else if(x >= 256 && x < 384){
            file = flipped ? "f" : "c";
        }else if(x >= 384 && x < 512){
            file = flipped ? "e" : "d";
        }else if(x >= 512 && x < 640){
            file = flipped ? "d" : "e";
        }else if(x >= 640 && x < 768){
            file = flipped ? "c" : "f";
        }else if(x >= 768 && x < 896){
            file = flipped ? "b" : "g";
        }else{
            file = flipped ? "a" : "h";
        }

        if(y < 128){
            rank = flipped ? "1" : "8";
        }else if(y >= 128 && y < 256){
            rank = flipped ? "2" : "7";
        }else if(y >= 256 && y < 384){
            rank = flipped ? "3" : "6";
        }else if(y >= 384 && y < 512){
            rank = flipped ? "4" : "5";
        }else if(y >= 512 && y < 640){
            rank = flipped ? "5" : "4";
        }else if(y >= 640 && y < 768){
            rank = flipped ? "6" : "3";
        }else if(y >= 768 && y < 896){
            rank = flipped ? "7" : "2";
        }else{
            rank = flipped ? "8" : "1";
        }

        return file + rank;
    }
}
