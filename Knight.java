import javax.swing.*;

public class Knight extends Piece{
    public Knight(boolean isOrange){
        setOrange(isOrange);
        setImage((new ImageIcon("src/RookOrange.png")),(new ImageIcon("src/RookYellow.png")));
        addMouseListener(this);
    }
    @Override
    public boolean checkMovement(int[] movementCoords){
        int x1 =movementCoords[0];
        int y1 = movementCoords[1];
        int x2 = movementCoords[2];
        int y2 = movementCoords[3];
        if(x1 - x2 == 2 && y1 - y2 == 1||
            x1 - x2 == 2 && y1 - y2 == -1||
            x1 - x2 == -2 && x1 - y2 == -1||
            x1 - x2 == -2 && y1 - y2 == 1){
            return true;

        }else {

            return false;

        }

    }
}
