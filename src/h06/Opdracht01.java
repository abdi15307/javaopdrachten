package h06;

/**
 * Created by Eigenaar on 19-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht01 extends Applet{
    int A ;
    int B ;
    int uitkomst;

    public void init() {
        A =             113;
        B =                4;

        uitkomst = A / B;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("Said: " + uitkomst,60, 40);
        g.drawString("Ali: " + uitkomst, 60, 60);
        g.drawString("Jan: " + uitkomst, 60, 80);
        g.drawString("Jeannatte: " + uitkomst, 60, 100);
    }
}

