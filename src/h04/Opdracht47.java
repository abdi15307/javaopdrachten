package h04;

/**
 * Created by Eigenaar on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);

        g.drawLine(400,60,270,60);
        g.drawString("lijn",330,70); /*Lijn*/

        g.drawRect(270,80,130,50);
        g.drawString("rechthoek",320,142); /*Rechthoek*/
        g.setColor(Color.magenta);
        g.fillRect(408,80,130,50); /*Rechhoek*/
        g.setColor(Color.black);
        g.drawOval(408,80,130,50);/*ellups*/
        g.drawString("Gevulde Rechthoek met ovaal",415,142);/*Rechthoek*/
        g.setColor(Color.black);
        g.drawRoundRect(270,145,130,50,10,10);
        g.drawString("Afgerond rechthoek",290,208);/*Afgerond rechthoek*/
        g.setColor(Color.magenta);
        g.fillOval(410,145,130,50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",420,208);/*gevulde ovaal*/
        g.drawOval(1100,20,100,100);
        g.drawString("cirkel",1135,140);/*Cirkel*/
        g.drawOval(580,70,120,80);
        g.setColor(Color.magenta);
        g.fillArc(580,70,120,80,90,45);
        g.setColor(Color.black);
        g.drawString("taartpunt met ovaal eromheen",600,155);/*taartpunt met ovaal eromheen*/











    }
}