package h11;

/**
 * Created by Eigenaar on 26-10-2016.
 */
import java.applet.Applet;
import java.awt.Graphics;



public class Opdracht2 extends Applet{
    public void paint(Graphics g)
    {
        int i = 20;
        int x = 50;
        int y = 50;
        while (i >9)
        {
            g.drawString("" +i, x, y);
            y += 20;
            i--;
        }
    }
}