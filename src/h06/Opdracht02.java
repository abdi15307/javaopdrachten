package h06;



/**
 * Created by Eigenaar on 19-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht02 extends Applet {
    int minuut;
    int uur;
    int dag;
    int jaar;




    public void init() {
        minuut =                60;
        uur =           minuut* 60;
        dag =           uur *  24;
        jaar =          dag * 365;

    }

    public void paint(Graphics g) {
        g.drawString("aantal seconden in een uur is: "+uur, 60, 20);
        g.drawString("aantal seconden op een dag : " + dag,60, 40);
        g.drawString("aantal seconden op een jaar: " + jaar, 60, 60);

    }
}