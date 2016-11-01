package h11;


/**
 * Created by Eigenaar on 26-10-2016.
 */
import java.applet.Applet;
import java.awt.Graphics;
public class Opdracht5 extends Applet{

    public void paint(Graphics g)
    {
        int teller = 1;
        int x = 0, y = 0;
        while(teller <13){
            x+= 60;
            while(teller <5){
                teller++;
                x+=25;
                y+=25;
                g.drawRect(x,y,25,25);
            }

        }


    }
}