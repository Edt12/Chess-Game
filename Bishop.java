import javax.swing.*;

public class Bishop extends Piece{
    public Bishop(boolean isOrange){
        setOrange(isOrange);
        setImage((new ImageIcon("src/BishopOrange.png")),(new ImageIcon("src/BishopYellow.png")));
        
    }
}
