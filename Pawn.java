import javax.swing.*;

public class Pawn extends Piece{
    public Pawn(boolean isOrange){
        setOrange(isOrange);
        setImage((new ImageIcon("src/PawnOrange.png")), new ImageIcon("src/PawnYellow.png"));

    }
    
}