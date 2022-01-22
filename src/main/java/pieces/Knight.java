package pieces;

import enums.PieceColor;
import enums.PieceType;

public class Knight extends ChessPiece{
    public Knight(PieceColor pieceColor){
        setPieceType(PieceType.KNIGHT);
        setPieceColor(pieceColor);
    }
}
