package board;

public class ChessBoard {

    private static ChessBoard board = null;
    private ChessBoard() {
        initPosition();
    }

    public static ChessBoard getBoard() {
        if (board == null) {
            board = new ChessBoard();
        }
        return board;
    }

    private void initPosition(){

    }
}
