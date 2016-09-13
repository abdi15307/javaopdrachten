package h04;

/**
 * Created by Eigenaar on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.drawLine (180, 100, 240, 60);
        g.drawLine (240, 60, 300, 100);
        g.drawLine (180, 100, 300,100);
    }
}
