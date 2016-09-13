package h04;

/**
 * Created by Eigenaar on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht03 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.red);
        g.drawRect(105, 120, 50, 25);
        g.fillRect(105, 120, 50, 25);
        g.setColor(Color.white);
        g.drawRect(105, 145, 50, 25);
        g.fillRect(105, 145, 50, 25);
        g.setColor(Color.blue);
        g.drawRect(105, 165, 50, 25);
        g.fillRect(105, 165, 50, 25);
        g.setColor(Color.black);
        g.drawRect(100, 120, 5, 180);
        g.fillRect(100, 120, 5, 180);




    }
}