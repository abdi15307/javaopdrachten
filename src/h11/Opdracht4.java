package h11;

/**
 * Created by Eigenaar on 26-10-2016.
 */
import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht4 extends Applet
{
    public void paint(Graphics g)
    {
        int teller = 1, drie = 3 , uitslag = 0 ;
        int x = 1;
        while(teller <13){
            x+= 60;
            uitslag = drie*teller;
            g.drawString(drie+"x"+teller+"="+uitslag,100,x);
            teller++;
        }


    }
}