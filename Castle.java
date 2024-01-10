import javax.swing.*;

public class Castle extends Piece{
    public Castle(boolean isOrange){
        setOrange(isOrange);
        setImage((new ImageIcon("src/CastleOrange.png")),(new ImageIcon("src/CastleYellow.png")));
        
    }
}
