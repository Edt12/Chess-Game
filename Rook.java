import javax.swing.*;

public class Rook extends Piece{
    public Rook(boolean isOrange){
        setOrange(isOrange);
        setImage((new ImageIcon("src/RookOrange.png")),(new ImageIcon("src/RookYellow.png")));
        
    }
}
