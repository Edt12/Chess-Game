import javax.swing.*;

public class Queen extends Piece {
    public Queen(boolean isOrange) {
        setOrange(isOrange);
        setImage((new ImageIcon("src/QueenOrange.png")), (new ImageIcon("src/QueenYellow.png")));

    }
}