import javax.swing.*;

public class Castle extends Piece{
    public Castle(boolean isOrange){
        setOrange(isOrange);
        setImage((new ImageIcon("src/CastleOrange.png")),(new ImageIcon("src/CastleYellow.png")));
        addMouseListener(this);
    }

    /**
     * checks to see if a certain move is valid
     * @param movementCoords Integer array containing coordinates of pieces current location
     *  and location it will move to
     * @return true if move is valid false if it is invalid
     */
    @Override
    public boolean checkMovement(int[] movementCoords){
        int y1 = movementCoords[1];
        int y2 = movementCoords[3];
        if(y1 == y2){
            return true;
        }else {
            return false;
        }
    }


}
