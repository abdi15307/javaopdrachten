package h06;

/**
 * Created by Eigenaar on 20-9-2016.
 */
import java.awt.*;
import java.applet.*;
public class Opdracht04 extends  Applet{
    double a , b , c ,d,e, gemiddeld;
    double Gemiddeld;
    int geheel;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        geheel = 1;

        gemiddeld = (a + b + c )/ d*e;
        geheel = (int) gemiddeld;
        gemiddeld = geheel/e;


    }
    public void paint ( Graphics g){
        g.drawString("de gemiddeld is:"+ gemiddeld,20,20);

    }

}
