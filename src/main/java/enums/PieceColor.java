package enums;

public enum PieceColor {

    WHITE("w"),
    BLACK("b"),
    NONE("");

    public final String colorChar;
    private PieceColor(String colorChar) {
        this.colorChar = colorChar;
    }
}
