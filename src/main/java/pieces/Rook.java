package pieces;

import enums.PieceColor;
import enums.PieceType;

public class Rook extends ChessPiece{
    public Rook(PieceColor pieceColor){
        setPieceType(PieceType.ROOK);
        setPieceColor(pieceColor);
    }
}
