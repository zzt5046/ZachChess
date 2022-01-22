package pieces;

import enums.PieceColor;

import java.util.HashMap;

public class PieceUtil {

    /**
     *
     * @param code the ZachChess notation of a given piece
     * @return ChessPiece object
     */
    public static ChessPiece notationToPiece(String code){
        return notationMap.get(code) != null ? notationMap.get(code) : new ChessPiece();
    }

    /**
     *
     * @param notation the chess notation of the desired square
     * @return int[] of coordinates of chess position 2d array, respectively. [0] -> x // [1] -> y
     */
    public static int[] arrayPosFromNotation(String notation){
        char[] fileRank = notation.toCharArray();
        int[] arr = {rankMap.get(fileRank[1]), fileMap.get(fileRank[0])};
        return arr;
    }

    private static final HashMap<String, ChessPiece> notationMap = new HashMap<>(){{
        put("w_p", new Pawn(PieceColor.WHITE));
        put("w_n", new Knight(PieceColor.WHITE));
        put("w_b", new Bishop(PieceColor.WHITE));
        put("w_r", new Rook(PieceColor.WHITE));
        put("w_q", new Queen(PieceColor.WHITE));
        put("w_k", new King(PieceColor.WHITE));
        put("b_p", new Pawn(PieceColor.BLACK));
        put("b_n", new Knight(PieceColor.BLACK));
        put("b_b", new Bishop(PieceColor.BLACK));
        put("b_r", new Rook(PieceColor.BLACK));
        put("b_q", new Queen(PieceColor.BLACK));
        put("b_k", new King(PieceColor.BLACK));
    }};
    private static final HashMap<Character, Integer> fileMap = new HashMap<>(){{
        put('a', 0);
        put('b', 1);
        put('c', 2);
        put('d', 3);
        put('e', 4);
        put('f', 5);
        put('g', 6);
        put('h', 7);
    }};
    private static final HashMap<Character, Integer> rankMap = new HashMap<>(){{
        put('1', 7);
        put('2', 6);
        put('3', 5);
        put('4', 4);
        put('5', 3);
        put('6', 2);
        put('7', 1);
        put('8', 0);
    }};
}
