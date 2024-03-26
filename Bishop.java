import javax.swing.*;

public class Bishop extends Piece {
    public Bishop(boolean isOrange) {
        setOrange(isOrange);
        setImage((new ImageIcon("src/BishopOrange.png")), (new ImageIcon("src/BishopYellow.png")));
        addMouseListener(this);
    }

    @Override
    public boolean checkMovement(int[] movementCoords) {
        int x1 =movementCoords[0];
        int y1 = movementCoords[1];
        int x2 = movementCoords[2];
        int y2 = movementCoords[3];

        if (y1 != y2 && x1 != x2
                && x1 - x2 == y1 -y2||
                x1 - x2 ==y1 - y2 * -1||
                (x1 - x2) * -1 == (y1 - y2)){
            return true;
        }else {
            return false;
        }

    }
}

