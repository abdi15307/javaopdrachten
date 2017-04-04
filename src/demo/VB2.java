package demo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Eigenaar on 7-10-2016.
 */
public class VB2 extends Applet {
    TextField vak1;
    TextField vak2;
    Label label;
    String tekst, s, m, tekst2,dagen;
    int maand;
    int jaartal;

    public void init() {
        vak1 = new TextField("", 20);
        vak2 = new TextField("", 20);
        label = new Label("typ een jaartal en maand nummer ");
        vak1.addActionListener(new Vaklistner());
        vak2.addActionListener(new TekstvakListener());
        add(label);
        add(vak1);
        add(vak2);
        tekst = "";
        tekst2 = "";

    }

    public void paint(Graphics g) {
        g.drawString("Maand : " + tekst, 40, 80);
        g.drawString("Aantal dagen : " + dagen + " dagen", 40, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m = vak2.getText();
            jaartal = Integer.parseInt(m);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst2 = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst2 = "" + jaartal + " is geen schrikkeljaar";
            }
        }
    }


        class Vaklistner implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = vak1.getText();
                maand = Integer.parseInt(s);
                switch (maand) {
                    case 1:
                        tekst = "januari";
                        dagen = "31";
                        break;
                    case 2:
                        tekst = "februari";
                        dagen = "28";
                        break;
                    case 3:
                        tekst = "maart";
                        dagen = "31";
                        break;
                    case 4:
                        tekst = "april";
                        dagen = "30";
                        break;
                    case 5:
                        tekst = "mei";
                        dagen = "31";
                        break;
                    case 6:
                        tekst = "juni";
                        dagen = "30";
                        break;
                    case 7:
                        tekst = "juli";
                        dagen = "31";
                        break;
                    case 8:
                        tekst = "augustus";
                        dagen = "31";
                        break;
                    case 9:
                        tekst = "september";
                        dagen = "30";
                        break;
                    case 10:
                        tekst = "oktober";
                        dagen = "31";
                        break;
                    case 11:
                        tekst = "november";
                        dagen = "30";
                        break;
                    case 12:
                        tekst = "december";
                        dagen = "31";
                        break;
                    default:
                        tekst = "dit is een incorrect maand nummer";
                        dagen = null;
                        break;
                }
                    repaint();

                }
            }
        }


