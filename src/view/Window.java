/**
 *
 */
package view;

import javax.swing.JFrame;

import model.Card;

/**
 * @author eshinig
 *
 */
public class Window extends JFrame
{
    /**
     * @param args
     */
    public void start(Card[] deck1,Card[] deck2)
    {

        this.setTitle("PokemonGoTCG");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new Table(deck1));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public Window() {
    }

}
