package h06;

/**
 * Created by Eigenaar on 20-9-2016.
 */
import java.awt.*;
import  java.applet.*;
public class Opdracht03 extends Applet {
    int A ;
    int B ;
    int uitkomst;

    public void init() {
        A = 2147483647;
        B = 10;
        uitkomst = A + B;
    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }

}
