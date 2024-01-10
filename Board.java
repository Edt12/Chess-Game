import javax.swing.*;
import java.awt.*;

/**
Chess Board Class
 **/
public class Board extends JFrame {
    private final JPanel[][] graphicsGrid = new JPanel[8][8];
    private final Piece [][] pieces = new Piece[8][8];

    public Piece[][] getPieces(){
        return pieces;
    }
    /**
     * Constructor for the Board Class
     * @param title  Window Title
     * @param width  Width of Board
     * @param height Height of board
     */
    public Board(String title, int width, int height) {
        setVisible(true);
        setTitle(title);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));
        buildGrid();
        createPieces();
        addPiecesToScreen();
    }

    /**
     * Creates an Array of BlankSquare's to visually represent chessboard and adds to JFrame
     */
    public void buildGrid() {
        int j = 0;
        int k = 0;
        boolean kReset = false;

        for (int i = 0; i < 64; i++) {
            kReset = false;
            System.out.println(i);


            if (k % 2 == 0) {
                if (j % 2 == 0) {

                    graphicsGrid[j][k] = new BlankSquare(Color.BLACK);
                } else {

                    graphicsGrid[j][k] = new BlankSquare(Color.WHITE);
                }

            } else {
                if (j % 2 == 0) {

                    graphicsGrid[j][k] = new BlankSquare(Color.WHITE);
                } else {

                    graphicsGrid[j][k] = new BlankSquare(Color.BLACK);
                }
            }

            add(graphicsGrid[j][k]);


            if (k == 7 && j != 7) {
                k = 0;
                kReset = true;
                j++;
            }

            if (!kReset) {
                k++;
            }
        }
    }

    /**
     * Adds Pieces to an array representing their layout on the board
     */
    public void createPieces() {
        //Adding Pawns
        for (int i = 0; i <= 7; i++) {
            pieces[1][i] = new Pawn(false);
            pieces[6][i] = new Pawn(true);
        }

        //Adding Castles
        pieces[0][0] = new Castle(false);
        pieces[0][7] = new Castle(false);
        pieces[7][0] = new Castle(true);
        pieces[7][7] = new Castle(true);

        //Adding Kings
        pieces[0][4] = new King(false);
        pieces[7][4] = new King(true);

        //Adding Queens
        pieces[0][3] = new Queen(false);
        pieces[7][3] = new Queen(true);

        //Adding Bishops
        pieces[0][2] = new Bishop(false);
        pieces[0][5] = new Bishop(false);
        pieces[7][2] = new Bishop(true);
        pieces[7][5] = new Bishop(true);

        //Adding Rooks
        pieces[0][1] = new Rook(false);
        pieces[0][6] = new Rook(false);
        pieces[7][1] = new Rook(true);
        pieces[7][6] = new Rook(true);


    }

    /**
     * Adds images from pieces to the screen
     **/
    public void addPiecesToScreen() {
        int j = 0;
        int k = 0;

        for (int i = 0; i < 64; i++) {
            boolean reset = false;
            if (pieces[k][j] != null) {
                graphicsGrid[k][j].add(pieces[k][j]);
            }
            if (j == 7) {
                k++;
                j = 0;
                reset = true;
            }
            if (!reset) {
                j++;
            }

            System.out.println(k + "width");
            System.out.println(j + "length");
        }

    }

    /**
     * Move pieces method
      */
    public void movePieces(int xCoordOne,int yCoordOne , int xCoordTwo, int yCoordTwo){
      Piece temp = pieces[xCoordOne][yCoordOne];
      pieces[xCoordOne][yCoordOne] = null;
      pieces[xCoordTwo][yCoordTwo] = temp;
      addPiecesToScreen();
   }

}




