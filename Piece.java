import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Piece extends JLabel implements MouseListener {
    private ImageIcon image;
    private boolean isOrange;

    private boolean pressed;
    public boolean isPressed() {
        return pressed;
    }
    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }
    public void setImage(ImageIcon image){
        this.image = image;
    }
    public boolean isOrange() {
        return isOrange;
    }

    public void setOrange(boolean orange) {
        isOrange = orange;
    }

    public ImageIcon getImage() {
        return image;
    }

    /**
     * Sets image of the piece takes 2 images one for each colour piece
     * @param orangeImage Orange version of piece
     * @param yellowImage Yellow version of piece
     */
    public void setImage(ImageIcon orangeImage,ImageIcon yellowImage) {
        if(isOrange()){
            setIcon(orangeImage);
        } else {
            setIcon(yellowImage);
        }


    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        setPressed(true);
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}











