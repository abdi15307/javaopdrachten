package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Eigenaar on 1-11-2016.
 */
public class Praktijkopdracht2 extends Applet {
    Button knop;
    int uitkomst, teller, x, y, tafelteller;
    String s1, s2, text;
    Boolean geklikt;

    public void init() {
        setSize(500, 800);
        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new keerlistner());
        y = 80;
        uitkomst = 0;
        teller = 0;
        tafelteller = 0;
        geklikt = false;
    }

    public void paint(Graphics g) {
        if (tafelteller <= 10) {
            if (geklikt == true) {
                while (teller < 12) {
                    teller++;
                    uitkomst = tafelteller * teller;
                    g.drawString(tafelteller + "x" + teller + "=" + uitkomst, 200, y);
                    y += 20;
                }
            }
        } else {
            geklikt = false;
            g.drawString("De tafel gaat niet hoger dan  10", 200, y);
        }
    }


    class keerlistner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt = true;
            tafelteller++;
            teller = 0;
            y = 80;
            repaint();
        }
    }

}

