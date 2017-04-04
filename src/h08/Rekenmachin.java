package h08;

/**
 * Created by Eigenaar on 3-10-2016.
 */
import java.awt.*;
import  java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Rekenmachin extends Applet {
    Button keerknop;
    Button delenknop;
    Button plusknop;
    Button minknop;
    Button wisknop;
    TextField tekstvak1;
    TextField tekstvak2;
    int getal1;
    int getal2;
    int uitkomst;


    public void init() {
        keerknop = new Button("*");
        delenknop = new Button("/");
        plusknop = new Button("+");
        minknop = new Button("-");
        wisknop = new Button("AC");
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);

        KnopListener1 kl1 = new KnopListener1();
        KnopListener2 kl2 = new KnopListener2();
        KnopListener3 kl3 = new KnopListener3();
        KnopListener4 kl4 = new KnopListener4();
        KnopListener5 kl5 = new KnopListener5();

        keerknop.addActionListener(kl1);
        delenknop.addActionListener(kl2);
        plusknop.addActionListener(kl3);
        minknop.addActionListener(kl4);
        wisknop.addActionListener(kl5);

        //layout
        add(tekstvak1);
        add(tekstvak2);
        add(keerknop);
        add(delenknop);
        add(plusknop);
        add(minknop);
        add(wisknop);

    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            uitkomst=getal1*getal2;
            tekstvak1.setText(""+uitkomst);
            tekstvak2.setText("");
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            uitkomst=getal1/getal2;
            tekstvak1.setText(""+uitkomst);
            tekstvak2.setText("");
        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            uitkomst=getal1+getal2;
            tekstvak1.setText(""+uitkomst);
            tekstvak2.setText("");
        }
    }

    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            uitkomst=getal1-getal2;
            tekstvak1.setText(""+uitkomst);
            tekstvak2.setText("");
        }
    }

    class KnopListener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            tekstvak1.setText("");
            tekstvak2.setText("");

        }
    }

}