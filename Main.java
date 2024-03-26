import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Board board = new Board("Chess Game", 1000, 1000);
        //Main Event Loop
        while (true) {

            int [] movementCoords = new int[4];
            Piece[][] pieces = board.getPieces();
            //Resets all values in pieces to false before checks
            int p = 0;
            int q = 0;
            for (int i = 0; i < 64; i++) {
                boolean reset = false;
                if (pieces[q][p] != null){
                    pieces[q][p].setPressed(false);
                }

                if (p == 7) {
                    q++;
                    p = 0;
                    reset = true;
                }
                if (!reset) {
                    p++;
                }

            }
            //Checks to see when a piece has been pressed and adds its coordinates to array
            int j = 0;
            int k = 0;
            boolean piecePressed = false;
            while (!piecePressed) {
                boolean reset = false;
                if (pieces[j][k] != null) {
                    if (pieces[j][k].isPressed()) {
                        pieces[j][k].setPressed(false);
                        movementCoords[0] = j;
                        movementCoords[1] = k;
                        piecePressed = true;
                        System.out.println("piece break");
                    }

                }

                if (j == 7) {
                    k++;
                    j = 0;
                    reset = true;
                }
                if (!reset) {
                    j++;
                }
                if (j == 7 && k == 7) {
                    j = 0;
                    k = 0;
                }

            }

            BlankSquare[][] blankSquares = board.getBlankSquares();
            //Resets all values in blankSquares to false before checks begin
            int x = 0;
            int y = 0;
            for (int i = 0; i < 64; i++) {
                boolean reset = false;
                blankSquares[y][x].setPressed(false);
                if (x == 7) {
                    y++;
                    x = 0;
                    reset = true;
                }
                if (!reset) {
                    x++;
                }

            }
            //Loop checks if one has been pressed and adds its coordinates on grid to array
            boolean squarePressed = false;
            int l = 0;
            int m = 0;
            while (!squarePressed) {
                boolean reset = false;
                if (blankSquares[l][m].isPressed()) {
                    blankSquares[l][m].setPressed(false);
                    movementCoords[2] = l;
                    movementCoords[3] = m;
                    int yOne = movementCoords[0];
                    int xOne = movementCoords[1];

                    if (pieces[yOne][xOne].checkMovement(movementCoords)) {
                        squarePressed = true;
                        System.out.println("Valid Move");
                    }
                }

                if (l == 7) {
                    m++;
                    l = 0;
                    reset = true;
                }
                if (!reset) {
                    l++;
                }
                if (l == 7 && m == 7) {
                    l = 0;
                    m = 0;
                }

            }
            //Checks if multiple pieces on same square
            board.movePieces(movementCoords);
            System.out.println("Moved");



        }
    }
}