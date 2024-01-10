import javax.swing.*;
import java.awt.*;

public class BlankSquare extends JPanel {

    private Color colour;
    BlankSquare(Color colour){
        setVisible(true);
        setOpaque(true);
        setColour(colour);
        setBackground(this.colour);

    }
    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

}
