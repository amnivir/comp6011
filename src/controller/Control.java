/**
 * 
 */
package controller;

import model.Model;
import view.Window;

/**
 * @author eshinig
 *
 */
public class Control
{

    private Model model;
    private Window window;

    public Control(Model model, Window window)
    {
        this.model = model;
        this.window = window;
        this.window.start(this.model.getDeck_1(),this.model.getDeck_2());
    }
}
