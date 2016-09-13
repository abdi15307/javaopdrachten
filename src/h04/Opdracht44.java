package h04;

/**
 * Created by Eigenaar on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht44 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.red);
      g.drawLine(20,15,20,220);
        g.drawLine(20,220,140,220);
        g.drawString("100",0,20);
        g.drawString("80",0,60);
        g.drawString("60",0,100);
        g.drawString("40",0,140);
        g.drawString("20",0,180);
        g.drawString("0",0,220);
        g.setColor(Color.green);
        g.drawRect(35, 130, 20, 90);
        g.fillRect(35, 130, 20, 90);
        g.setColor(Color.white);
        g.drawRect(75, 20, 20, 200);
        g.fillRect(75, 20, 20, 200);
        g.setColor(Color.blue);
        g.drawRect(115, 50, 20, 170);
        g.fillRect(115, 50, 20, 170);
        g.drawString("H",120,240);
        g.drawString("J",80,240);
        g.drawString("V",40,240);

    }
}