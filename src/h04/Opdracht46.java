package h04;

/**
 * Created by Eigenaar on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht46 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

       g.fillRect(35,50,70,170);
        g.setColor(Color.red);
        g.fillOval(35,50 , 70, 50);
        g.setColor(Color.orange);
        g.fillOval(35,100 , 70, 50);
        g.setColor(Color.green);
        g.fillOval(35,150 , 70, 50);






    }
}