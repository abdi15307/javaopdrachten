package h11; /**
 * Created by Eigenaar on 26-10-2016.
 */

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht3 extends Applet {
    public void paint(Graphics g) {
        int x = 40;
        int getel1 =1;
        int getal2 =1;
        int getal3 =0;

   g.drawString(""+ getal2,x,80);
        while (getel1 < 89) {
        x+=20;
        getel1= getal3+getal2;
       getal3 = getal2;
        getal2 = getel1;
        g.drawString(""+getel1,x,80);
    }
}
}