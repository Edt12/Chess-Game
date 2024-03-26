import javax.swing.*;

public class King extends Piece {
    public King(boolean isOrange) {
        setOrange(isOrange);
        setImage((new ImageIcon("src/KingOrange.png")), (new ImageIcon("src/KingYellow.png")));
        addMouseListener(this);
    }
    @Override
    public boolean checkMovement(int[] movementCoords){
        int x1 =movementCoords[0];
        int y1 = movementCoords[1];
        int x2 = movementCoords[2];
        int y2 = movementCoords[3];
        if(x1 - x2 == 1 && y1 - y2 == 0||
            x1-x2 == -1 && y1 - y2 == 0||
            y1 - y2 == 1 && x1 - x2 == 0
            || y1 - y2 == -1 && x1-x2 == 0
            || y1 - y2 == 1 && x1-x2 == 1
            || y1 - y2 == -1 && x1 - x2 == 1
            || y1 - y2 == 1 && x1 - x2 == -1){

            return true;

        }else {
            return false;
        }

    }
}