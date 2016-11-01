package h11;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by Eigenaar on 26-10-2016.
 */
public class Opdracht7 extends Applet {

    public void init() {
        setSize(500,800);
    }


    public void paint(Graphics g) {
        int teller = 0;
        int x=0,y=0,a=400,b=400;

        while(teller < 50) {
            teller++;
            x += 12;
            y += 12;
            a -= 6;
            b -= 6;
            g.drawOval(a,b,x,y);
        }
    }
}