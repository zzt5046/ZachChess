package pieces;

import enums.PieceColor;
import enums.PieceType;

public class Bishop extends ChessPiece {
    public Bishop(PieceColor pieceColor){
        setPieceType(PieceType.BISHOP);
        setPieceColor(pieceColor);
    }


}
