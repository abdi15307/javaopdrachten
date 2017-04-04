package demo;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Eigenaar on 14-9-2016.
 */
public class Variabellen extends Applet {
    Color achtergrond;
    Color tekst;
    int getal1;
    int getal2;
    Font mijnFont;

    @Override
    public void init() {
        super.init();
        achtergrond= new Color(255,204,204);
        tekst= new Color(0,32,129);
        getal1=20;
        getal2=30;
        setBackground(achtergrond);
        mijnFont=new Font("TimesRoman", Font.BOLD, 18);

    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(tekst);
        g.setFont(mijnFont);
        int x=50;
        int y=50;
        g.drawString("som is:"+( getal1+getal2),x,y);
        y=y+20;
        g.drawString("som is:"+( getal1*getal2),x,y);


    }



}
