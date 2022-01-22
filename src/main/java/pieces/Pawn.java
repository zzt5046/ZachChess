package pieces;

import enums.PieceColor;
import enums.PieceType;

public class Pawn extends ChessPiece{

    public Pawn(PieceColor pieceColor){
        setPieceType(PieceType.PAWN);
        setPieceColor(pieceColor);
    }
}
