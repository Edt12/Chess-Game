import javax.swing.*;

public class Pawn extends Piece {
    public Pawn(boolean isOrange) {
        setOrange(isOrange);
        setImage((new ImageIcon("src/PawnOrange.png")), new ImageIcon("src/PawnYellow.png"));
        addMouseListener(this);
    }

    /**
     * Overrides check movement command to make sure pawn can only move within rules
     *
     * @param movementCoords Coordinates of where pawn would move to
     * @return True if within rules false if not
     */
    @Override
    public boolean checkMovement(int[] movementCoords) {
        System.out.println("Pawn Check");
        int x1 = movementCoords[0];
        int y1 = movementCoords[1];
        int x2 = movementCoords[2];
        int y2 = movementCoords[3];
        if (!isOrange()) {
            if (y1 == y2
                    && (x2 - x1 == 1 && x2 > x1)) {
                return true;
            }
        } else if (isOrange()) {
            if (y1 == y2 && (x2 - x1 == -1 && x2 < x1)) {
                return true;
            }
        }
        return false;
    }
}

