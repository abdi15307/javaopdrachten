package demo;

/**
 * Created by Eigenaar on 1-12-2016.
 */
import java.awt.*;
import java.applet.*;

public class Beslissingen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        g.drawString("" + 4 + " is groter dan "+ 5 + " en kleiner dan " +
                8  + ": " +(4 < 5 || 6 < 8), 50, 60 );
        g.drawString("" + 6 + " is groter dan "+ 5 + " en groter dan " +
                8 + ": " + (6 > 5 && 6 > 8), 50, 80 );
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en groter dan " +
                8 + ": " + (6 <  5 && 6 > 8), 50, 100 );
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en kleiner dan " +
                8 + ": " + (6 < 5 && 6 < 8), 50, 120 );
    }
}