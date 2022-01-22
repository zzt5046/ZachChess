package enums;

public enum PieceType {

    PAWN("p"),
    KNIGHT("n"),
    BISHOP("b"),
    ROOK("r"),
    QUEEN("q"),
    KING("k"),
    NONE("");

    public final String typeChar;
    private PieceType(String typeChar) {
        this.typeChar = typeChar;
    }
}
