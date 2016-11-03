package h12;

import java.applet.*;
import java.awt.*;

/**
 * Created by Eigenaar on 3-11-2016.
 */
public class Opdracht1 extends Applet {
    double salaris[];
    double gemiddelde;
    double totaal;

    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 200 * teller + 100;
            totaal =  totaal + salaris[teller];

        }
        // het gaat eerste alle salaris optellen en daarna pas delen.
        gemiddelde=totaal/salaris.length;
        // als je dit in de loop gaat zetten dan gaat eerste  1 voor 1 gemiddelde berekenen.
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);

            g.drawString("Het gemiddelde is "+ gemiddelde,120,140 );
        }
    }
}