package board;

public class ChessBoardModel {

    private static ChessBoardModel board = null;
    private ChessBoardModel() {
        initPosition();
    }

    public static ChessBoardModel getBoard() {
        if (board == null) {
            board = new ChessBoardModel();
        }
        return board;
    }

    private void initPosition(){

    }
}
