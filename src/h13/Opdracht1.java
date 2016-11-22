package h13;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Eigenaar on 16-11-2016.
 */
public class Opdracht1 extends Applet {
    Button knop1, knop2, knop3, knop4, knop5;
    String schermtekst;
    Color rood,
            geel,
            blauw,
            orange,
            groen;


    public void init() {
        schermtekst = "";
        rood = Color.RED;
        geel = Color.yellow;
        blauw = Color.blue;
        orange = Color.orange;
        groen = Color.GREEN;

        knop1 = new Button("Rood");
        knop1.addActionListener(new knopListener1());
        add(knop1);
        knop2 = new Button("Geel");
        knop2.addActionListener(new knopListener2());
        add(knop2);
        knop3 = new Button("Blauw");
        knop3.addActionListener(new knopListener3());
        add(knop3);
        knop4 = new Button("Orange");
        knop4.addActionListener(new knopListener4());
        add(knop4);
        knop5 = new Button("Groen");
        knop5 .addActionListener(new knopListener5());
        add(knop5);
    }

    public void paint(Graphics g) {
        knop1.setBackground(rood);
        knop2.setBackground(geel);
        knop3.setBackground(blauw);
        knop4.setBackground(orange);
        knop5.setBackground(groen);
        g.drawString(" " + schermtekst, 100, 60);
    }


    class knopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "De kleur is rood";

            repaint();
        }
    }

        class knopListener2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                schermtekst = "De kleur is geel";

                repaint();
            }
        }

            class knopListener3 implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    schermtekst = "De kleur is blauw";



                    repaint();

                }
            }

                class knopListener4 implements ActionListener {
                    public void actionPerformed(ActionEvent e) {
                        schermtekst = "De kleur is orange";

                        repaint();
                    }
                }

                    class knopListener5 implements ActionListener {
                        public void actionPerformed(ActionEvent e) {
                            schermtekst = "De kleur is groen";

                            repaint();
                        }
                    }
                }



