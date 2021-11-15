package board;

import model.ChessPosition;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class ChessBoardView extends JFrame {

    private static final int SIDE_WIDTH = 1024;
    private static final Color DARK = new Color(87, 58, 46);
    private static final Color LIGHT = new Color(138, 120, 93);

    private boolean isFlipped = false;
    private static ChessPosition position = new ChessPosition();
    private static Graphics2D g2d = null;

    public ChessBoardView(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SIDE_WIDTH, SIDE_WIDTH);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        g2d = (Graphics2D) g;
        drawBoard(isFlipped);
        drawPieces(position, isFlipped);
    }

    private void drawBoard(boolean flipped){

        int eighth_width = (SIDE_WIDTH / 8);
        int x = 0;
        int y = 0;
        boolean isWhite = flipped ? false : true;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                square(g2d, x, y, eighth_width, isWhite);
                isWhite = !isWhite;
                x += eighth_width;
                if(j == 7){
                    x = 0;
                }
            }
            isWhite = !isWhite;
            y += eighth_width;
        }

    }

    private void drawPieces(ChessPosition position, boolean isFlipped){

    }

    private void square(Graphics2D g2d, int x, int y, int eighth_width, boolean isWhite){
        g2d.setColor(isWhite ? LIGHT : DARK);
        g2d.fillRect(x,y, eighth_width, eighth_width);
    }

    public void setIsFlipped(boolean isFlipped){
        this.isFlipped = isFlipped;
    }
}
