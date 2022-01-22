package pieces;

import enums.PieceColor;
import enums.PieceType;

public class Queen extends ChessPiece{
    public Queen(PieceColor pieceColor){
        setPieceType(PieceType.QUEEN);
        setPieceColor(pieceColor);
    }
}
