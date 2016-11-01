package h11;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Said on 31-10-2016.
 */
public class Praktijkopdracht1 extends Applet {
    TextField tekstvak;
    Button knop;
    int invoer, uitkomst, teller, x, y;
    String s1;
    Boolean geklikt;

    public void init() {
        setSize(500, 800);

        tekstvak = new TextField("", 5);
        knop = new Button("Ok");
        add(tekstvak);
        add(knop);
        knop.addActionListener(new keer());
        y = 60;
        invoer = 0;
       uitkomst = 0;
        teller = 0;
        geklikt = false;
    }

    public void paint(Graphics g) {
        if(geklikt = true){
            while (teller < 12) {
                teller++;
                uitkomst = invoer * teller;
                g.drawString(invoer + "x" + teller + "=" + uitkomst, 200, y);
                y += 20;
            }
        }
    }

    class keer implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak.getText();
            invoer = Integer.parseInt(s1);
            geklikt = true;
            teller = 0;
            y = 80;
            repaint();
        }
    }

}
