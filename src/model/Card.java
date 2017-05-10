/**
 *
 */
package model;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

/**
 * @author eshinig
 *
 */
public class Card {
    //=================================================================== fields
    private ImageIcon _image;
    private int       _x;
    private int       _y;
    /*
     * A card is either for a player or computer
     */
    private boolean playersCard = false;
    //============================================================== constructor
    public Card(ImageIcon image)
    {
        _image = image;
    }

    //=================================================================== moveTo
    public void moveTo(int x, int y) {
        _x = x;
        _y = y;
    }

    //================================================================= contains
    public boolean contains(int x, int y) {
        return (x > _x && x < (_x + getWidth()) &&
                y > _y && y < (_y + getHeight()));
    }

    //================================================================= getWidth
    public int getWidth() {
        return _image.getIconWidth();
    }

    //================================================================ getHeight
    public int getHeight() {
        return _image.getIconHeight();
    }

    //===================================================================== getX
    public int getX() {
        return _x;
    }

    //===================================================================== getY
    public int getY() {
        return _x;
    }

    //===================================================================== draw
    public void draw(Graphics g, Component c) {
        _image.paintIcon(c, g, _x, _y);
    }
}