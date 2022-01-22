package pieces;

import board.ChessPosition;
import enums.PieceColor;
import enums.PieceType;
import org.apache.commons.lang3.StringUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

public class ChessPiece {

    private PieceColor pieceColor;
    private PieceType pieceType;

    public ChessPiece(){
        this(PieceColor.NONE, PieceType.NONE);
    }

    public ChessPiece(PieceColor pieceColor, PieceType pieceType){
        this.pieceColor = pieceColor;
        this.pieceType = pieceType;
    }

    public void setPieceColor(PieceColor pieceColor){
        this.pieceColor = pieceColor;
    }
    public PieceColor getPieceColor(){
        return pieceColor;
    }

    public void setPieceType(PieceType pieceType){
        this.pieceType = pieceType;
    }
    public PieceType getPieceType(){
        return pieceType;
    }

    public BufferedImage getIcon(){
        String filename = pieceColor.colorChar + "_" + pieceType.typeChar + ".png";
        URL url = this.getClass().getResource("/images/" + filename);

//        this should only happen if the "piece" is an empty space
        if(StringUtils.isEmpty(pieceColor.colorChar)){
            url = null;
        }

        try{
            if(url != null){
                return ImageIO.read(url);
            }
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<String[]> getAvailableMoves(int file, int rank, ChessPosition position){
        return null;
    }
}
