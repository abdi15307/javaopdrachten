package h02;

/**
 * Created by Eigenaar on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht02 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Said ", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Abdihaq Mohamed ", 50, 80 );
    }
}
