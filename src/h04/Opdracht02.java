package h04;

/**
 * Created by Eigenaar on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht02 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);
        g.drawRect(105, 120, 180, 60);
        g.drawLine (105, 120, 220, 60);
        g.drawLine (286, 120, 220, 58);
        g.drawLine (600, 60, 220, 58);
        g.drawLine (700, 115, 220, 120);
        g.drawLine (700, 115, 600, 58);
        g.drawRect(285, 118, 420, 60);
        g.drawRect(200, 150, 20, 30);
        g.drawRect(600, 140, 30, 15);


    }
}