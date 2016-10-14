package Toest;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dewereldtijden extends Applet {
    private int TijdinLondon;
    private int TijdinTokyo;
    private int TijdinNewyork;
    private int TijdinSydney;
    private int invoer;
    private TextField tesktvak;

    public void init() {
        Label label = new Label("Voer een uur in");
        tesktvak = new TextField("", 15);
        Button knop = new Button("Toon Tijden");
        Listener1 Knop = new Listener1();
        knop.addActionListener(Knop);
        add(label);
        add(tesktvak);
        add(knop);
    }
    public void paint(Graphics g) {
        int x = 20;
        int y = 70;
        if (invoer >= 0 && invoer < 24) {
            g.drawString("London: " + TijdinLondon + ":00", x, y);
            y += 20;
            g.drawString("Tokyo: " + TijdinTokyo + ":00", x, y);
            y += 20;
            g.drawString("Newyork: " + TijdinNewyork + ":00", x, y);
            y += 20;
            g.drawString("Sydney: " + TijdinSydney + ":00", x, y);

        } else {
            g.drawString("Ongeldige invoer!!", x, y);
        }
    }
    private class Listener1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tesktvak.getText();
            invoer = Integer.parseInt(s);
            TijdinSydney = Integer.parseInt(s);
            TijdinSydney = invoer + 9;

            TijdinLondon = Integer.parseInt(s);
            TijdinLondon = invoer - 1;

            TijdinTokyo = Integer.parseInt(s);
            TijdinTokyo = invoer + 7;

            TijdinNewyork = Integer.parseInt(s);
            TijdinNewyork = invoer - 6;

            if (TijdinSydney > 23) {
                TijdinSydney = TijdinSydney - 24;
            }
            if (TijdinLondon < 0) {
                TijdinLondon = TijdinLondon + 24;
            }
            if (TijdinTokyo > 23) {
                TijdinTokyo = TijdinTokyo - 24;
            }
            if (TijdinNewyork < 0) {
                TijdinNewyork = TijdinNewyork + 24;
            }
            repaint();

        }
    }
}
