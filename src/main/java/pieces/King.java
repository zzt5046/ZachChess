package pieces;

import enums.PieceColor;
import enums.PieceType;

public class King extends ChessPiece{
    public King(PieceColor pieceColor){
        setPieceType(PieceType.KING);
        setPieceColor(pieceColor);
    }
}
