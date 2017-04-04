package demo;

/**
 * Created by Eigenaar on 6-10-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht105 extends Applet {
    TextField tekstveld;
    Button knop;
    double total;
    double invoer;
    int aantalcijfers;
    double gemiddelde;

    @Override

    public void init() {
        super.init();
        tekstveld = new TextField("", 5);
        add(tekstveld);
        knop = new Button("Check");
        add (knop);
        Knoplistner kl = new Knoplistner();
        knop.addActionListener(kl);


    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        int x = 58;
        int y = 88;

        if (invoer <5.5) {
            g.drawString("Het cijfer is onvoldoende ", x, y);
        } else{
            g.drawString("Het cijfer is voldoende ", x, y);
        }
            y = y + 20;
            g.drawString("Gemiddeld"+gemiddelde, x, y);

    }

    class Knoplistner implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);
            total= total + invoer;
            aantalcijfers++;
            gemiddelde =  total/aantalcijfers;
            repaint();

        }
    }
}
