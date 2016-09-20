package h05;

/**
 * Created by Eigenaar on 15-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    Color zwart; /*plek*/
    Color vul;
    int breedte;
    int hoogte;
    int x;
    int xx;
    int y;
    int yy;
    int br;
    int ho;
    int margin;


    @Override
    public void init() {
        super.init();
        zwart = new Color(0, 0, 0);
        vul = Color.magenta;
        breedte = 370;
        hoogte = 150;
        margin=    50;
        xx=         0;
        yy=         45;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(zwart);
        x=  margin;
        y=  margin;
        g.drawLine(x, y, x + breedte, y);
        int midden= (x+breedte)/2;
        g.drawString("lijn",midden,y+15); /*lijn*/
        y=y+margin;
        g.drawRect(x, y, breedte, hoogte);
        x=x+breedte+margin;
        g.setColor(Color.magenta);
        g.fillRect(x, y, breedte, hoogte);
        g.setColor(zwart);
        g.drawOval(x, y, breedte, hoogte);
        x=x+breedte+margin;
        g.drawOval(x,y,breedte,hoogte);
        g.setColor(vul);
        g.fillArc(x,y,breedte,hoogte,xx,yy);
        g.setColor(zwart);
        x=margin;
        y=margin;
        y=y+margin+hoogte+margin;
        g.drawRoundRect(x,y,breedte,hoogte,30,30);
        g.setColor(vul);
        x=x+breedte+margin;
        g.fillOval(x,y,breedte,hoogte);
        x= x + breedte+(breedte/4) + margin;
        g.setColor(zwart);

        g.drawOval(x,y,hoogte,hoogte);






    }
}