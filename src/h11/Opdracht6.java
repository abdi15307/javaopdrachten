package h11;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by Eigenaar on 26-10-2016.
 */
public class Opdracht6 extends Applet {

    public void init() {
        setSize(500,800);
    }


    public void paint(Graphics g) {
        int teller = 0;
        int x=0,y=0,a=150,b=150;

        while(teller < 5) {
            teller++;
            x += 14;
            y += 14;
            a -= 7;
            b -= 7;
            g.drawOval(a,b,x,y);
        }
    }
}


