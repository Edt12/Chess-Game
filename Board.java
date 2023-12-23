import javax.swing.*;
import java.awt.*;


/**
Chess Board Class
 **/
public class Board extends JFrame {
    /**
     * 2 Dimensional Array to Represent Chess Board
     */
    private int[][] pieceGrid = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}

    };


    /**
     * Constructor for the Board Class
     *
     * @param title  Window Title
     * @param width  Width of Board
     * @param height Height of board
     */
    public Board(String title, int width, int height) {
        setVisible(true);
        setTitle(title);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildGrid();

    }

    public void buildGrid() {
        JPanel[][] graphicsGrid= new JPanel[8][8];
        int j = 0;
        int k = 0;
        boolean kReset = false;

        for (int i = 0; i < 64;i++){
            kReset = false;
            System.out.println(i);
            JPanel panel = new JPanel();

            graphicsGrid[j][k] = panel;
            add(graphicsGrid[j][k]);
            graphicsGrid[j][k].setVisible(true);





            if (k == 7 && j != 7){
                k = 0;
                kReset = true;
                j++;
            }

            if (kReset == false) {
                k++;
            }
        }
    }

}



