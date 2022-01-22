package board;

import pieces.ChessPiece;
import pieces.PieceUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class ChessBoardView extends JFrame {

    private static final int SIDE_WIDTH = 1024;
    private static final int SQUARE_WIDTH = SIDE_WIDTH / 8;

    private static final Color DARK = new Color(87, 58, 46);
    private static final Color LIGHT = new Color(138, 120, 93);

    private boolean flipped = false;
    private static ChessPosition position;
    private static ChessBoardModel model;
    private static Graphics2D g2d = null;

    public ChessBoardView(){
        this(false);
    }

    public ChessBoardView(boolean flipped){

        position = new ChessPosition(flipped);
        model = new ChessBoardModel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SIDE_WIDTH, SIDE_WIDTH);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setVisible(true);

    }

    @Override
    public void paint(Graphics g){
        g2d = (Graphics2D) g;
        drawBoard();
        drawPieces();
    }

    private void drawBoard(){
        int x = 0;
        int y = 0;
        boolean isWhite = flipped ? false : true;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                square(g2d, x, y, isWhite);
                isWhite = !isWhite;
                x += SQUARE_WIDTH;
                if(j == 7){
                    x = 0;
                }
            }
            isWhite = !isWhite;
            y += SQUARE_WIDTH;
        }
    }

    private void drawPieces(){
        ChessPiece piece = null;
        String[][] model = position.getModel();

        int x = SQUARE_WIDTH/8;
        int y = SQUARE_WIDTH/8;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                piece = PieceUtil.notationToPiece(model[i][j]);
                if(piece != null){
                    BufferedImage icon = piece.getIcon();
                    if(i == 1 || i == 7)
                        x += 2;
                    g2d.drawImage(piece.getIcon(), null, x, y);
                }
                x += SQUARE_WIDTH;
            }
            x = SQUARE_WIDTH/8;
            y += SQUARE_WIDTH;
        }
    }

    private void square(Graphics2D g2d, int x, int y, boolean isWhite){
        g2d.setColor(isWhite ? LIGHT : DARK);
        g2d.fillRect(x,y, SQUARE_WIDTH, SQUARE_WIDTH);
    }

    public void setIsFlipped(boolean flipped){
        this.flipped = flipped;
        drawBoard();
        drawPieces();
    }
}
