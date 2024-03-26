import javax.swing.*;
import java.awt.*;

/**
Chess Board Class
 **/
public class Board extends JFrame {
    private final BlankSquare [][] blankSquares = new BlankSquare[8][8];
    private final Piece [][] pieces = new Piece[8][8];

    /**
     * Gets all pieces on the board
     * @return 2-dimensional list of all pieces on board
     */
    public Piece[][] getPieces(){
        return pieces;
    }
    public BlankSquare[][] getBlankSquares() {
        return blankSquares;
    }

    /**
     *Gets a specificied piece from board
     * @param width x axis of piece in 2 dimensional pieces array
     * @param height y axis of piece in 2 dimensional pieces array
     * @return Piece
     */
    public Piece getPiece(int width , int height){
        return pieces[width][height];
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

                    blankSquares[j][k] = new BlankSquare(Color.BLACK);
                } else {

                    blankSquares[j][k] = new BlankSquare(Color.WHITE);
                }

            } else {
                if (j % 2 == 0) {

                    blankSquares[j][k] = new BlankSquare(Color.WHITE);
                } else {

                    blankSquares[j][k] = new BlankSquare(Color.BLACK);
                }
            }

            add(blankSquares[j][k]);


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
        pieces[0][1] = new Knight(false);
        pieces[0][6] = new Knight(false);
        pieces[7][1] = new Knight(true);
        pieces[7][6] = new Knight(true);


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
                blankSquares[k][j].removeAll();
                blankSquares[k][j].add(pieces[k][j]);
            }
            if (j == 7) {
                k++;
                j = 0;
                reset = true;
            }
            if (!reset) {
                j++;
            }

        }
    }

    /**
     * Move pieces method
      */
    public void movePieces(int[] coordsArray){
        System.out.println("Moving Pieces Start");
        int yCoordOne = coordsArray[0];
        int yCoordTwo = coordsArray[2];
        int xCoordOne = coordsArray[1];
        int xCoordTwo = coordsArray[3];

        Piece temp = pieces[yCoordOne][xCoordOne];
        pieces[yCoordOne][xCoordOne] = null;
        pieces[yCoordTwo][xCoordTwo] = temp;
        addPiecesToScreen();
        repaint();
    }

}


