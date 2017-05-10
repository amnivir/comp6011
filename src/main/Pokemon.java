/**
 * 
 */
package main;

import controller.Control;
import model.Model;
import view.*;

/**
 * @author eshinig
 *
 */
public class Pokemon
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Model model = new Model();
        Window window = new Window();
        Control control = new Control(model,window);
    }

}
