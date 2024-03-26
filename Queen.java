import javax.swing.*;

public class Queen extends Piece {
    public Queen(boolean isOrange) {
        setOrange(isOrange);
        setImage((new ImageIcon("src/QueenOrange.png")), (new ImageIcon("src/QueenYellow.png")));
        addMouseListener(this);
    }

    @Override
    public boolean checkMovement(int[] movementCoords){
        int x1 =movementCoords[0];
        int y1 = movementCoords[1];
        int x2 = movementCoords[2];
        int y2 = movementCoords[3];

        if (x1 - x2 == 0 || y1 - y2 == 0
            || x1 - x1 == 1 && y1 - y2 == 1
            || x1 - x2 == -1 && y1 - y2 == -1
            || x1 - x2 == 1 && y1 - y2 == -1
            || x1 - x2 == -1 && y1 - y2 == 1
            || y1 != y2 && x1 != x2
              && x1 - x2 == y1 -y2||
              x1 - x2 ==y1 - y2 * -1||
              (x1 - x2) * -1 == (y1 - y2)){

            return true;
        } else {
            return false;
        }

    }
}