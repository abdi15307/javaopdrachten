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

        g.drawRect(500,20,100,50);
        g.drawString("rechthoek",520,80); /*Rechthoek*/
        g.setColor(Color.magenta);
        g.fillRect(650,20,100,50); /*Rechhoek*/
        g.setColor(Color.black);
        g.drawOval(650,20,100,50);/*ellups*/
        g.drawString("Gevulde Rechthoek met ovaal",630,80);/*Rechthoek*/
        g.setColor(Color.black);
        g.drawRoundRect(850,20,100,50,10,10);
        g.drawString("Afgerond rechthoek",850,80);/*Afgerond rechthoek*/
        g.setColor(Color.magenta);
        g.fillOval(975,20,100,50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",985,80);/*gevulde ovaal*/
        g.drawOval(1100,20,100,100);
        g.drawString("cirkel",1135,140);/*Cirkel*/
        g.drawOval(250,175,120,80);
        g.setColor(Color.magenta);
        g.fillArc(250,175,120,80,90,45);
        g.setColor(Color.black);
        g.drawString("taartpunt met ovaal eromheen",235,275);/*taartpunt met ovaal eromheen*/











    }
}